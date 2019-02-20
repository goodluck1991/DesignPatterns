package com.guojun.jiao.creational.abstractFactory;

import com.guojun.jiao.creational.abstractFactory.impl.Color;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
