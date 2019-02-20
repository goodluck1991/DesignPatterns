package com.guojun.jiao.creational.factory;

import com.guojun.jiao.creational.factory.impl.Shape;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeTypeEnum.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeTypeEnum.SQUARE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeTypeEnum.RECTANGLE);
        shape3.draw();

    }
}
