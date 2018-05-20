
public class PrintMessageThread implements Runnable{
	private String threadName;
	private int iterationCount;
	private int sleep;
	
	public PrintMessageThread(String threadName, int iterationCount, int sleep)
	{
		this.threadName = threadName;
		this.iterationCount = iterationCount;
		this.sleep = sleep;
	}
	
	public void run()
	{
		try
		{
			for(int count=0; count < iterationCount; count++)
			{
				printMessage("Print from thread " + this.threadName + " Count: " + count);
				Thread.sleep(this.sleep);
			}
		}
		catch (InterruptedException e) {
			printMessage("Thread " + this.threadName + " Interrupted");
		}
		finally
		{
			printMessage("Exiting thread "+ this.threadName);
		}
	}
	
	private synchronized void printMessage(String message)
	{
		System.out.println(message);
	}
	
}
