package com.yjlhz.singleTonDemo.singleTon;

/**
 * 饿汉式单例模式
 */
public class SingleTon1 {
    public static final SingleTon1 instance = new SingleTon1();
    private SingleTon1(){

    }
}
