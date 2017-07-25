package strings;

public class StringPalindrome {
	
	public static void main(String[] args){
		
		StringPalindrome s = new StringPalindrome();
		System.out.println(s.checkPalindrome("Testi"));
	}
	
	private boolean checkPalindrome(String stringToCheck){
		boolean isPalindrome = false;
		char[] stringToCharArray = stringToCheck.toCharArray();
		for(int i = stringToCharArray.length-1; i>=0; i--){
			if(stringToCheck.charAt(i) != stringToCharArray[i])
				isPalindrome = false;
			else 
				isPalindrome = true;
		}
		
		return isPalindrome;
	}
}

