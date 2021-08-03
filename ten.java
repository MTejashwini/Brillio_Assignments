package day2JavaAssignment;

import java.util.Scanner;

public class ten 
{
	public static void main(String[] args)
	{
		int base, exp;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the base and exponential value");
		base=num.nextInt();
		exp=num.nextInt();
		
		double result=0;
		result=Math.pow(base, exp);
		System.out.println("Result: "+result);
	}
}
 