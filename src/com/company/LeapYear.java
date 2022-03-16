package com.company;

public class LeapYear {
    public static void main(String[] args) {

        //for (int i = 0; i < 2100; i++) {
          //  isLeapYear(i);
        // }
        int year = 1;
        while ( year < 2100) {
            isLeapYear(year);
            year++;
        }

    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

