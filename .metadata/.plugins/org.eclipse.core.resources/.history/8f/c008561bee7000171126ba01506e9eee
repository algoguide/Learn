package strings;

public class StringReverse {
	
	public static void main(String[] args){
		StringReverse s = new StringReverse();
		s.reverseStringUsingCharAt("Banana Apple");
		System.out.println();
		s.reverseStringUsingRecursion("Banana Apple");
		System.out.println();
		s.reverseStringUsingToCharArray("Banana Apple");
		System.out.println();
		s.reverseString("Banana Apple");

	}
	
	private void reverseStringUsingCharAt(String stringToReverse){
	
		for(int i=stringToReverse.length()-1;i>=0;i--){
			System.out.print(stringToReverse.charAt(i));
		}
	}
	
	private void reverseStringUsingToCharArray(String stringToReverse){
		char[] charToString = stringToReverse.toCharArray();
		for(int i=charToString.length-1;i>=0;i--){
			System.out.print(charToString[i]);
		}
		
	}
	
	private void reverseString(String stringToReverse){
		char[] charToString = new char[stringToReverse.length()];
		for(int i=0;i<=charToString.length-1;i++){
			charToString[i] = stringToReverse.charAt(charToString.length-1-i);
		}
		System.out.print(charToString);
	}
	
	private void reverseStringUsingRecursion(String stringToReverse){
		if(stringToReverse.length()==1){
			System.out.print(stringToReverse);
		} else{
			System.out.print(stringToReverse.charAt(stringToReverse.length()-1));
			reverseStringUsingRecursion(stringToReverse.substring(0, stringToReverse.length()-1));
		}
	}

}


