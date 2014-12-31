package pizzaStore;


import pizza.Pizza;
import utils.PizzaType;

/**
 * Created by IKomarov on 31.12.2014.
 */
public abstract class PizzaStore {

    abstract Pizza fabricMethod_CreatePizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = fabricMethod_CreatePizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
