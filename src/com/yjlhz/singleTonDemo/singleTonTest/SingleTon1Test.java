package com.yjlhz.singleTonDemo.singleTonTest;

import com.yjlhz.singleTonDemo.singleTon.SingleTon1;

public class SingleTon1Test {
    public static void main(String[] args) {
        SingleTon1 s1 = SingleTon1.instance;
        SingleTon1 s2 = SingleTon1.instance;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
