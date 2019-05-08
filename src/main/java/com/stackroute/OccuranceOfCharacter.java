package com.stackroute;

import java.util.Scanner;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = scanner.next();
        System.out.println("Enter a character to count in the string " + name);
        char c = scanner.next(".").charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (c == name.charAt(i)) {
                count++;
            }
        }
        System.out.println(c + " occurs " + count + " times in " + name);
    }
}

