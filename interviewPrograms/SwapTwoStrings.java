package interviewPrograms;

public class SwapTwoStrings {
	
	public void SwapStrings() {
		// Declare two strings 
		String a = "Hello"; 
		String b = "World"; 
		
		// Print String before swapping 
		System.out.println("Strings before swap: a = " + a + " and b = "+b); 
		
		// append 2nd string to 1st 
		a = a + b; 
		System.out.println(a);
		
		// store intial string a in string b 
		b = a.substring(0, a.length() - b.length()); 
		System.out.println(a.length());
		System.out.println(b.length());
		
		// store initial string b in string a 
		a = a.substring(b.length()); 
		
		// print String after swapping 
		System.out.println("Strings after swap: a = " + a + " and b = " + b);
	}
	
	public void SwapTwoStringsUsingTempVariable() {
		String s1 = "Ravi";
		String s2 = "Charolli";
		String s3 = "";
		s3 = s1;
		s1 = s2;
		s2 = s3;
		
		System.out.println(s1 + " " + s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoStrings ss = new SwapTwoStrings();
		ss.SwapTwoStringsUsingTempVariable();
		ss.SwapStrings();
	}

}
