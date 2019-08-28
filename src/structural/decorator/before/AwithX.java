package structural.decorator.before;

public class AwithX extends A {

    public void doIt() {
        super.doIt();
        doX();
    }

    public void doX(){
        System.out.println("X");
    }
}
