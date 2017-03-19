package main;


import java.util.Scanner;

public class recursiveMethod {

    static int[] Price = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94}; // Первый пример
    //static int Price[] = {10, 11, 7, 10, 6}; // Второй пример

    public static void main(String[] args) {

        int[] foundDays = findArray();
        viewForConsole.viewResult(Price, foundDays);
    }


    private static int[] findArray() {

        int firstDay = 0, endDay = 0, earnings = 0;
        int counterFirstDay = 0, counterEndDay = 0, counterEarnings = 0;

        Integer Delta[] = new Integer[Price.length - 1];
        for (int i = 0; i < Delta.length; ++i) {
            Delta[i] = Price[i + 1] - Price[i];
        }
        System.out.print("\n");

        for (int i = 0; i < Delta.length; ++i) {
            int newDelta = Delta[i];
            if (counterFirstDay == 0) {
                counterFirstDay = i;
                counterEndDay = i + 1;
                counterEarnings = newDelta;
            } else {
                counterEarnings = counterEarnings + newDelta;
                ++counterEndDay;
            }
            if (counterEarnings <= 0) {
                counterFirstDay = 0;
                counterEndDay = 0;
                counterEarnings = 0;
            } else if (counterEarnings > earnings) {
                firstDay = counterFirstDay;
                endDay = counterEndDay;
                earnings = counterEarnings;
            }
        }

        int [] foundDays = {firstDay,endDay};
        return  foundDays;
    }

    public static int[] getElementsInArray() {
        int[] getElements = findArray();
        int[] foundPrice = {Price[getElements[0]], Price[getElements[1]]};
        return foundPrice;
    }

}