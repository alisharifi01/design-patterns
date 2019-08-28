package structural.decorator.before;

public class AwithXY extends A {


    private AwithX awithX = new AwithX();
    private AwithY awithY = new AwithY();

    public void doIt(){
        super.doIt();
        awithX.doX();
        awithY.doY();
    }




}
