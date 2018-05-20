public class FindRepetedNumber {
	
	private void printRepetedNumber(int data[], int size)
	{
		for(int datacount = 0; datacount < size; datacount++)
		{
			if(data[Math.abs(data[datacount])] > 0)
			{
				data[Math.abs(data[datacount])] = -data[Math.abs(data[datacount])];
			}
			else
			{
				System.out.println(Math.abs(data[datacount]));
			}
		}
	}
	
	public static void main(String args[])
	{
		FindRepetedNumber obj = new FindRepetedNumber();
		int data[] = {1,2,3,4,1,3,5,7,8,8,7,6};
		obj.printRepetedNumber(data, data.length);
	}

}
