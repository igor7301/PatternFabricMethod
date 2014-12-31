package pizza.Chicago;

import ingredientsFactory.ChicagoIngredientsFactory;
import ingredientsFactory.IngredientsFactory;
import pizza.Pizza;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class ChicagoPizza extends Pizza {
    private IngredientsFactory chicagoIngredientsFactory;

    public ChicagoPizza() {
        this.chicagoIngredientsFactory = new ChicagoIngredientsFactory();
    }

    public IngredientsFactory getChicagoIngredientsFactory() {
        return chicagoIngredientsFactory;
    }

    public void setChicagoIngredientsFactory(IngredientsFactory chicagoIngredientsFactory) {
        this.chicagoIngredientsFactory = chicagoIngredientsFactory;
    }
}
