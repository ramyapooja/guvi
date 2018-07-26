import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class num
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		 int num;
		 System.out.println("enter the number");
		 num=sc.nextInt();
		 if(num>0)
		 {
		 	System.out.println("num is postive");
		 }
		 else if(num<0)
		 {
		 	System.out.println("num is negative");
		 }
		else
		{
			System.out.println("num is zero");
		}
		
		// your code goes here
	}
}
