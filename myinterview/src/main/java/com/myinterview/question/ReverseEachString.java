package com.myinterview.question;

import java.util.ArrayList;
import java.util.List;

/* 
Write a method such that it divides whole string in strings of length 3 and reverses each string, forms its list and return it.

Example 1 in java>
Pass string “abcdefghi” and output will be 
[cba, fed, ihg]




Example 2 in java>
Pass string “abcdefgh” and output will be 
[cba, fed,  hg]

Example 3 in java>
Pass string “abcdefghij” and output will be 
[cba, fed, ihg,   j]
*/

public class ReverseEachString {
    public static void main(String[] args) {
        String input = "abcdefghij";
        int partionSize = 3;
        System.out.println(reverseInGroupsOfList(input, partionSize));
        
    }
    public static List<String> reverseInGroupsOfList(String str, int partitionSize){
        List<String> result = new ArrayList<>();
        for(int i = 0; i < str.length(); ){ // note: no i++ here because we are incrementing i inside the while loop
            StringBuilder sb = new StringBuilder();
            int count = 0;
            while(count < partitionSize && i < str.length()){
                sb.append(str.charAt(i));
                count++;
                i++;
            }
            
            result.add(sb.reverse().toString());
        }
        return result;
    }
}
