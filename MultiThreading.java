package multithreading;
/**
*
* @author Sahil
*/

class Work implements Runnable {

    @Override
    public synchronized void run() {
        for(int i=0;i<=500;i++){
            System.out.println(" "+i+ "  Printed by  "+Thread.currentThread());
            
            /*//It is optional to make thread sleep for some time(nap of 100 milli scond :-) .... )
             * 
             * try {
				Thread.sleep(100);
			}
			catch(Exception e){
				System.out.println("Something went Wrong");
		    }
             */
        }
    }
    
}

class Work2 implements Runnable {

    @Override
    public synchronized void run() {
        for(int i=500;i<=1000;i++){
            System.out.println(" "+i+ "  Printed by "+Thread.currentThread());
            
            /*
             * try {
				Thread.sleep(100);
			}
			catch(Exception e){
				System.out.println("Something went Wrong");
		    }
             */
        }
    }
    
	}

public class MultiThreading {
	
	  public static void main(String[] args) throws InterruptedException {
	       
		    Work w1= new Work();
		    Work2 w2=new Work2();
		    Thread t1=new Thread(w1);  //thread 1
		    t1.start();
		    Thread t2=new Thread(w2);  //thread 2
		    t1.join();
		    t2.start();
		    t2.join();
		    
		    
		    }
	  
}
