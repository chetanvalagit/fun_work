import java.util.Arrays;

public class ReversArray {
	
	private void ReversMyArray(int arr[], int n)
	{
		int left = 0;
		int right = n-1;
		while(left < right)
		{
			swap(arr, left++, right--);
		}
	}
	
	private void swap(int arr[], int i, int j)
	{
		arr[i] ^= arr[j];
		arr[j] ^= arr[i];
		arr[i] ^= arr[j];
	}
	
	public static void main(String args[])
	{
		ReversArray obj = new ReversArray();
		int arr1[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr1));
		obj.ReversMyArray(arr1, arr1.length);
		System.out.println(Arrays.toString(arr1));
	}

}
