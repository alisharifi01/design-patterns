package structural.decorator.after;

public class X extends D {

    public X(CoreInterface core) {
        super(core);
    }

    public void doIt() {
        super.doIt();
        doX();
    }

    private void doX() {
        System.out.print("X");
    }

}
