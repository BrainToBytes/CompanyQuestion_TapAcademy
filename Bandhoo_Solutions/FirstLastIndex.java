import java.util.Scanner;

public class FirstLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        findFirstLast(nums, x);
    }

    public static void findFirstLast(int[] nums, int x)
    {
        int first = -1, last = -1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == x)
            {
                if(first == -1)
                {
                     first = i;
                }
               last = i;
            }
           
        }
        System.out.print(first + " " + last);
    }
}
