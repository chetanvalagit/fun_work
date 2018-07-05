//Rotate an array of n elements to the left by k steps.

//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [4,5,6,7,1,2,3]

import java.util.Arrays;

public class RotateArrayByNumber {
	
	public boolean RotateArray(int input[], int k)
	{
		if(input == null || input.length == 0 || k > input.length)
		{
			return false;
		}
		
		int end = input.length - 1;
		this.reverse(input, 0, k-1);
		this.reverse(input, k,end);
		this.reverse(input, 0, end);
		return true;
	}
	
	public void reverse(int input[], int start, int end)
	{
		int temp = 0;
		while(start < end)
		{
			temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			end--;
			start++;
		}
	}

	public static void main(String[] args) {
		int input[] = {1,2,3,4,5,6,7,8};
		
		RotateArrayByNumber obj = new RotateArrayByNumber();
		
		System.out.println(Arrays.toString(input));
		obj.RotateArray(input, 10);
		
		System.out.println(Arrays.toString(input));
	}

}
