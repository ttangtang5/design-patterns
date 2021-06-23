package com.tang.creator.factory.method;

/**
 * @Description 工厂方法：通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的
 * @Author tang
 * @Date 2021/6/23 21:37
 * @Version 1.0
 **/
public abstract class PizzaFactory {

    public abstract Pizza create(String name);
}
