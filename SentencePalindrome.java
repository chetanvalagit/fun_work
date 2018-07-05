//Write a program to check if a sentence is palindrome or not. You can ignore white spaces and other characters to consider sentence as a palindrome.


public class SentencePalindrome {

	public static boolean SentenseIsPalidrom(String input)
	{
		int startIndex = 0;
		int endIndex = input.length()-1;
		input = input.toLowerCase();
		while(startIndex <= endIndex)
		{
			char startChar = input.charAt(startIndex);
			char endChar = input.charAt(endIndex);
			if(startChar < 'a' || startChar > 'z')
			{
				startIndex++;
			}
			else if(endChar < 'a' || endChar > 'z')
			{
				endIndex--;
			}
			else if(endChar != startChar)
			{
				return false;
			}
			else
			{
				startIndex++;
				endIndex--;
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) 
	{
		String input = "Too hot to hoot.";
		System.out.println(SentenseIsPalidrom(input));
	}

}
