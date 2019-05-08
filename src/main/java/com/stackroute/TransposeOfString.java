package com.stackroute;

import java.util.Scanner;

public class TransposeOfString {
    public static void main(String[] args) {
        TransposeOfString obj = new TransposeOfString();
        System.out.println("enter statement");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        obj.reverseWordInMyString(a);//reversing the string
    }

    public void reverseWordInMyString(String str) {
        String[] words = str.split(" ");//splitting the string
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
}

