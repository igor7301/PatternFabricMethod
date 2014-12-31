package pizza.NY;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class NyCheesePizza extends NyPizza {
    public NyCheesePizza() {
        System.out.println("NY cheese pizza");
        prepare(getNyIngredientsFactory());

    }
}
