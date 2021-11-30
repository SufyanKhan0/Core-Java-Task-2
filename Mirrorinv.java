import java.lang.*;
import java.io.*;
import java.util.*;

public class Mirrorinv
{
  static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n=s.nextInt();
        System.out.print("Enter the array: ");
        int arr[];
        arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
