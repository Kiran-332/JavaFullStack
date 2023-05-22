package Conditionalprograms;

public class Laddereg 
{
	public static void main(String[]args) 
	{
		int num = 10;
		if(num % 2 == 0 && num > 0)
		{
			System.out.println("this number is positive even ");
		}
		else if(num % 2 == 1 && num > 0)
		{
			System.out.println("this number is positive odd");
		}
		if(num % 2 == 0 && num < 0)
		{
			System.out.println("this number is negative even ");
		}
		else if(num % 2 == 1 && num > 0)
		{
			System.out.println("this number is negative odd");
		}
	}
}
