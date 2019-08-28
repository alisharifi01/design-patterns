package structural.decorator.after;


public class D implements CoreInterface {

    public CoreInterface core;

    public D(CoreInterface core) {
        this.core = core;
    }

    @Override
    public void doIt() {
        core.doIt();
    }
}
