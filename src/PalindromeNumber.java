
public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 1234321;
		int original=num;
		int rev= 0; 
		for(;num != 0; num /= 10) { 
			int digit = num % 10; 
			rev=rev * 10 + digit; 
		}

		if(original==rev) {
		System.out.println("the number " + original+" is a palindrome");
		}else {
			System.out.println("the number " + original+" is not a palindrome");
		}

	}

}
