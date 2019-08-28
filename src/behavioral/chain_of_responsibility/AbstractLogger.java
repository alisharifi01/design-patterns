package behavioral.chain_of_responsibility;

public abstract class AbstractLogger {

    private AbstractLogger nextLogger;

    abstract void write();

    public void setNext(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage() {
         write();
         if(nextLogger != null) {
             nextLogger.logMessage();
         }
    }

}
