import pizzaStore.ChicagoPizzaStore;
import pizzaStore.NYPizzaStore;
import pizzaStore.PizzaStore;
import utils.PizzaType;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class Client {
    public static void main(String[] arg) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza(PizzaType.ORIGINAL);
        pizzaStore.orderPizza(PizzaType.CHEESE);

        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza(PizzaType.ORIGINAL);


    }
}
