package com.myinterview.question;

public class FindPairOfGivenNumer {
    // Find pair of given sum in java array

    public static void main(String[] args) {
        System.out.println("Find pair of given sum in java array");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 10;

        // findPairsOfSum(arr, sum);
    }
    

    // Approach 2: HashMap approach

    // public static void findPairsOfSum(int[] arr, int sum) {
    //     java.util.HashMap<Integer,Integer> map = new java.util.HashMap<>();
    //     int pairCount = 0;
    //     for (int num : arr) {
    //         int complement = sum - num;
    //         if (map.containsKey(complement)) {
    //             int count = map.get(complement);
    //             for (int i = 0; i < count; i++) {
    //                 System.out.println("Pairs found: " + complement + " " + num);
    //                 pairCount++;
    //             }
    //         }
    //         map.put(num, map.getOrDefault(num, 0) + 1);
    //     }
       
    // }

    // Approach 1: Brute Force
    // public static void main(String[] args) {
    // System.out.println("Find pair of given sum in java array");
    // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // int sum = 10; // Given sum to find pairs for like (1,5), (2,4), (3,3)
    // // concider all possible paires and checkit

    // int pairCount = 0;

    // for(int i = 0; i <arr.length; i++){
    // for (int j = i ; j < arr.length; j++){
    // if (arr[i] + arr[j] == sum){
    // System.out.println("Pairs found: "+ arr[i] + " " + arr[j]);
    // pairCount++;
    // }
    // }
    // }

    // System.out.println("Total pairs count : " + pairCount);

    // }

}
