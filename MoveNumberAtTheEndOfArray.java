import java.util.Arrays;

public class MoveNumberAtTheEndOfArray {
	
	public void MoveNumber(int arr[], int number)
	{
		int length = arr.length;
		int writeIndex = 0;
		int readIndex = 0;
		
		for(readIndex=0; readIndex < length; readIndex++)
		{
			if(arr[readIndex] != number)
			{
				arr[writeIndex++] = arr[readIndex];
			}
		}
		
		while(writeIndex < length)
		{
			arr[writeIndex++] = number;
		}
	}

	public static void main(String[] args) {
		MoveNumberAtTheEndOfArray obj = new MoveNumberAtTheEndOfArray();
		int data[] = {1,2,4,5,7,2,8,2,6,2,9,2,2};
		
		System.out.println(Arrays.toString(data));
		obj.MoveNumber(data, 2);
		System.out.println(Arrays.toString(data));
	}

}
