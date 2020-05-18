import java.util.Arrays;
import java.util.Scanner;
public class Test1
{
	public static void main(String args[]) 
	{ 
		int arr[] = {3 ,6 ,36 ,32 ,32 ,121 ,66 ,24, 26 ,371 ,661,6,4,8,-1 }; 
		int n = arr.length; 
		Test1 t=new Test1();
		t.loosingStreak(n,arr);
	} 

	//loosingStreak algorithm
	void loosingStreak(int n,int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=arr[i+1]) {
				
			}else if(arr[i]<arr[i+1]){
				
				temp=
				arr[i+1];
				
				
			}
		}
	}
}