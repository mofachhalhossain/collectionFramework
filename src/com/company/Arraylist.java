package com.company;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);      //print arraylist

        arrayList.add(8);                 //add element last
        System.out.println(arrayList);

        arrayList.add(1,12);      //add element in index position
        System.out.println(arrayList);

        System.out.println(arrayList.get(4));   //get element at position

        arrayList.remove(Integer.valueOf(2));   //remove element at value
        System.out.println(arrayList);

        arrayList.set(1,93);                     //set element at index
        System.out.println(arrayList);

        System.out.println(arrayList.contains(5));   //check element at index

        arrayList.clear();                          //clear arraylist
        System.out.println(arrayList);
    }
}
