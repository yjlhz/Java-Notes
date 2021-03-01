package com.yjlhz.lock;

class lock implements Runnable{

    private String lockA;
    private String lockB;

    public lock(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName()+"正在占有"+lockA+"尝试获取"+lockB);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName()+"正在占有"+lockB+"尝试获取"+lockA);
            }
        }
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new lock(lockA,lockB),"threadAAA").start();
        new Thread(new lock(lockB,lockA),"threadBBB").start();
    }

}
