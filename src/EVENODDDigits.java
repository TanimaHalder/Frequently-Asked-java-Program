
public class EVENODDDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345678;
		int even_count=0,odd_count=0;
		while(num>0) {
			num=num/10;
			if((num%10)%2==0)
			even_count++;
			else
			odd_count++;
		}
		
		System.out.println("the number of even digits present in the integer >> "+even_count);
		System.out.println("the number of even digits present in the integer >> "+odd_count);

	}

}
