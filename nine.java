package day2JavaAssignment;

import java.util.Scanner;

//7th program
public class nine 
{
	public static void main(String[] args)
	{
		System.out.println("Enter array elements:");
		int[][] arr=new int[5][5];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		int[][] arr2=new int[2][2];
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				arr2[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.println(arr2[i][j]);
			}
		}
		
		
		
	}
}
