import java.io.*;
import java.util.*;
import java.lang.*;

public class Percomb
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of objects(n): ");
		int n=s.nextInt();
		System.out.print("Enter number of choosing objects(r): ");
		int r=s.nextInt();
		int per=factorial(n)/factorial(n-r);
		int comb=factorial(n)/(factorial(r)*factorial(n-r));
		System.out.print("Permutations: "+per);
		System.out.print("\nCombinations: "+comb);
	}
	public static int factorial(int count)
	{
	    int fact=1;
		for(int i=1;i<=count;i++)
		{
		    fact=fact*i;
		}
		return fact;
	}
}
