public class daemon implements Runnable {
    public static void main(String[] args) {
        daemon d1 = new daemon();
        Thread t1 = new Thread(d1);
        t1.start();

    //    Object n1 = d1.name();
    //    System.out.println(n1);
    }

    // public Object name(){
    //     // return null;
    //     // return 123;
    //     // return "Ankit";
    //     // return 23.22;
    //     // return 88881L;
    //     // return 'A';
    // }

    @Override
    public void run() {
        setDaemon(true);
        System.out.println("This is a daemon thread");
        Thread t = Thread.currentThread();
        System.out.println(" Current thread name" +t);
        String tname = t.getName();
        System.out.println("Current running thread is daemon : " + tname);
        System.out.println( " Id of thread daemon "+ t.getId());
      
    }

    private void setDaemon(boolean b) {
        System.out.println(b);
    }
}
