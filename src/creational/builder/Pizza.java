package creational.builder;

public class Pizza {

    private boolean pepperoni;
    private boolean cheese;
    private String sauce;

    private Pizza(PizzaBuilder pizzaBuilder){
        this.pepperoni = pizzaBuilder.isPepperoni();
        this.cheese = pizzaBuilder.isCheese();
        this.sauce = pizzaBuilder.getSauce();
    }

    public static class PizzaBuilder {

        private boolean pepperoni;
        private boolean cheese;
        private String sauce;


        public PizzaBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

        public void setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
        }

        public boolean isPepperoni() {
            return pepperoni;
        }

        public boolean isCheese() {
            return cheese;
        }

        public void setCheese(boolean cheese) {
            this.cheese = cheese;
        }

        public String getSauce() {
            return sauce;
        }

        public void setSauce(String sauce) {
            this.sauce = sauce;
        }
    }

}


