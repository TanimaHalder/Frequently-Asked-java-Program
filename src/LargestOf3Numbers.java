
public class LargestOf3Numbers {

	public static void main(String[] args) {

		int num1 =12,num2 =13, num3= 14;

		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is largest");
		}	else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is largest");
		}else {
			System.out.println(num3+" is largest");
		}
	}

}
