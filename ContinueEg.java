package Conditionalprograms;

public class ContinueEg 
{
	public static void main(String arg[])
	{
	String name = "kiran sri";
	char ch = 'n';
	int index = 0;
	for (index = 0; index < name.length(); index++)
	{
		if(name.charAt(index)== ch)
		continue;
		System.out.print(name.charAt(index));
	}
	}
}
