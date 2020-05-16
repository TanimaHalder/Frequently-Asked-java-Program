
public class ReverseString {
	public static void main(String[] args) {
	
	String Original="ABCDEFGH";
	
	StringBuffer reversed;
	StringBuffer sb = new StringBuffer(Original);
	reversed=sb.reverse();

	StringBuffer reverse;
	StringBuffer st = new StringBuffer(Original);
	reverse=st.reverse();

	System.out.println("Reversed Number: " + reversed);
	System.out.println("Reversed Number: " + reverse);
}
}
