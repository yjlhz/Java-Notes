package com.yjlhz.callableDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThead implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("call run!");
        return 1024;
    }
}

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThead());
        Thread t = new Thread(futureTask,"AA");
        t.start();
        System.out.println(futureTask.get());
    }

}
