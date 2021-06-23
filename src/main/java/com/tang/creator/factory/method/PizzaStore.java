package com.tang.creator.factory.method;

/**
 * @Description
 * @Author tang
 * @Date 2021/6/23 21:23
 * @Version 1.0
 **/
public class PizzaStore {

    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void order(String name) {
        Pizza pizza = pizzaFactory.create(name);
    }
}
