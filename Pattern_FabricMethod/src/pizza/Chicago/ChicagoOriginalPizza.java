package pizza.Chicago;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class ChicagoOriginalPizza extends ChicagoPizza {

    public ChicagoOriginalPizza(){
        System.out.println("Chicago original pizza");
        prepare(getChicagoIngredientsFactory());
    }
}
