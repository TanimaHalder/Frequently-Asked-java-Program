
public class PalindromeString {

	public static void main(String[] args) {

		
		String Original="ABCDCBA";
		
		StringBuffer reversed;
		StringBuffer sb = new StringBuffer(Original);
		reversed=sb.reverse();

		StringBuffer reverse;
		StringBuffer st = new StringBuffer(Original);
		reverse=st.reverse();

		if(Original.toString().equals(reverse.toString())) {
			System.out.println("the number " + Original+" is a palindrome");
			}else {
				System.out.println("the number " + Original+" is not a palindrome"+reverse);
			}
	}

}
