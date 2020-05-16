
public class FibonacciSeries {

	int fib(int n) {
		
		if(n==0 || n==1) {
			return n;
			
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String[] args) {

		FibonacciSeries n = new FibonacciSeries();
		
		int result=n.fib(9);
		System.out.println("the value of fibonacci series till is ::"+result);
		
		
	}

}
