package org.example;

import java.util.ArrayDeque;

import java.util.Deque;

public class UniqueNumbersCounter {
    public String findUniqueNumbersCount(int[] arr,int n){
        int count = arr.length;

        if (count == 0){
            return "Give proper input not empty array";
        } else if (arr == null) {
            return "Give proper input not null array";
        } else if (n > count) {
            return "Give proper input, sub array length exceeds array length";
        } else if (n <= 0) {
            return "Give proper input, sub array length can not be negative or zero";
        }
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i=0; i<n; i++){
            if (!deque.contains(arr[i])){
                deque.add(arr[i]);
            }
        }
        return "Count of Unique Numbers is "+ deque.size();
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,1,2};
        UniqueNumbersCounter obj = new UniqueNumbersCounter();

        System.out.println(obj.findUniqueNumbersCount(arr, 3));
    }
}