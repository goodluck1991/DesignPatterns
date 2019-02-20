package com.guojun.jiao.creational.abstractFactory;

import com.guojun.jiao.creational.abstractFactory.impl.Color;
import com.guojun.jiao.creational.abstractFactory.impl.Shape;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(ShapeTypeEnum anEnum){
        return null;
    }

    @Override
    public Color getColor(ColorTypeEnum anEnum) {
        if(anEnum == ColorTypeEnum.BLUE){
            return new Blue();
        }

        if(anEnum == ColorTypeEnum.GREEN){
            return new Green();
        }

        if(anEnum == ColorTypeEnum.RED){
            return new Red();
        }
        return null;
    }
}
