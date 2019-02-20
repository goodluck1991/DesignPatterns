package com.guojun.jiao.creational.abstractFactory;

/**
 * Created by guojun.jiao on 2019/2/20.
 */
public enum ColorTypeEnum {
    RED("红"),GREEN("绿"),BLUE("蓝");

    private String msg;

    ColorTypeEnum(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
