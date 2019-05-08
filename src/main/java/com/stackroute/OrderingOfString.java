package com.stackroute;

import java.util.Scanner;

public class OrderingOfString {
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines of the paragraph");
        n = scanner.nextInt();
        String[] names = new String[n];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the string");
        for (int i = 0; i < n; i++) {
            names[i] = scanner1.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(names[i] + ",");
        }
        System.out.println(names[n - 1]);
    }
}
