public class operation extends Thread {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Started");

        int x = 54 + 46;
        System.out.println("Total sum is : " + x);
        // Thread......

        // getName()....
        Thread t = Thread.currentThread();
        // Thread.currentThread() is a static method of Thread class.
        String tname = t.getName();
        System.out.println("Current running thread is : " + tname);

        // setName().....
        System.out.println("After changing name of thread using setName()");
        t.setName("Main default thread");
        Thread.sleep(1000);
        System.out.println("After changing name : " + t.getName());

        // calling run method()
        operation op = new operation();
        // creating object of main class and passing reference to thread to get class
        // into state of execution.
        Thread t1 = new Thread(op);
        t1.start();

        // this thread runs after void run() method
        // new implementation of thread
    //    ..........started new thread.....................

        Runnable newthread2 = () -> {
            System.out.println("New Thread using lambda expression");
            // this is the body of thread
            for (int i = 11; i <= 20; i++) {
                System.out.println(i);
                try {
                    // Thread.sleep(5);
                  
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t3 = new Thread(newthread2);
        Thread nt1 = Thread.currentThread();
        // Thread.currentThread() is a static method of Thread class.
        String tnew =  nt1.getName();
        System.out.println("Current running thread is tnew : " + tnew);
        System.out.println( " Id of thread tnew "+ nt1.getId());
        // Thread.sleep(10000);
        t3.start();

        // .....................ended new thred...........


          //    ..........started new thread.....................

          Runnable newthread3 = () -> {
            System.out.println("New Thread 2 using lambda expression");
            // this is the body of thread
            for (int i = 21; i <= 30; i++) {
                System.out.println(i);
                try {
                    // Thread.sleep(20);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t4 = new Thread(newthread3);
        Thread nt2  =  Thread.currentThread();
        // Thread.currentThread() is a static method of Thread class.
        String tnew2 = nt2.getName();
        System.out.println("Current running thread is tnew2: " + tnew2);
        System.out.println( " Id of thread tnew2 "+ nt2.getId());
        t4.start();

        // .....................ended new thred...........

        System.out.println("Program Ended");
    }

    @Override
    public void run() {

        // System.out.println(Thread.activeCount());
        Thread t = Thread.currentThread();
        // Thread.currentThread() is a static method of Thread class.
        String tname = t.getName();
        System.out.println("Current running thread is tname : " + tname);
        // fetching id of current thread
        System.out.println( " Id of thread tname "+ t.getId());

        try {
            for (int i = 31; i <= 40; i++) {
                System.out.println(i);
                try {
                    // Thread.sleep(5);
                  
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
    e.printStackTrace();
        }

       

    }

}
