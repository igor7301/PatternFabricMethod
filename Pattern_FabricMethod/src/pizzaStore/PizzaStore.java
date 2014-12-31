package pizzaStore;


import pizza.Pizza;
import utils.PizzaType;

/**
 * Created by IKomarov on 31.12.2014.
 */
public abstract class PizzaStore {

    abstract Pizza fabricMethod_CreatePizza(PizzaType type);

    //шаблонный метод orderPizza в котором указана логика работы
    //преполагется что эта логика приготовления едина для всех видов пицц
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = fabricMethod_CreatePizza(type);//фабричный метод который определяется субклассами
        //то есть контретные объекты создаются в субклассах
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
