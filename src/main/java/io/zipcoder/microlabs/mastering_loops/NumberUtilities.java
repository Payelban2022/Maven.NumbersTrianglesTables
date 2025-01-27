package io.zipcoder.microlabs.mastering_loops;



public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        int i = 0;
       String result = "";

        for (i = start; i <= stop - 1;  i++) {
            if (i % 2 != 0) {
                result = result + Integer.toString(i);
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        int i = 0;
        String result = "";
        for (i= start; i <= stop-1;i++) {
            if (i % 2 == 0) {
                result = result + Integer.toString(i);
            }
        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        int i = 0;
        String result = "";
        for (i= start; i <= stop-1;i = i+step) {
            result = result + Integer.toString((int) Math.pow(i, 2));
        }
        return result;
    }

    public static String getRange(int stop) {
        int i = 0;
        String result="" ;
        for(i = 0; i<= stop-1;i++){
//            System.out.println(i);

            result = result+Integer.toString(i);
        }

        return result;
    }

    public static String getRange(int start, int stop) {
        int i = start;
        String result= "";
        for(i = start; i <= stop-1; i++){


            result = result+Integer.toString(i);
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        int i = step;
        String result = "";
        for (i = start; i <= stop - 1; i = i + step) {
            result = result + Integer.toString(i);
        }
        return result;
    }

    public static String getExponentiations(int start,int stop,int step,int exponents) {
        int i = 0;
        int j = exponents;
        String result = "";
        for(i = start; i <stop; i = i+step) {
            double pow = Math.pow(i, j);
            result = result + Integer.toString((int) pow);

        }
        return result;
    }


  };


