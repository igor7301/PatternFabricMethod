package pizza.NY;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class NyOriginalPizza extends NyPizza {

    public NyOriginalPizza() {
        System.out.println("NY original pizza");
        prepare(getNyIngredientsFactory());

    }
}
