// package NicheSolv;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static int[] merged(int[] a, int[] b)
    {
        int n = a.length, m = b.length;
        int i = 0, j = 0, k = 0;
        int[] result = new int[n + m];

        while(i < n && j< m)
        {
            if(a[i] <= b[j])
            {
                result[k++] = a[i++];
            }
            else
            {
                result[k++] = b[j++];
            }
        }
        while(i < n) result[k++] = a[i++];
        while(j < m) result[k++] = b[j++];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++)
        {
            b[i] = sc.nextInt();
        }
        int[] merged = merged(a, b);
        Arrays.sort(a);
        Arrays.sort(b);
        for(int num : merged)
        {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
