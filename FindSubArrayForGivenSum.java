import java.util.HashMap;

//Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.


public class FindSubArrayForGivenSum {

	public static void FindSubArrayPositiveNumber(int[] input, int n , int sum)
	{
		int curr_sum = input[0];
		int startIndex = 0;
		for(int index = 1; index < n; index++)
		{
			curr_sum = curr_sum + input[index];
			
			while(curr_sum > sum && startIndex < index)
			{
				curr_sum = curr_sum - input[startIndex];
				startIndex++;
			}
			
			if(curr_sum == sum)
			{
				System.out.println("start Index : " + startIndex + " End index : " + index);
			}
		}
	}
	
	public static void FindSubArrayegativeNumber(int[] input, int n, int sum)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int curr_sum = 0;
		for(int index = 0; index < n; index++)
		{
			curr_sum = curr_sum + input[index];
			
			if(curr_sum == sum)
			{
				System.out.println("Start Index : 0 End Index : " + index );
			}
			
			if(map.containsKey(curr_sum - sum))
			{
				System.out.println("Start Index : " + (map.get(curr_sum-sum) + 1) + " End Index : " + index);
			}
			map.put(curr_sum, index);
		}
	}
	
	public static void main(String[] args) {
		int input[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = input.length;
        int sum = 33;
        FindSubArrayPositiveNumber(input, n, sum);
        
        int arr[] = {10, 2, -2, -20, 10};
        n = arr.length;
        sum = -10;
     
        FindSubArrayegativeNumber(arr, n, sum);
	}

}
