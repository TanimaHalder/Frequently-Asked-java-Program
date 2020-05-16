import java.util.*; 
import java.lang.*; 
  
class PrimeNumbers { 
      
    static boolean isPrime(int n) { 
    if (n%2==0) return false; 
    for(int i=3;i<=Math.sqrt(n);i+=2) { 
        if(n%i==0) 
            return false; 
    } 
    return true; 
} 
      
    public static void main(String[] args)  
    { 
         if(isPrime(21))  
         System.out.println(" true") ; 
          
         else 
         System.out.println(" false"); 
           
    } 
} 
      