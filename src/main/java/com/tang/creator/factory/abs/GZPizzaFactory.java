package com.tang.creator.factory.abs;

/**
 * @Description 广州披萨工厂
 * @Author tang
 * @Date 2021/6/23 22:42
 * @Version 1.0
 **/
public class GZPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }

    @Override
    public Drink createDrink() {
        return new MilkDrink();
    }
}
