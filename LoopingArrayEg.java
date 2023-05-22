package Conditionalprograms;

public class LoopingArrayEg 
{
	static void toPrintArrayEle(int arr[]) 
	{		
		int array [] = {20,15,19,50,53};
		System.out.println("Array Elements");
		for(int ctr = 0; ctr <= array.length; ctr ++)
		{
			System.out.println(ctr);
		}
		toPrintArrayEle(arr);
	}
	public static void main(String arg[]) 
	{
		
	}
	
}
