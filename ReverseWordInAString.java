// Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

// The input string does not contain leading or trailing spaces and the words are always separated by a single space.
// For example,
// Given s = "the sky is blue",
// return "blue is sky the".


import java.util.Arrays;

public class ReverseWordInAString 
{
	public String ReverseWordByWord(char[] inputString)
	{
		int start = 0;
		int end = inputString.length;
		this.reverse(inputString, start, end-1);
		
		for(int index = 0; index < end; index++)
		{
			if(inputString[index] == ' ')
			{
				reverse(inputString, start, index-1);
				start = index+1;
			}
		}
		
		reverse(inputString, start, end-1);
		
		return Arrays.toString(inputString);
	}
	
	public void reverse(char[] inputString, int start, int end)
	{
		char temp;
		while(start < end)
		{
			temp = inputString[start];
			inputString[start] = inputString[end];
			inputString[end] = temp;
			end--;
			start++;
		}
	}
	
	public static void main(String[] args)
	{
		String input = "My name is chetan vala";
		
		ReverseWordInAString obj = new ReverseWordInAString();
		String out = obj.ReverseWordByWord(input.toCharArray());
		
		System.out.println(out);
	}

}
