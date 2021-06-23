package com.tang.creator.factory.abs;

/**
 * @Description 深圳披萨工厂
 * @Author tang
 * @Date 2021/6/23 22:42
 * @Version 1.0
 **/
public class SZPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new ClamPizza();
    }

    @Override
    public Drink createDrink() {
        return new FruitDrink();
    }
}
