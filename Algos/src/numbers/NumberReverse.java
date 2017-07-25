package numbers;

public class NumberReverse {
	
	public static void main(String args[]){
		
		NumberReverse a = new NumberReverse();
		a.reverseNumber(109);
	}
	
	private void reverseNumber(int numberToReverse){
		
		System.out.print(numberToReverse%10);
		
	}

}
