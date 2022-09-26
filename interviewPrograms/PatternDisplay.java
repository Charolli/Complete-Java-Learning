package interviewPrograms;

public class PatternDisplay {

	public void RightAngleTriangle() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void ReverseNumRightAngleTriangle() {
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void ReverseRightAngleTriangle() {
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternDisplay p = new PatternDisplay();
		p.RightAngleTriangle();
		p.ReverseNumRightAngleTriangle();
		p.ReverseRightAngleTriangle();
	}

}
