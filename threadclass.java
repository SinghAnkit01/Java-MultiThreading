public class threadclass extends Thread {
    @Override
    public void run() {
        
        for(int i=1;i<=10;i++){
            System.out.println("By using thread class " + i);
        }
        
    }
}
