package behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        WarnLogger warnLogger = new WarnLogger();
        ErrorLogger errorLogger = new ErrorLogger();

        errorLogger.setNext(warnLogger);

        errorLogger.logMessage();
    }
}
