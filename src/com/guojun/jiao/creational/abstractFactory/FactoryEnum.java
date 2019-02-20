package com.guojun.jiao.creational.abstractFactory;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public enum FactoryEnum {
    SHAPE("图形"),COLOR("颜色");
    private String msg;

    FactoryEnum(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
