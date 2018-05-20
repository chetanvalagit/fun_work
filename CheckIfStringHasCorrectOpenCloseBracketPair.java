import java.util.Stack;

public class CheckIfStringHasCorrectOpenCloseBracketPair {

	public boolean CheckString(String inputString)
	{
		int length = inputString.length();
		int index = 0;
		Stack<Character> myStack = new Stack<Character>();
		Character myChar;
		while(index < length)
		{
			myChar = inputString.charAt(index++);
			if(myChar == '{' || myChar == '}' || myChar == '(' || myChar == ')' || myChar == '[' || myChar == ']')
			{
				if(!myStack.empty() && myStack.peek() == this.getClosingCharacter(myChar))
				{
					myStack.pop();
				}
				else
				{
					myStack.push(myChar);
				}
			}
		}
		if(myStack.empty())
		{
			return true;
		}
		return false;
	}
	
	private Character getClosingCharacter(Character inputChar)
	{
		if(inputChar == '}')
		{
			return '{';
		}
		else if(inputChar == ')')
		{
			return '(';
		}
		else if(inputChar == ']')
		{
			return '[';
		}
		return ',';
	}
	
	public static void main(String[] args) {
		String inputString = "while(readIndex < length){if(arr[readIndex] == number){found = true;}else if(found == false){writeIndex++;}else{arr[writeIndex++] = arr[readIndex];}readIndex++;}";
		CheckIfStringHasCorrectOpenCloseBracketPair obj = new CheckIfStringHasCorrectOpenCloseBracketPair();
		boolean status = obj.CheckString(inputString);
		System.out.println(status);
		
	}

}
