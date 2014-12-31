package pizza;

import ingredientsFactory.IngredientsFactory;

/**
 * Created by IKomarov on 31.12.2014.
 */
public abstract class Pizza {
    public void prepare(IngredientsFactory factory){
        factory.createMeat();
        factory.createSouce();
        factory.createTomatos();
        factory.createVegitables();
    };
    public void bake() {
        System.out.println("Bake Pizza");
    }
    public void cut() {
        System.out.println("Cut Pizza");
    }
    public void box() {
        System.out.println("Box Pizza");
    }

}