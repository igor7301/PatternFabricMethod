package pizzaStore;

import pizza.NyCheesePizza;
import pizza.NyOriginalPizza;
import pizza.NyPizza;
import pizza.Pizza;
import utils.PizzaType;

/**
 * Created by IKomarov on 31.12.2014.
 */

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza fabricMethod_CreatePizza(PizzaType type) {
        Pizza nyPizza;
        System.out.println("Create NY pizza style");

        switch (type) {
            case ORIGINAL:
                nyPizza = new NyOriginalPizza();
                break;
            case CHEESE:
                nyPizza = new NyCheesePizza();
                break;
            default:
                nyPizza = new NyPizza();
                break;
        }




        return nyPizza;
    }
}
