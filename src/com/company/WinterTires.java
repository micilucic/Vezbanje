package com.company;

public class WinterTires {
    public static void main(String[] args) {

        System.out.println(needWinterTires(12,false));

        if (needWinterTires(11, false)) {
            System.out.println("Please use wintertires");
        } else {
            System.out.println("You do not need wintertires");
        }
    }

    public static boolean needWinterTires(int temperature, boolean slipperyRoad) {
        if ((temperature < 10 && (slipperyRoad = true) || temperature < 4 )) {
            return true;
        } else {
            return false;
        }
    }
}
