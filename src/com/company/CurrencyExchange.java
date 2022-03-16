package com.company;

public class CurrencyExchange {
    public static void main(String[] args) {

        System.out.println(exchangeCurrency("SEK", 15));


    }

    public static double exchangeCurrency(String currencyID, double value) {

        if (currencyID.equals("HUF")) {
            value = value * 328.61;
            System.out.println("The value of " + currencyID + " in Euro is " + value);
        }
        if (currencyID.equals("SEK")) {
            value = value * 10.76;
            System.out.println("The value of " + currencyID + " in Euro is " + value);
        }
        if (currencyID.equals("USD")) {
            value = value * 1.12;
            System.out.println("The value of " + currencyID + " in Euro is " + value);
        }
        if (currencyID.equals("CAD")) {
            value = value * 1.47;
            System.out.println("The value of " + currencyID + " in Euro is " + value);
        }
        return (value);

    }

    /* public static double currencyExchange(String currencyID, int value) {
        double convertedValue;
        switch (currencyID) {
            case "HUF" -> convertedValue = value * 328.61;
            case "SEK" -> convertedValue = value * 10.76;
            case "USD" -> convertedValue = value * 1.12;
            default -> {
                System.out.println(currencyID + " could not be exchanged.");
                convertedValue = value;
            }
            return convertedValue;
        }
    } */
}



