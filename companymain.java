public class companymain {
    public static void main(String[] args) {
        company comp = new company();
        producer p = new producer(comp);
        consumer c = new consumer(comp);
        p.start();
        c.start();
    }
}
