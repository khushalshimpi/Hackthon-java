package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter numbers :");
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        String[] str = new String[n];
        System.out.println("Enter strings :");
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }

        System.out.println("Displaying numbers");
        for(int no : num){
            System.out.println(no);
        }

        System.out.println("Displaying strings");
        for(String w : str){
            System.out.println(w);
        }

    }

}