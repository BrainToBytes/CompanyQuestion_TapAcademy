import java.util.Scanner;

public class Anagram_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(isAnagram(str1, str2))
        {
            System.out.print("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }
        sc.close();
    }

    public static boolean isAnagram(String str1, String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length())
        {
            return false;
        }

        int[] freq = new int[256];
        for(int i=0; i<str1.length(); i++)
        {
            freq[str1.charAt(i)]++;
        }
        for(int i=0; i<str2.length(); i++)
        {
            freq[str2.charAt(i)]--;
        }
        for(int count : freq)
        {
            if(count != 0)
            {
                return false;
            }
        }
        return true;
    }
}
