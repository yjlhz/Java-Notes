package com.yjlhz.singleTonDemo.singleTonTest;

import com.yjlhz.singleTonDemo.singleTon.SingleTon3;

public class SingleTon3Test {
    public static void main(String[] args) {
        SingleTon3 s1 = SingleTon3.instance;
        SingleTon3 s2 = SingleTon3.instance;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
