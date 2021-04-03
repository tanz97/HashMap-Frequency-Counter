import java.util.*;
public class HashMapFrequencyCouncter {
	
	//The number of occurrence of each character in the string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "aaaaaaasdsdsgffdbldflwsdkflskf;sdklf";
		int count = 0;
		char ch;
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(int i=0; i<string.length();i++) {
			ch = string.charAt(i);
			if(hashMap.containsKey(ch)) {
				count = hashMap.get(ch);
				count++;
				hashMap.replace(ch, count);
			}else {
				hashMap.put(ch,1);
			}
		}
		
		for(Character key:hashMap.keySet()) {
			System.out.println(key + " = "+hashMap.get(key));
		}

	}

}
