package day2JavaAssignment;
import java.util.*;

public class five {
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int bin[]=new int[20];
		int deci;
		int i=0;
		Scanner num=new Scanner(System.in);
		deci=num.nextInt();
		
		while(deci>0) {
			bin[i++]=deci%2;
			deci/=2;
		}
		
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(bin[j]);
			
		}
	}
}
