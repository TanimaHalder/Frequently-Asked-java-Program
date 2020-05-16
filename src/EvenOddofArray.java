
public class EvenOddofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,0};


		System.out.println("printing the even numbers");
		for(int i=0;i<arr.length;i++) {
			if((arr[i])%2==0) {
				
				System.out.print(","+arr[i]);
			}
		}
		

		System.out.println("printing the odd numbers");
		for(int i=0;i<arr.length;i++) {
			if((arr[i])%2!=0) {
				
				System.out.print(","+arr[i]);
			}
		}

	}
}
