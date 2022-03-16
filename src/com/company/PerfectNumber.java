package com.company;

public class PerfectNumber {
    public static void main(String[] args) {



        for (int i = 0; i < 100000000; i++) {
            if (isPerfectNumber(i))
                System.out.println(i + " is a perfect number!");
        }
    }

    public static boolean isPerfectNumber(int number) {

        if (number == getSum(number)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

