package com.stackroute;

import java.util.Scanner;

public class WordPresentInSentence {

    public static void main(String[] args) {
        boolean contains = false;
        String name1 = "henry";

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the input");

        String name= scanner.nextLine();
        String[] str = name.split(" ");


        if (name.contains(name1)) {
            contains = true;

            System.out.println("is " + name1 + " here? True");
        } else {

            System.out.println("is " + name1 + " here? False");
        }
    }
}
