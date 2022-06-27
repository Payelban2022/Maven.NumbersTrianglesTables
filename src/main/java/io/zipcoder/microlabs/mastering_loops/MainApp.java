package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

/**
 * Created by leon on 1/31/18.
 */
public class MainApp {
    public static void main(String[] args) {
        int stop = 11;
        NumberUtilities a= new NumberUtilities();
        System.out.println(a.getRange(stop));

        int start = 5;
        System.out.println(a.getRange(start,stop));

    }
}
