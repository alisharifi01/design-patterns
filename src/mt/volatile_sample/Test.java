package mt.volatile_sample;


public class Test {

    private volatile static int counter = 0;

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            counter++;
            System.out.println(counter);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter++;
                System.out.println(counter);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter++;
                System.out.println(counter);
            }
        });

        t1.start();
        t2.start();
    }
}
