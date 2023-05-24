package com.c0deblack.challenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 * Problem Statement
 * Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.
 *
 * Input
 *
 * First line contains the number of triples, N.
 *
 * The next N lines which follow each have three space separated integers.
 *
 * Output
 * For each of the N triples, output one new line which contains the second-maximum integer among the three.
 *
 * Constraints
 *
 * 1 ≤ N ≤ 6
 *
 * 1 ≤ every integer ≤ 10000
 *
 * The three integers in a single triplet are all distinct. That is, no two of them are equal.
 *
 * Sample Input
 * 3
 * 1 2 3
 * 10 15 5
 * 100 999 500
 * Sample Output
 * 2
 * 10
 * 500
 * </pre>
 */
public class MaxOfThree {

    public static void main(String[] args) {
        int[][] input = getInput();

        for(int[] i : input){
            int middle = getMiddleOfThree(i);
            System.out.println(middle);
        }
    }
    public static int getMiddleOfThree(int[] set){
        Arrays.sort(set);
        return set[1];
    }

    public static int[][] getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of triplets: ");
        int numTriplets = sc.nextInt();

        int[][] output = new int[numTriplets][3];

        System.out.println("Enter " + numTriplets + " row(s) of 3 integers");
        for(int i = 0; i < numTriplets; ++i){
            for(int x = 0; x < 3; x++){
                output[i][x] = sc.nextInt();
            }
        }

        return output;
    }
}
