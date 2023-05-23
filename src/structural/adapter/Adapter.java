package structural.adapter;

public class Adapter implements UsbC {

    UsbA usbA;

    public Adapter(UsbA usbA){
        this.usbA = usbA;
    }

    @Override
    public void transferData() {
        usbA.transfer();
    }

}
