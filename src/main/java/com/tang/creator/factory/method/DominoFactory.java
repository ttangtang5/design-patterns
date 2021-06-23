package com.tang.creator.factory.method;

/**
 * @Description 达美乐工厂
 * @Author tang
 * @Date 2021/6/23 21:43
 * @Version 1.0
 **/
public class DominoFactory extends PizzaFactory {

    @Override
    public Pizza create(String name) {
        return new ClamPizza();
    }
}
