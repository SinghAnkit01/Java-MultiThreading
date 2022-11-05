public class consumer extends Thread{

    company c;

     consumer(company c){
        this.c=c;
          // getting access of consume_item method from class company. 
           // this.c is the object of class company
    }

    @Override
    public void run() 
    {
        while (true) {
           this.c.consume_item();
            // object.method()
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
