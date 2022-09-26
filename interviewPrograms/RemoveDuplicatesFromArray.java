package interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(list);
		list.clear();
		list.addAll(s);
		
		System.out.println(list);
	}

}
