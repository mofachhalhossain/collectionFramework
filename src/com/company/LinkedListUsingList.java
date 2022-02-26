package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListUsingList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
//        for (int a:
//             list) {
//            System.out.print(a+" ");
//        }
        Iterator<Integer> i = list.iterator();

        while(i.hasNext()){
            System.out.print(i.next()+ " ");
        }

        list.remove(Integer.valueOf(3));
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
