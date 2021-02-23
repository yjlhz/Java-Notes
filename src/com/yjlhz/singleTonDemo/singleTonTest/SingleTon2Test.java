package com.yjlhz.singleTonDemo.singleTonTest;

import com.yjlhz.singleTonDemo.singleTon.SingleTon1;
import com.yjlhz.singleTonDemo.singleTon.SingleTon2;

public class SingleTon2Test {
    public static void main(String[] args) {
        SingleTon2 s1 = SingleTon2.INSTANCE;
        SingleTon2 s2 = SingleTon2.INSTANCE;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
