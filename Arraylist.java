import java.lang.*;
import java.io.*;
import java.util.*;

public class Arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number of elements to add: ");
        int n=s.nextInt();
        System.out.print("Enter elements to add: ");
        for(int i=0;i<n;i++)
        {
            al.add(s.nextInt());
        }
        System.out.println(al);
        System.out.print("Enter index to remove: ");
        al.remove(s.nextInt());
        System.out.println(al);
    }
}
