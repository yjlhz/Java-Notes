package com.yjlhz.singleTonDemo.singleTonTest;

import com.yjlhz.singleTonDemo.singleTon.SingleTon4;
import com.yjlhz.singleTonDemo.singleTon.SingleTon5;

import java.util.concurrent.*;

public class SingleTon5Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        //单线程测试环境下
//        SingleTon5 s1 = SingleTon5.getSingleTon5();
//        SingleTon5 s2 = SingleTon5.getSingleTon5();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
        //多线程测试环境下
        Callable<SingleTon5> c = new Callable<SingleTon5>() {
            @Override
            public SingleTon5 call() throws Exception {
                return SingleTon5.getSingleTon5();
            }
        };
        //以线程池的方式管理线程
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<SingleTon5> f1 = es.submit(c);
        Future<SingleTon5> f2 = es.submit(c);
        SingleTon5 s1 = f1.get();
        SingleTon5 s2 = f2.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        es.shutdown();
    }
}
