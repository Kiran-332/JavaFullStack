package Conditionalprograms;

public class LoopEvenSeries
{
	static void toCreateEvenSeries(int range) 
	{
		System.out.println("Even Series");
		for(int ctr = 2; ctr <= range; ctr += 2)
		{
			System.out.print(ctr + " ");
		}
	}
	public static void main(String arg[])
	{
		int range = 100;
		toCreateEvenSeries(range);
		
	}
}
	