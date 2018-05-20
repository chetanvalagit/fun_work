
public class SingltonClass {
	private static SingltonClass obj=null;
	
	private SingltonClass()
	{
		
	}
	
	public static SingltonClass GetSingltonClass()
	{
		if(obj == null)
		{
			synchronized (SingltonClass.class) {
				if(obj == null)
				{
					obj = new SingltonClass();
				}
			}
		}
		return obj;
	}
	
	public void PrintMessage()
	{
		System.out.println("Hello");
	}

}
