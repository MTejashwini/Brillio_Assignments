package day2JavaAssignment;
//9th PROGRAM

import java.util.Scanner;

public class seven 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=in.next();
		System.out.println("enter the character that has to be replaced:");
		String s2=in.next();
		System.out.println("Enter the new character:");
		String s3=in.next();
		String s4= s1.replace(s2, s3);
		System.out.println("Original String: " +s1);
		System.out.println("New String: "+s4);
	}
}
