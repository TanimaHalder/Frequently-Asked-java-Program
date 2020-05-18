public class ProducerConsumerProblem {

	 public static void main(String[] args) 
		        throws InterruptedException {
    final ProducerConsumer pc = new ProducerConsumer(); 

    Thread t1 = new Thread(new Runnable() { 
        public void run() 
        { 
            try {
				pc.producer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
        } 
    }); 

    Thread t2 = new Thread(new Runnable() { 
        public void run() 
        { 
            try {
				pc.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
        } 
    }); 

    t1.start(); 
    t2.start(); 

    t1.join(); 
    t2.join(); 
}
	 
	 public static class ProducerConsumer{
		 
			int Capacity=10,size=0;
			
			void producer() throws InterruptedException {
				while(true) {
					 synchronized (this) {
						if(size<Capacity){
							size++;
							System.out.println("produced --"+size);
							
							Thread.sleep(1000);
							notifyAll();
							
						}else {
							wait();
							Thread.sleep(1000);
						}
					}
				}
				
			} 
			
			void consumer() throws InterruptedException {
				while(true) {
					synchronized(this) {
						if(size>0) {
							size--;
							System.out.println("Consumer --"+size);
						
							Thread.sleep(1000);
							notifyAll();
						}else {
							wait();
							Thread.sleep(1000);
						}
					}
				}
				
			}
}




}
