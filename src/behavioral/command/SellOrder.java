package behavioral.command;

public class SellOrder implements Order {

    private Stock stock;

    public SellOrder(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        System.out.println("SELL");
    }
}
