public class producer extends Thread {

    company c;

     producer(company c){
        this.c=c;
        // getting access of produce_item method from class company. 
        // this.c is the object of class company
    }


    @Override
    public void run()
    {
        int i=1;
        while (true) {
            this.c.produce_item(i);
            // object.method()
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            i++;
        }
    }
}
