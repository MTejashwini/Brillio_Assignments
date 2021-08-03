package day2JavaAssignment;
import java.util.*;

public class eight {

		public static void main(String[] args)
		{
			System.out.println("Enter two strings:");
			Scanner s=new Scanner(System.in);
			
			String s1=new String();
			String s2=new String();
			s1=s.next();
			s2=s.next();
			
			if(s1.equals(s2))
			{
				System.out.println("Strings are equal");
			}
			else
				System.out.println("Strings are not equal");
			
		}
}
