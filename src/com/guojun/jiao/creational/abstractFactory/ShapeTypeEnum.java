package com.guojun.jiao.creational.abstractFactory;


/**
 * Created by guojun.jiao on 2019/2/20.
 * 图形类型枚举
 */
public enum ShapeTypeEnum {
    CIRCLE("圆形"),RECTANGLE("长方形"),SQUARE("正方形");

    private String msg;

    ShapeTypeEnum(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
