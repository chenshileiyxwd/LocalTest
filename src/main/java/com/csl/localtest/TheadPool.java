package com.csl.localtest;

import java.util.concurrent.*;

/**
 * @ClassName TheadProol
 * @Description TODO
 * @Author mrlei
 * @Date 2023/4/11 20:47
 * @Version 1.0
 **/
public class TheadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 3, 10, TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 3; i++) {
            executor.execute(new TheadTask());
        }
    }
}
