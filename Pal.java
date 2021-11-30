import java.io.*;
import java.util.*;
import java.lang.*;

public class Pal
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=s.nextLine();
		boolean b=true;
		for(int i=0,j=str.length()-1;i<j;i++,j--)
		{
		    if(str.charAt(i) != str.charAt(j))
                b=false;
		}
		if (b==true)
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");

	}
}
