package basicPrograms;

public class Calculator
{
	//Note: 
	//Variable:
	//Syntax: DataType variableName=Value;
	//For Example: int a=10;
	
	//Concatenate---> +
	public static void main(String[] args)
	{
		int num1=20,num2=10;
		
		System.out.println("*****CALCULATOR*****");
		
		System.out.println("First Number: " +num1+"\nSecond Number: "+num2);
	
		System.out.println("\n\nAddition: " + (num1+num2) );
		System.out.println("Subtraction: " + (num1-num2) );
		System.out.println("Division: " + (num1/num2) );
		System.out.println("Multiplication: " + (num1*num2) );
	
	}

}
