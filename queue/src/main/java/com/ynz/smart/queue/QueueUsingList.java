package com.ynz.smart.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingList {
    static Queue<Integer> queue = new LinkedList<>();

    static {
        try {
            queue.offer(1);
            queue.offer(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        while (queue.peek() != null) {
            int v = queue.poll();
            System.out.println(v);
        }
    }
}
