package com.company;

public class Main {

    public static void main(String[] args) {
        double[] aple ={12.32, -72.45, 64.21, -86.61, 59.39, 41.75, 27.51, -48.28, 83.74, -24.59, 92.37, 82.17, -48.38,};
        double pear = 0;
        int orange = 0;
        boolean glass = false;
        for (double goo: aple){
            if (goo < 0 ) {
                glass = true;
            } else {
                if (glass) {
                    orange++;
                    pear += goo;
                }
            }
             }
        System.out.println(" Среднее арифметическое " + pear/orange);
    }
}

