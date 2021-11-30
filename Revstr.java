import java.lang.*;
import java.io.*;
import java.util.*;

public class Revstr
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    System.out.print("Enter a String: ");
    String str = s.nextLine ();
    String rev = "";
    char ch;
    for (int i = 0; i < str.length (); i++)
      {
	ch = str.charAt (i);
	rev = ch + rev;
      }
    System.out.print ("Reversed string is: " + rev);
  }
}
