package com.tang.creator.factory.abs;

/**
 * @Description
 * @Author tang
 * @Date 2021/6/23 22:44
 * @Version 1.0
 **/
public class PizzaStore {

    public void order() {
        PizzaFactory pizzaFactory = new SZPizzaFactory();

        Drink drink = pizzaFactory.createDrink();
        Pizza pizza = pizzaFactory.createPizza();
    }
}
