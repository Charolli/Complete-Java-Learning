package interviewPrograms;

public class Seperate_Char_Num_SplChar {
	
	public void method1() {
		String str1 = "**Docoding123456789everyday##";
		char[] str = str1.toCharArray();
		String letters="", numerics = "", splChar="";
		
		for (int i = 0; i < str.length; i++) {
			if (Character.isDigit(str[i])) {
				numerics += str[i];
			}else if (Character.isAlphabetic(str[i])) {
				letters += str[i];
			}else {
				splChar += str[i];
			}
		}
		System.out.println("Characters:"+letters+"\n"+"Numbers:"+numerics+"\n"+"SpecialChars:"+splChar);
	}
	
	public void method2() {
		String str1 = "**Docoding123456789everyday##";
		char[] chara = str1.toCharArray();
		String letters="", numerics = "", splChar="";
		
		for (int i = 0; i < chara.length; i++) {
			if (chara[i] >= 'a' && chara[i] <= 'z' || chara[i] >= 'A' && chara[i] <= 'Z') {
				letters += chara[i];
			} else if (chara[i] >= '0' && chara[i] <= '9') {
				numerics += chara[i];
			} else {
				splChar += chara[i];
			}
		}
		System.out.println("Characters:"+letters+"\n"+"Numbers:"+numerics+"\n"+"SpecialChars:"+splChar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seperate_Char_Num_SplChar csn = new Seperate_Char_Num_SplChar();
		csn.method1();
		csn.method2();
	}

}
