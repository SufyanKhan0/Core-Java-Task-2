import java.io.*;
import java.util.*;
import java.lang.*;

public class Diamond
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the size of diamond: ");
		int n=s.nextInt();
	    for(int i=0;i<n+1;i++)
	    {
	        for(int j=n+1;j>i;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=0;k<i;k++)
	        {
	            System.out.print("* ");
	        }
	        System.out.print("\n");
	    }
	    for(int i=n;i>0;i--)
	    {
	        for(int j=i;j<n+1;j++)
	        {
	            System.out.print(" ");
	        }
	        for(int k=i;k>0;k--)
	        {
	            System.out.print("* ");
	        }
	        System.out.print("\n");
	    }
	}
}
