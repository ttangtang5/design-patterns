package com.tang.creator.factory.simple;

/**
 * @Description 简单工厂-不是一种设计模式，而是一种编程习惯
 * @Author tang
 * @Date 2021/6/23 21:23
 * @Version 1.0
 **/
public class SimpleFactory {

    public Pizza createPizza(String name) {
        Pizza pizza;

        switch (name) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggle":
                pizza = new VegglePizza();
                break;
            default:
                pizza = new CheesePizza();
        }

        return pizza;
    }
}
