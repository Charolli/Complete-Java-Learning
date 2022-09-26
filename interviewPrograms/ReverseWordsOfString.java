package interviewPrograms;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Welcome To JAVA";
		String output = "";
		String[] str = input.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			for (int j = str[i].length() - 1; j >= 0 ; j--) {
				output = output + str[i].charAt(j);
			}
			output = output + " ";
		}
		System.out.println(output);
	}

}
