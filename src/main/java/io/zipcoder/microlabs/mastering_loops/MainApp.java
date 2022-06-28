package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

/**
 * Created by leon on 1/31/18.
 */
public class MainApp {
    public static void main(String[] args) {
        int stop = 20;
        NumberUtilities a= new NumberUtilities();
        System.out.println(a.getRange(stop));

        int start = 5;
        System.out.println(a.getRange(start,stop));

        int step = 5;
        System.out.println(a.getRange(start,stop,step));

        System.out.println(a.getEvenNumbers(start,stop));
        System.out.println(a.getOddNumbers(start,stop));
        System.out.println(a.getSquareNumbers(start,stop,step));

        int exponents= 5;
        System.out.println(a.getExponentiations(start,stop,step,exponents));





    }
}
