package ingredientsFactory;

/**
 * Created by IKomarov on 31.12.2014.
 */
public class NyIngredientsFactory implements IngredientsFactory {
    @Override
    public void createMeat() {
        System.out.println("NY meat");
    }

    @Override
    public void createTomatos() {
        System.out.println("NY tomatos");
    }

    @Override
    public void createVegitables() {
        System.out.println("NY vegitables");
    }

    @Override
    public void createSouce() {
        System.out.println("NY souce");
    }
}
