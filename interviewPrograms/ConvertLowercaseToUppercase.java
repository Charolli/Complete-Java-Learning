package interviewPrograms;

public class ConvertLowercaseToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// asci value of a-97 z-98 and A-65, Z-66
		String str = "java is best";
		char charArr[] = str.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			if(charArr[i] >= 'a' && charArr[i] <= 'z') {
				charArr[i] = (char) ((int) charArr[i] - 32);
			}
		}
		
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);
		}
	}

}
