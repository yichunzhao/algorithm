package com.ynz.smart.queue;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueue {
    private static final ConcurrentLinkedQueue<Integer> concurrentQueue = new ConcurrentLinkedQueue<>();
    private volatile static int counter;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            while (counter < 1_000) {
                int next = new Random().nextInt(1000);
                concurrentQueue.add(next);
                System.out.printf("%s add value: %s%n", Thread.currentThread().getName(), next);

                counter++;
            }
        };

        Thread thread = new Thread(task, "thread-1");
        thread.start();

        Thread thread1 = new Thread(task, "thread-2");
        thread1.start();

        Thread thread2 = new Thread(task, "thread-3");
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();
        System.out.println("size of queue: " + concurrentQueue.size());
    }
}
