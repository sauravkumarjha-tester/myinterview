package com.myinterview.question;

public class PalindromeString {
    public static boolean isPalindromeString(String str){
        int start =0, end = str.length() -1;
        while (start < end){
            if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Madam ";
        if(isPalindromeString(str)){
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
    }
}
