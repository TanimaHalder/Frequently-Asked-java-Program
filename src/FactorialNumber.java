
public class FactorialNumber {

	int fact(int n) {
		if(n<1) {
			return 1;
		}
		else 
			System.out.print(n+"*");
			return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		FactorialNumber np= new FactorialNumber();
		int result=np.fact(5);
		
		System.out.println("factorial of above string "+ result);
	}

}
