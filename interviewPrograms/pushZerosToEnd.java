package interviewPrograms;

public class pushZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int arr[] = {1, 0, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++]=arr[i];
			}
		}
		
		while (count < arr.length) {
			arr[count++]=0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		
	}

}
