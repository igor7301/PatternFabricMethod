package pizza.NY;

import ingredientsFactory.IngredientsFactory;
import ingredientsFactory.NyIngredientsFactory;
import pizza.Pizza;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class NyPizza extends Pizza {
    private IngredientsFactory nyIngredientsFactory;

    public NyPizza() {
        this.nyIngredientsFactory = new NyIngredientsFactory();
    }

    public IngredientsFactory getNyIngredientsFactory() {
        return nyIngredientsFactory;
    }

    public void setNyIngredientsFactory(IngredientsFactory nyIngredientsFactory) {
        this.nyIngredientsFactory = nyIngredientsFactory;
    }
}
