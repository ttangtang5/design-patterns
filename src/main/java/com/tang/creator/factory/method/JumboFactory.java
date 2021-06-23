package com.tang.creator.factory.method;

/**
 * @Description 尊宝披萨工厂
 * @Author tang
 * @Date 2021/6/23 21:41
 * @Version 1.0
 **/
public class JumboFactory extends PizzaFactory {

    @Override
    public Pizza create(String name) {
        return new CheesePizza();
    }
}
