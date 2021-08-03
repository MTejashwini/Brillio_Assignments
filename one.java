package day2JavaAssignment;

import java.util.Scanner;

public class one 
{
	public static void main(String[] args) {
	float x,y;
	float result=0;
	
	System.out.println("Enter two numbers: ");
	Scanner in=new Scanner(System.in);
	x=in.nextInt();
	y=in.nextInt();
	result=x/y;
	System.out.println("Result: " +result);
	}
}
