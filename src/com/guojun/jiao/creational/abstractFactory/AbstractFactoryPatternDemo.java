package com.guojun.jiao.creational.abstractFactory;

import com.guojun.jiao.creational.abstractFactory.impl.Color;
import com.guojun.jiao.creational.abstractFactory.impl.Shape;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(FactoryEnum.SHAPE);
        Shape shape1 = abstractFactory1.getShape(ShapeTypeEnum.CIRCLE);
        shape1.draw();
        Shape shape2 = abstractFactory1.getShape(ShapeTypeEnum.RECTANGLE);
        shape2.draw();
        Shape shape3 = abstractFactory1.getShape(ShapeTypeEnum.SQUARE);
        shape3.draw();

        AbstractFactory abstractFactory2 = FactoryProducer.getFactory(FactoryEnum.COLOR);
        Color color1 = abstractFactory2.getColor(ColorTypeEnum.RED);
        color1.fill();
        Color color2 = abstractFactory2.getColor(ColorTypeEnum.GREEN);
        color2.fill();
        Color color3 = abstractFactory2.getColor(ColorTypeEnum.BLUE);
        color3.fill();
    }
}
