import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isIsomorphic(s, t)? "true":"false");
        sc.close();
    }

    public static boolean isIsomorphic(String s, String t)
    {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(mapST.containsKey(cs) && mapST.get(cs) != ct) return false;
            if(mapTS.containsKey(ct) && mapTS.get(ct) != cs) return false;
            mapST.put(cs, ct);
            mapTS.put(ct, cs);
        }
        return true;
    }
}
