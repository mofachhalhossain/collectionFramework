package com.company;

import java.util.Iterator;
import java.util.Queue;

public class LinkedListUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();

        for (int i = 0; i < 5; i++) {
            queue.offer(i);
        }

        Iterator<Integer> interator = queue.iterator();

        while (interator.hasNext()){
            System.out.println(interator.next());
        }

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
