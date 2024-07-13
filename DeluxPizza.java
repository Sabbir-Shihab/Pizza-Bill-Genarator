public class DeluxPizza extends Pizza {
    public DeluxPizza(Boolean veg){
        super(veg);
        super.addExtraToppings();
        super.addExtraCheese();

    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }
}
