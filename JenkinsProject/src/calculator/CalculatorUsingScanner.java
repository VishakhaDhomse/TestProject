package calculator;

import java.util.Scanner;

public class CalculatorUsingScanner 
{
	//Note:
	//Scanner: 
	//Scanner is one of the predefined class which is used for reading the data dynamically from the keyboard.
	//Syntax of Scanner Class in Java:
		//Scanner s=new Scanner(System.in);
	//Here “s” is object of scanner class by using which we can call methods of scanner class to take input from the user.

	
	//Import---> ctrl+shift+o
	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
	
//		System.out.println("******CALCULATOR******");
//		System.out.println("\nEnter First Number:");
//		int a=s.nextInt();
//		System.out.println("Enter Second Number:");
//		int b=s.nextInt();
		
		int a=100, b=25;
		
		System.out.println("Add: " + (a+b));
		System.out.println("Sub: " + (a-b));
		System.out.println("Div: " + (a/b));
		System.out.println("Mul: " + (a*b));
		
		
	}

}
