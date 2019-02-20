package com.guojun.jiao.creational.abstractFactory;

import com.guojun.jiao.creational.abstractFactory.impl.Shape;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
