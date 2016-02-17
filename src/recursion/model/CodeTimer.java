package recursion.model;

/**
 * 
 * @author Alejandro Magallanes
 * @version 0.1 Feb 17, 2016
 */

public class CodeTimer
{
	private long executionTime;
	
	public CodeTimer()
	{
		this.executionTime = 0;
	}
	
	public void startTimer()
	{
		this.executionTime = System.nanoTime();
	}
	
	public void stopTimer()
	{
		this.executionTime = System.nanoTime() - executionTime;
	}
	
	public void resetTimer()
	{
		this.executionTime = 0;
	}
}
