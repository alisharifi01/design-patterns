package behavioral.chain_of_responsibility;

public class WarnLogger extends AbstractLogger {

    @Override
    void write() {
        System.out.println("WARN");
    }
}
