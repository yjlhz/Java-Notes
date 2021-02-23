package com.yjlhz.singleTonDemo.singleTon;

import java.io.IOException;
import java.util.Properties;

/**
 * 饿汉式单例模式
 */
public class SingleTon3 {
    public static final SingleTon3 instance;
    private String info;
    static {
        Properties pro = new Properties();
        try {
            pro.load(SingleTon3.class.getClassLoader().getResourceAsStream("SingleTonTest.properties"));
            String str = pro.getProperty("info");
            instance = new SingleTon3(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private SingleTon3(String s){
        this.info=s;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "SingleTon3{" +
                "info='" + info + '\'' +
                '}';
    }
}
