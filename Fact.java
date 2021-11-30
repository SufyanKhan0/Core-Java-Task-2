import java.io.*;
import java.util.*;
import java.lang.*;

public class Fact
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Number to get Factorial: ");
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
		    fact=fact*i;
		}
		System.out.print("Factorial of "+n+" is "+fact);
	}
}
