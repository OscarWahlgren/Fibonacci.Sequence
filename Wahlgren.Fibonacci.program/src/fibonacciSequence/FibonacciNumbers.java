package fibonacciSequence;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class FibonacciNumbers 
{
	public FibonacciNumbers()
	{
	int[] fib = new int[51];
	calculateNumbers(fib);
	splitArray(fib);
		}
	public void calculateNumbers(int[] fib)
	{
		fib[0] = 0;
		fib[1] = 1;
		for(int i = 2; i < 51; i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
	}
	public void splitArray(int[] fib)
	{
		int[] line1 = Arrays.copyOfRange(fib, 0, fib.length / 2);
	    int[] line2 = Arrays.copyOfRange(fib, fib.length / 2, (fib.length / 3)*2);
	    int[] line3 = Arrays.copyOfRange(fib, (fib.length / 3)*2, (fib.length / 6)*5);
	    int[] line4 = Arrays.copyOfRange(fib, (fib.length / 6)*5, fib.length);
	    
	    JOptionPane.showMessageDialog(null, "The first 50 numbers in the Fibonacci sequence\n" + Arrays.toString(line1) + "\n" + Arrays.toString(line2) + "\n" + Arrays.toString(line3) + "\n" + Arrays.toString(line4));
	}
}
