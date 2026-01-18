package com.myinterview.question;

public class ConfusingIfElseOutput {
    public static void main(String[] args) {
        int x = 5;
        if (x > 2)
            if (x < 4)
                System.out.println("Hello World");
            else
                System.out.println("Hello Java");
        else
            System.out.println("Hello Universe");
    }
}
