public class company {

    // method for producing item
    int n;
    // creating inter-thread communication
    Boolean f=true;
    // if f=true means chance : producer can produce item
    // if f=false means chance : consumer can produce item
   synchronized public void produce_item(int n)  
    {
        // synchronized because when produce_item is running no other thead can interfare
        if(!f)
        {
            try {
                wait();
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            
        }
     this.n=n;
     System.out.println("Produced : " + this.n);   
    //  produced 1
    //  produced 2
    //  produced 3
    //  produced n
    f=false;
    notify();
    
        // notify() it will notify() that my work is done to consume_item()
    
    }


    // method for consuming item
    synchronized public int consume_item() 
   // synchronized because when consume_item is running no other thead can interfare
    {
        if(f){
            // means f=false
            try {
                wait();
                // now consumer will consume item;
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        System.out.println("Consumed  : " + this.n);
        f=true;
        notify();
        // notify() it will notify() that my work is done to produce_item()
        return this.n;
    }


   
    
}
