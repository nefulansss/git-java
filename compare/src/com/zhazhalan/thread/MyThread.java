package com.zhazhalan.thread;

/**
 * @Author: zhanglan61
 * @Date: 2020/5/24 9:58
 * @Version: 1.0
 */
public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("我是mythread线程");
        System.out.println("我是master");
    }
}
