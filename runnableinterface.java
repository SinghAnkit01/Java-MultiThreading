public class runnableinterface implements Runnable {

    @Override
    public void run() {
       
        for(int i=10;i>=1;i--){
            try {
                Thread.sleep(1000);
                System.out.println("By using Runnable interface " + i);
                // Thread.sleep(1000);
               
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
        }
        
    }

    public static void main(String[] args) {
        runnableinterface rinter = new runnableinterface();
        // most prefered method for creation of thread in java because we are implementing something not extending
        // because in java multiple inheritance is not supported so we cant extend more than one class but
        // we can implememt more than one interface. 
        Thread thread = new Thread(rinter);
        thread.start();

        // calling threadclass from runnableinterface class
        threadclass tc = new threadclass();
        // threadclass extends Thread which contains all the properties of Runnable interface so no need to pass
        // any reference of class to pre-defined Thread class its already being extended. 
        tc.start();
       
       
    }
    
}
