package com.tang.creator.factory.method;

/**
 * @Description 披萨抽象类 具体的事物抽象就用抽象类，一般名称抽象用abstract，形容词用implement
 * @Author tang
 * @Date 2021/6/23 21:18
 * @Version 1.0
 **/
public abstract class Pizza {

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
