package com.csl.localtest.mq;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author mrlei
 * @Date 2022/6/14 21:18
 * @Version 1.0
 **/
public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
    public void saysth() {
        System.out.println("SINGLETON = " + getInstance());
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("instance = " + instance);

    }
}
