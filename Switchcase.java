package Conditionalprograms;

public class Switchcase
{
	public static void main(String args[]) 
	{
		char ch = 'k';
		switch(ch) 
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			System.out.println("vowels");
			break;
			case ' ':
			System.out.println("whitespace");	
			break;
			default:
			System.out.println("consonents");
				
				
			
		}
	}

}
