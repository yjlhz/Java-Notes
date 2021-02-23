package com.yjlhz.singleTonDemo.singleTon;

/**
 * 懒汉式-线程安全
 */
public class SingleTon6 {
    private SingleTon6(){

    }
    private static class Inner{
        private static final SingleTon6 INSTANCE = new SingleTon6();
    }
    public static SingleTon6 getInstance(){
        return Inner.INSTANCE;
    }
}
