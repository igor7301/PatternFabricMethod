package pizzaStore;

import pizza.Chicago.ChicagoOriginalPizza;
import pizza.Chicago.ChicagoPizza;
import pizza.Pizza;
import utils.PizzaType;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza fabricMethod_CreatePizza(PizzaType type) {
        Pizza chicagoPizza;
        System.out.println(" - - - -Start to create Chicago pizza style  - - - ");

        switch (type) {
            case ORIGINAL:
                chicagoPizza = new ChicagoOriginalPizza();
                break;
            default:
                chicagoPizza = new ChicagoPizza();
                break;
        }




        return chicagoPizza;
    }
}
