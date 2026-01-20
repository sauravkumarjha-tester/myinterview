package com.myinterview.question;
/*
Write a program that prints all the palindrome till 10000 in java.

Q.What is palindrome?
A. If reverse of number is same as original one, than its palindrome or palindrome is a number which reads the same backward or forward.

Example in java>
input : 121
output: it’s palindrome.


Logic used here will offer you best time and space complexity in java.

time complexity  in java-
taken for each number will be O(n/2).
so, overall complexity of program is 1000 x O(n/2), where n will change from 1 to 1000.
space complexity  in java-
because we are using only one variable i.e. j for palindrome calculation of each number. (i is not counted because it is just used for maintaining 1 to 1000 count)
*/
public class Palindrome {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
    public static void main(String[] args) {
        System.out.println("Palindromes till 10000 are:");
        for (int i = 1; i <= 10000; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
