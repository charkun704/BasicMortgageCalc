package com.charkun704;

import java.text.NumberFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principle, annualIntRate, period;

        System.out.print("What is your principle amount? ");
        principle = sc.nextDouble();

        System.out.print("What is your annualIntRate? ");
        annualIntRate = sc.nextDouble();
        annualIntRate = annualIntRate / 100;

        System.out.print("What is your payment period in years? ");
        period = sc.nextDouble();

        calc(principle,annualIntRate,period);
    }

    public static void calc(double principle, double annualIntRate, double period){
        double m, r, n;
        r = annualIntRate/12;
        n = period*12;

        m = principle * ( (r * Math.pow((1+r),n)) / ( Math.pow((1+r),n) - 1) );

        NumberFormat nF = NumberFormat.getCurrencyInstance();


        System.out.println("Your monthly mortgage payment is "+ nF.format(m));
    }
}
