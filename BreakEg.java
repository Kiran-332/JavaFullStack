package Conditionalprograms;

public class BreakEg
{
	static void toSearchEle(int array[] ,int searchval)
	{
		
		for(int ctr = 0; ctr < array.length; ctr++ )
		{
			if(array[ctr] == searchval)
			{
				System.out.println("Element found at " + ctr);
				break;
			}
		}
	}
	public static void main(String args[])
	{
		int array[] = {5,10,15,20,25};
		int searchval = 15;
		toSearchEle( array,searchval);
	}
}
