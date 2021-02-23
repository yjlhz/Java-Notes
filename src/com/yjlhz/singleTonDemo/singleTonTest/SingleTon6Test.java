package com.yjlhz.singleTonDemo.singleTonTest;

import com.yjlhz.singleTonDemo.singleTon.SingleTon5;
import com.yjlhz.singleTonDemo.singleTon.SingleTon6;

import java.util.concurrent.*;

public class SingleTon6Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        //单线程测试环境下
//        SingleTon6 s1 = SingleTon5.getSingleTon6();
//        SingleTon6 s2 = SingleTon5.getSingleTon6();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
        //多线程测试环境下
        Callable<SingleTon6> c = new Callable<SingleTon6>() {
            @Override
            public SingleTon6 call() throws Exception {
                return SingleTon6.getInstance();
            }
        };
        //以线程池的方式管理线程
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<SingleTon6> f1 = es.submit(c);
        Future<SingleTon6> f2 = es.submit(c);
        SingleTon6 s1 = f1.get();
        SingleTon6 s2 = f2.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        es.shutdown();
    }
}
