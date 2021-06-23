package com.tang.creator.factory.abs;

/**
 * @Description 抽象工厂：主要侧重一个工厂处理一组相关的对象的实例化。
 * @Author tang
 * @Date 2021/6/23 22:39
 * @Version 1.0
 **/
public abstract class PizzaFactory {

    public abstract Pizza createPizza();

    public abstract Drink createDrink();
}
