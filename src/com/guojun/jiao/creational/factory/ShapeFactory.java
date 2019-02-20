package com.guojun.jiao.creational.factory;

import com.guojun.jiao.creational.factory.impl.Shape;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class ShapeFactory {

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
}
