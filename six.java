package day2JavaAssignment;

import java.util.Scanner;

public class six 
{
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s1=a.next();
		System.out.println("Enter another string to check if it ends with :");
		String s2=a.next();
		boolean ending1= s1.endsWith(s2);
		System.out.println(ending1);
	}
}
