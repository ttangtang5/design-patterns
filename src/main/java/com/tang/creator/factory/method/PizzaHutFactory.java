package com.tang.creator.factory.method;

/**
 * @Description 必胜客工厂
 * @Author tang
 * @Date 2021/6/23 21:40
 * @Version 1.0
 **/
public class PizzaHutFactory extends PizzaFactory {

    @Override
    public Pizza create(String name) {
        return new VegglePizza();
    }
}
