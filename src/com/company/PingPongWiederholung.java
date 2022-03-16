package com.company;

public class PingPongWiederholung {
    public static void main(String[] args) {

        int number = 1;

        while (number <= 100) {
            System.out.println(number);
            if (number % 6 == 0) {
                System.out.println("Ping !");
            } else if (number % 3 == 0) {
                System.out.println("Pong!");
            } else if (number % 2 == 0) {
                System.out.println("Ping Pong !");
            } else {
                System.out.println("-");
            } number++;
        }

        for (number = 1; number < 100; number ++) {
            System.out.println(number);
            if (number % 6 == 0) {
                System.out.println("Ping !");
            } else if (number % 3 == 0) {
                System.out.println("Pong!");
            } else if (number % 2 == 0) {
                System.out.println("Ping Pong !");
            } else {
                System.out.println("-");
            }
        }
    }
}
