package structural.adapter;

public class Main {

    public static void main(String[] args) {
        UsbC adapter = new Adapter(new UsbA());
        adapter.transferData();
    }
}
