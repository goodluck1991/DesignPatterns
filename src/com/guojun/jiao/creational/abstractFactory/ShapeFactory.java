package com.guojun.jiao.creational.abstractFactory;

import com.guojun.jiao.creational.abstractFactory.impl.Color;
import com.guojun.jiao.creational.abstractFactory.impl.Shape;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(ShapeTypeEnum anEnum){
        if(anEnum == ShapeTypeEnum.CIRCLE){
            return new Circle();
        }

        if(anEnum == ShapeTypeEnum.RECTANGLE){
            return new Rectangle();
        }

        if(anEnum == ShapeTypeEnum.SQUARE){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(ColorTypeEnum anEnum) {
        return null;
    }
}
