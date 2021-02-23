package com.yjlhz.singleTonDemo.singleTon;

/**
 * 懒汉式-线程不安全
 */
public class SingleTon4 {
    private static SingleTon4 instance;
    private SingleTon4(){

    }
    public static SingleTon4 getSingleTon4() throws InterruptedException {
        if (instance==null){
            //测试需要，所以添加一个休眠
            Thread.sleep(100);
            instance = new SingleTon4();
        }
        return instance;
    }
}
