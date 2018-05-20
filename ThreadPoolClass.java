import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPoolClass
{
	static final int MAX_Thread = 3;
	
	
	public static void main(String[] args) 
	{
		PrintMessageThread firstThread = new PrintMessageThread("FirstThread", 10, 0);
		PrintMessageThread secondThread = new PrintMessageThread("SecondThread", 10, 0);
		PrintMessageThread thirdThread = new PrintMessageThread("ThirdThread", 10, 0);
		PrintMessageThread forthThread = new PrintMessageThread("ForthThread", 10, 0);
		PrintMessageThread fifthThread = new PrintMessageThread("FifthThread", 10, 0);
		
		
		ExecutorService threadPool = Executors.newFixedThreadPool(MAX_Thread);
		
		threadPool.execute(firstThread);
		//threadPool.execute(firstThread);
		//threadPool.execute(firstThread);
		threadPool.execute(secondThread);
		threadPool.execute(thirdThread);
		threadPool.execute(forthThread);
		threadPool.execute(fifthThread);
		
		threadPool.shutdown();
	}
	
}
