package interviewPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 1234;
		
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num/10;			
		}
		System.out.println(sum);
	}

}
