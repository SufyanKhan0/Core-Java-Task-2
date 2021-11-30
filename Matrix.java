import java.lang.*;
import java.io.*;
import java.util.*;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number of rows and coloumns: ");
        int n=s.nextInt();
        int a[][];
        a = new int[n][n];
        System.out.println("Enter matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix after Transpose: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
