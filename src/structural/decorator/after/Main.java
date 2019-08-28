package structural.decorator.after;

public class Main {

    public static void main(String[] args) {
        new Y(new X(new A()));
    }
}
