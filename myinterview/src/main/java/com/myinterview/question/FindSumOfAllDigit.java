package com.myinterview.question;

//  write a program to fild sum of all even digit in string
public class FindSumOfAllDigit {
    public static void main(String[] args) {
        String str = "ab23c4d56ef";
        int sum = 0;
        char[] charray = str.toCharArray();
        for(int i = 0; i < charray.length; i++){
            try{
                int ch = Integer.valueOf(String.valueOf(charray[i]));
                if(ch % 2 == 0){
                    sum += ch;
                }
            }
            catch(Exception e){
                continue;
            }  
        }
        System.out.println("Sum of all even digits in the string: " + sum);
    }
}
