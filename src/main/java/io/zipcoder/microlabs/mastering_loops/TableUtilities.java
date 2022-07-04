package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
//        int a;
//        System.out.println("Enter no. ");
//        Scanner in = new Scanner(System.in);
//        a = in.nextInt();


        String finalResult="";
        String result="";
        for(int j = 1; j <= 5; j++){
            for(int i = 1; i <= 5; i++){
                result = result + " " +(j*i)+ " |" ;
            }
//            System.out.println(result);
            finalResult = finalResult+result+ "\n";
            result="";
        }
        System.out.println(finalResult);
        return finalResult;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
