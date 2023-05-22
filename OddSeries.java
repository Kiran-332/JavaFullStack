package Conditionalprograms;

public class OddSeries 
{
	static void toCreateOddSeries(int range) 
	{
		System.out.println("Odd Series");
		for(int ctr = 1; ctr <= range; ctr += 2)
		{
			System.out.print(ctr + " ");
		}
	}
	public static void main(String arg[])
	{
		int range = 100;
		toCreateOddSeries(range);
		
	}
}
