package com.company;

public class PingPong {
    public static void main(String[] args) {

        int counter = 1;
        while (counter < 100) {
            System.out.println(counter);
            if (counter % 6 == 0) {
                System.out.println(" ping !");
            } else if (counter % 3 == 0) {
                System.out.println(" pong !");
            } else if (counter % 2 == 0) {
                System.out.println(" ping pong !");
            } else {
                System.out.println("-");
            }
            counter++;
        }


    }
}

