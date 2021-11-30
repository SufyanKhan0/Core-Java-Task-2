import java.io.*;
import java.util.*;
import java.lang.*;

public class Calc
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=s.nextInt();
		System.out.print("Enter another number: ");
		int b=s.nextInt();
		System.out.print("Enter which opertaion to perform: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");
		int n=s.nextInt();
		switch(n)
		{
		    case 1:
		            System.out.print(a+b);
		            break;
		    case 2:
		            System.out.print(a-b);
		            break;
		    case 3:
		            System.out.print(a*b);
		            break;
		    case 4:
		            System.out.print(a/b);
		            break;
		    default:
		        System.out.print("Invalid Input");
		}
	}
}
