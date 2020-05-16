import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		int x, y, t;// x and y are to swap   
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of X and Y");  
		x = sc.nextInt();  
		y = sc.nextInt();  
		System.out.println("before swapping numbers: "+x +"  "+ y);  
		//swapping - with temporary variable 

		t = x; 
		x = y; 
		y = t;



		// swapping - with +/- variable  

		x=x+y;
		y=x-y;
		x=x-y;


		// swapping - with */ variable  


		x=x*y;
		y=x/y;
		x=x/y;

		System.out.println("After swapping: "+x +"   " + y);  
		System.out.println( );  

	}

}
