package basicPrograms;

import java.util.Scanner;

public class SwappingOfTwoNumbersWithoutUsingThirdVariable 
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int a= s.nextInt();//10
		int b=s.nextInt();//5
		
		System.out.println("\nBefore Swapping: \nFirst Number: "+a+"\nSecond Number: "+b);

		a=a*b;//--> 10*5=50 Now a value is 50
		b=a/b;//--> 50/5=10 B value is 10
		a=a/b;//--> Again we will divide a(50) by y'new value(10) so we will get 5
		
		//OR
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		You Can perform using this method too.. Try both
		
		System.out.println("\nAfter Swapping: \nFirst Number: "+a+"\nSecond Number: "+b);

	}

}
