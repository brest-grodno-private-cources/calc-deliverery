package com.epam.brest;

import java.util.Scanner;

/**
 * 1-st main class. priceCalc=pricePerKg*kg + pricePerKm*km
 */

public class Main {

    public static void main(String[] args) {

        String pricePerKg, pricePerKm, kg, km, stop;

        System.out.println("HELLO!");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Pleace input pricePerKg: ");
            pricePerKg = sc.next();

            System.out.println("pricePerKg = " + pricePerKg + " USD");

            System.out.println("Pleace input kg: ");
            kg = sc.next();
            System.out.println("weight = " + kg + " kg");

            System.out.println("Pleace input pricePerKm: ");
            pricePerKm = sc.next();
            System.out.println("pricePerKm = " + pricePerKm + " USD");

            System.out.println("Pleace input distance: ");
            km = sc.next();
            System.out.println("distance = " + km + " km");

            double result = Double.valueOf(pricePerKg) * Double.valueOf(kg) + Double.valueOf(pricePerKm) * Double.valueOf(km);
            System.out.println("priceCalc = " + result + " USD");

            System.out.println();
            System.out.println("To stop working press 'n' else - any key");
            stop = sc.next();
            if (stop.contains("n")) break;

        }
    }
    private class Proverka {

    }
}
