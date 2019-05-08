package com.stackroute;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        String new_str = str.replace('d', 'f');// Replace all the 'd' characters with 'f' characters.
        String new_str1 = new_str;
        String new_str2 = str.replace('l', 't');// Replace all the 'l' characters with 't' characters.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str2);
    }
}

