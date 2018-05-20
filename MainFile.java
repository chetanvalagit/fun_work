public class MainFile implements Runnable{
	
	public void run()
	{
		String threadname = Thread.currentThread().getName();
		this.PrintMEssage(threadname);
	}
	
	public synchronized void PrintMEssage(String threadName)
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.println("Hello from thread: " + threadName + " Count = " + i);
		}

	}
		
	public static void main(String[] args) throws InterruptedException 
	{
		MainFile obj = new MainFile();
		Thread FirststThread = new Thread(obj);
		FirststThread.setName("FirstThread");
		FirststThread.start();
		Thread SecondThread = new Thread(obj);
		FirststThread.setName("SecondThread");
		SecondThread.start();
		
		FirststThread.join();
		SecondThread.join();
	}

};