package com.yjlhz.singleTonDemo.singleTonTest;

import com.yjlhz.singleTonDemo.singleTon.SingleTon4;

import java.util.concurrent.*;

public class SingleTon4Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        //单线程测试环境下
//        SingleTon4 s1 = SingleTon4.getSingleTon4();
//        SingleTon4 s2 = SingleTon4.getSingleTon4();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
        //多线程测试环境下
        Callable<SingleTon4> c = new Callable<SingleTon4>() {
            @Override
            public SingleTon4 call() throws Exception {
                return SingleTon4.getSingleTon4();
            }
        };
        //以线程池的方式管理线程
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<SingleTon4> f1 = es.submit(c);
        Future<SingleTon4> f2 = es.submit(c);
        SingleTon4 s1 = f1.get();
        SingleTon4 s2 = f2.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        es.shutdown();
    }
}
