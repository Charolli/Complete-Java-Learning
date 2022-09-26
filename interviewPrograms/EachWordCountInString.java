package interviewPrograms;

import java.util.Map;
import java.util.TreeMap;

public class EachWordCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java Freq if it is to be it is up to me to delegate";
		String[] stra = str.split(" ");
		
		Map<String, Integer> hm = new TreeMap<>();
		
		for(String s: stra) {
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
	}

}
