package Conditionalprograms;

public class LoopEg 
{
	static void toCreateSeries(int favn) 
	{
		System.out.println("favn");
		for(int ctr = 1; ctr <= favn; ctr++)
		{
			System.out.println(ctr);
		}
	}
	public static void main(String arg[])
	{
		int favn = 10;
		toCreateSeries(favn);
		
	}
}
