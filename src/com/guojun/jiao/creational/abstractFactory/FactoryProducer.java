package com.guojun.jiao.creational.abstractFactory;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryEnum anEnum){
        if(anEnum == FactoryEnum.COLOR){
            return new ColorFactory();
        }

        if(anEnum == FactoryEnum.SHAPE){
            return new ShapeFactory();
        }
        return null;
    }
}
