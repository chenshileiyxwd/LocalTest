package com.csl.localtest.mq;

/**
 * @ClassName MQTesting
 * @Description TODO
 * @Author mrlei
 * @Date 2022/3/20 0:38
 * @Version 1.0
 **/
public class MQTesting {
    private static int a = 0;

    public static void main(String[] args) {
//        System.out.println("a = " + a);
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                cal();
            }, "thread:" + i + "").start();

        }
//        System.out.println("a = " + a);
    }

    public static synchronized void cal() {
        a++;
        System.out.println("a = " + a);
    }
}
