package interviewPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib = new int[7];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i-1] + fib[i-2];  
		}
		for (int i = 0; i < fib.length; i++) {
			System.out.println(fib[i]);
		}
	}

}
