/*How to Print duplicate characters from String? 

To print duplicate characters from a given String, for example if String is "Java" 
then program should print "a". Bonus points if your program is robust and handle 
different kinds of input e.g. String without duplicate, null or empty String etc. 
Bonus points if you also write unit tests for normal and edge cases.
*/


package strings;
import java.util.HashMap; 
import java.util.Map;

public class StringPrintDuplicate {
	
	public static void main(String args[]){
		StringPrintDuplicate a = new StringPrintDuplicate();
		a.duplicateChar("Javjjjaa");
	}
	
	public void duplicateChar(String s){
		
		char[] stringToCharArray = s.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(int i=0;i<=stringToCharArray.length-1;i++){
			if(charMap.containsKey(stringToCharArray[i])){
				charMap.put(stringToCharArray[i], charMap.get(stringToCharArray[i]) + 1);
			} else
				charMap.put(stringToCharArray[i], 1);
		}
		
		System.out.println(charMap);
	}

}
