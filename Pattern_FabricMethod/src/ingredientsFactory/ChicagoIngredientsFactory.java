package ingredientsFactory;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class ChicagoIngredientsFactory implements IngredientsFactory {
    @Override
    public void createMeat() {
        System.out.println("Chicago special meat");
    }

    @Override
    public void createTomatos() {
        System.out.println("Chicago cucumbers");
    }

    @Override
    public void createVegitables() {
        System.out.println("Chicago vegitables");
    }

    @Override
    public void createSouce() {
        System.out.println("Chicago hot and spicy souce");
    }
}
