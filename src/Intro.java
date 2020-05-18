
public class Intro extends Thread {
	
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("the thread is running"+this.getName());
			
			  
			
		}
	}
	

	public  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Intro init=new Intro();
		init.start();
		
		Intro init1=new Intro();
		init1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("the MAIN thread is running");
			init.join();
			init1.join();
			
			
		}
	}

}
