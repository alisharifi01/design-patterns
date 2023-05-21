package dp.builder;


public class Main{
    public static void main(String[] args) {
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder();
        Pizza pizza = pizzaBuilder.
                cheese(true)
                .pepperoni(true)
                .build();

    }
}
