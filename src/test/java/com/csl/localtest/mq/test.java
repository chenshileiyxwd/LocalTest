package com.csl.localtest.mq;

import java.util.ArrayList;
import java.util.Objects;

public class test {
    int age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        test test = (test) o;
        return age == test.age && name.equals(test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("instance = " + instance);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton instance1 = Singleton.getInstance();
                System.out.println("thread->instance1 = " + instance1);
                System.out.println(Thread.currentThread().getName());
            }, "t" + i).start();
        }

    }
}