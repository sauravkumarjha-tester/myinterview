package com.myinterview.question;
// Find two consecutive numbers in an array whose sum is the highest and their indexes.
public class TwoConsecutiveNumberHighestSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 6, 1, 7, 5, 4, 7};
        int sum = 0;
        int maxSum = 0;
        int maxIndex = 0;
        for(int i = 0; i < arr.length; i++){
            int j = i + 1;
            if (j < arr.length){
                sum = arr[i] +arr[j];
                if(sum > maxSum){
                    maxSum = sum;
                    maxIndex = i;
                }
            }else{
                break;
            }
            
        }
        System.out.println("The highest sum of two consecutive numbers is: " + maxSum + "and the number is " + arr[maxIndex] + " and " + arr[maxIndex + 1] + " The indexes of the two consecutive numbers are: " + maxIndex + " and " + (maxIndex + 1));
    }
}