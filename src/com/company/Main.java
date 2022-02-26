package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Arraylist
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("John");
//        list.add("Sara");
//        System.out.println(list);
//        list.add(1,"Mosh");
//        System.out.println(list);
//
//        ArrayList<String> newList = new ArrayList<String>();
//        newList.add("Siddu");
//        newList.add("Anil");
//        newList.add("Anik");
//
//        list.addAll(newList);
//        System.out.println(list);
//
//        System.out.println(list.get(4));
//
//        list.remove(3);
//        System.out.println(list);
//        list.remove(String.valueOf("Mosh"));
//        System.out.println(list);
//        list.set(2,"Rahul");
//
//        for (String e:
//             list) {
//            System.out.println("->"+e);
//        }
//
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            System.out.println("iterator: "+ it.next());
//        }

//        stack->

//        Stack<String> animals = new Stack<>();
//        animals.push("lion");
//        animals.push("tiger");
//        animals.push("cat");
//
//        for (String e :
//             animals) {
//            System.out.println("Animals-> "+e);
//        }
//
//        System.out.println(animals.pop());
//        System.out.println(animals.peek());
//

//        Queue->

//        Queue<String> queue = new LinkedList<>();
//        queue.offer("John");
//        queue.offer("Smith");
//        queue.offer("sara");
//
//
//        for (String e:
//             queue) {
//            System.out.print(e+" ");
//        }
//
//        queue.poll();
//        System.out.println(queue);


//        Priority Queue

//        Queue<Integer> pqueue = new PriorityQueue<>(Comparator.reverseOrder());
//
//        pqueue.offer(42);
//        pqueue.offer(13);
//        pqueue.offer(84);
//        pqueue.offer(23);
//        System.out.println(pqueue);


//        ArrayDequeue

//        ArrayDeque<Integer> ad = new ArrayDeque<>();
//
//        ad.offer(32);
//        ad.offerFirst(23);
//        ad.offerLast(84);
//
////        ad.peek();
////        ad.peekFirst();
////        ad.peekLast();
//
////        ad.pollFirst();
////        ad.poll();
//        ad.pollLast();
//
//        System.out.println(ad);

//        ArrayDeque<Integer> set = new ArrayDeque<>();
//
//        set.offer(82);
//        set.offer(53);
//        set.offer(94);
//        set.offer(84);
//        set.offer(2);
//        set.offerFirst(32);
//        System.out.println(set.peek());
//        System.out.println(set);



//        Set ->

//        Set<Integer> set = new HashSet<>();

//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(32);
//        set.add(45);
//        set.add(43);
//        set.add(45);
//        System.out.println(set);
//        System.out.println(set.contains(34));
//        set.remove(45);
//        System.out.println(set);

//        TreeHasSet

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(31);
        set.add(48);
        set.add(74);
        set.add(84);
        set.add(38);
        set.add(31);
        System.out.println(set.contains(32));
        System.out.println(set);
        System.out.println(set.isEmpty());




    }
}
