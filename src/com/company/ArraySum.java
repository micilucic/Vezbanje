package com.company;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7};

        System.out.println(calculateSum(numbers));
    }


    static public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
