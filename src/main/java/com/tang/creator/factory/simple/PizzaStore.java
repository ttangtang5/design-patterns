package com.tang.creator.factory.simple;

/**
 * @Description
 * @Author tang
 * @Date 2021/6/23 21:23
 * @Version 1.0
 **/
public class PizzaStore {

    private SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void order(String name) {
        Pizza pizza = simpleFactory.createPizza(name);
    }
}
