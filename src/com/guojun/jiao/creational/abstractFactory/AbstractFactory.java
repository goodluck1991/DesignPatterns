package com.guojun.jiao.creational.abstractFactory;

import com.guojun.jiao.creational.abstractFactory.impl.Color;
import com.guojun.jiao.creational.abstractFactory.impl.Shape;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeTypeEnum anEnum);


    public abstract Color getColor(ColorTypeEnum anEnum);
}
