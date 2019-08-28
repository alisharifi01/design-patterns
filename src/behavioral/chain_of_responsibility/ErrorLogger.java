package behavioral.chain_of_responsibility;

public class ErrorLogger extends AbstractLogger {
    @Override
    void write() {
        System.out.println("ERROR");
    }
}
