package mt.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {


    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
        ArrayBlockingQueue<String> q2 = new ArrayBlockingQueue<String>(10);

        String poll = q2.take();

        System.out.println(poll);
    }
}
