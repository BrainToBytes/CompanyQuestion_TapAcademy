
import java.util.Scanner;

public class ReverseOnlyAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = reverseOnlyAlphabets(s);
        System.out.println(result);
        sc.close();
    }

    public static String reverseOnlyAlphabets(String input)
    {
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length-1;

        while(left < right)
        {
            if(!Character.isLetter(arr[left]))
            {
                left++;
            }
            else if(!Character.isLetter(arr[right]))
            {
                right--;
            }
            else
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
