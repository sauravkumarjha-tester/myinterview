package com.myinterview.question;

public class FindNonRepetableCharacter {
    // Find  non-repetable character without using any collection framework 
    public static void main(String[] args) {
        String str = "aabcdeefggi";
        char[] charr = str.toCharArray();
        // check for empty String or character array
        if(charr.length == 0){
            System.out.println("Empty string");
            return;
        }
        // check if only one charecter is present
        if(charr.length ==1){
            System.out.println("Non repetable Character is : " + charr[0]);
            return;
        }
        // More then one character is present
        // create frequency array to store frequency of each character
        int frequency[] = new int[256]; //Assuming ASCII character set
        for(int i = 0; i < charr.length; i++){
            frequency[charr[i]]++;
        }
        for(int i = 0; i < charr.length; i++){
            if(frequency[charr[i]] == 1){
                System.out.println("Non repetable Character is : " + charr[i]);
                continue;
            }
        }
    }
}
