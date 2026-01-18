import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(isStrongNumber(N))
        {
            System.out.print("Strong Number");
        }
        else
        {
            System.out.print("Not a Strong Number");
        }
        sc.close();
    }

    public static boolean isStrongNumber(int N)
    {
        int original = N;
        int sum = 0;
        while(N > 0)
        {
            int digit = N % 10;
            sum += factorial(digit);
            N = N / 10;
        }
        return sum == original;
    }

    public static int factorial(int d)
    {
        int fact = 1;
        for(int i=1; i<=d; i++)
        {
            fact *= i;
        }
        return fact;
    }
}
