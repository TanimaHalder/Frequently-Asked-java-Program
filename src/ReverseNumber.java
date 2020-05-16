
public class ReverseNumber {

	public static void main(String[] args) {


		int num = 1234567;

		int rev= 0; 
		for(;num != 0; num /= 10) { 
			int digit = num % 10; 
			rev=rev * 10 + digit; 
		}

		StringBuffer reversed;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		reversed=sb.reverse();

		StringBuffer reverse;
		StringBuffer st = new StringBuffer(String.valueOf(num));
		reverse=st.reverse();

		System.out.println("Reversed Number: " + rev);
	

	}

}
