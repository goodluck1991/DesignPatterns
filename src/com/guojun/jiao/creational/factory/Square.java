package com.guojun.jiao.creational.factory;

import com.guojun.jiao.creational.factory.impl.Shape;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
