package com.myinterview.question;

import java.util.HashSet;
import java.util.Set;

/*
Write a program to delete repeated characters from two strings in java.

Take two Strings, compare them and delete repeated characters from two strings, when a match is found in the other string.

Example 1 in java>
s1 = abc , s2 = cde
Modified s1 = ab,  Modified s2 = de

If you notice above example  ‘c’ was common character and has been deleted from both strings.

Example 2 in java>
s1 = abc@ , s2 = cd@e
Modified s1 = ab,  Modified s2 = de

If you notice above example  ‘c’ and ‘@’ were common characters and both has been deleted from both strings.

Example 3 in java>
s1 = aBc , s2 = bcde
Modified s1 = a,  Modified s2 = de

If you notice above example  ‘b’ and ‘c’ were common characters and both has been deleted from both strings. We don’t care about case sensitivity.
*/
public class DeleteRepeatedCharacter {
    public static void main(String[] args) {
        // Taking Two String s1 and s2
        String s1 = "aBc";
        String s2 = "bcde";
        // convert both string in to Lowercase to ignore case sensitivity
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();

        // store all unique character of both String
        Set<Character> charSet1 = new HashSet<>();
        Set<Character> charSet2 = new HashSet<>();

        // add all characters of first string to charSet1
        for (char ch : str1.toCharArray()){
            charSet1.add(ch);
        }
        // add all characters of second string to charSet2
        for (char ch : str2.toCharArray()){
            charSet2.add(ch);
        }
        // find common characters from both strings
        Set<Character> commonCharSet = new HashSet<>(charSet1);
        commonCharSet.retainAll(charSet2);
        // remove common characters from s1
        StringBuilder modifiedS1 = new StringBuilder();
        for(char ch : str1.toCharArray()){
            if(!commonCharSet.contains(ch)){
                modifiedS1.append(ch);
            }
        }

        // remove common characters from s2
        StringBuilder modifiedS2 = new StringBuilder();
        for(char ch : str2.toCharArray()){
            if(!commonCharSet.contains(ch)){
                modifiedS2.append(ch);
            }
        }

        System.out.println("Modified s1 = " + modifiedS1.toString() + ", Modified s2 = " + modifiedS2.toString());

    }
    
}
