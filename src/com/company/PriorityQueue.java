package com.company;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.PriorityQueue<>();

        int max = 10;
        int min = 1;

        for (int i = 0; i < 5; i++) {
            queue.offer((int) (Math.random()*(max-min+1)+min));   //generates random numbers
        }
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.peek());
    }
}
