package com.yjlhz.singleTonDemo.singleTon;

/**
 * 懒汉式-线程安全
 */
public class SingleTon5 {
    private static SingleTon5 instance;
    private SingleTon5(){

    }
    public static SingleTon5 getSingleTon5(){
        if (instance==null){
            synchronized(SingleTon5.class){
                if (instance==null){
                    instance = new SingleTon5();
                }
            }
        }
        return instance;
    }
}
