/*
 * Reverse the words in string eg. 'The Sky is Blue'. then print 'Blue is Sky The'.
 */
package strings;

public class StringReverseWords {
	
	public static void main(String args[]){
		StringReverseWords s = new StringReverseWords();
		s.reverseWords("The Sky is Blue");
		
	}
	
	private void reverseWords(String wordsToReverse){
		
		String[] stringArray = wordsToReverse.split(" ");
		
		/*for(String s : stringArray){
			System.out.print(s + " ");
		}*/
		
		for(int i = stringArray.length-1;i>=0;i--){
			System.out.print(stringArray[i] + " ");
		}
		
	}

}
