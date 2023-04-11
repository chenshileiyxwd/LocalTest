package com.csl.localtest;

/**
 * @ClassName TheadTask
 * @Description TODO
 * @Author mrlei
 * @Date 2023/4/11 21:04
 * @Version 1.0
 **/
public class TheadTask implements Runnable{
    @Override
    public void run() {
        System.out.println("thread name :" + Thread.currentThread().getName());
    }

}
