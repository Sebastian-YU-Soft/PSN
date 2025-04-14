package com.ps;

import java.util.Scanner;

public class Main {
//    public static void calculateCompoundInterest(Scanner scanner) {
//        System.out.print("Enter principle amount: ");
//        double principal = scanner.nextDouble();
//
//        System.out.print("Enter annual interest rate (%):");
//        double rate = scanner.nextDouble();
//
//        System.out.print("Enter number of times interest applied per year:");
//        int n = scanner.nextInt();
//
//        System.out.print("Enter time (in years):");
//        double time = scanner.nextDouble();
//
//        double amount = principal * Math.pow((1 + rate/ n), n * time);
//        double interest = amount- principal;
//
//        System.out.printf("Compound Interest = $%.2f\n", interest);
//    }

//    public static void main( String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        System.out.println("Compound Interest");
//        System.out.print("Enter the principal amount");
//        double principal = scanner.nextDouble();
//
//        System.out.print("Enter the annual interest rate:");
//        double annualRate = scanner.nextDouble() / 100;
//
//        System.out.print("Enter the number of times interest is compound per year (n):");
//        int compoundingPerYear = scanner.nextInt();
//
//        System.out.print("Enter the number of years (t):");
//        double years = scanner.nextDouble();
//
//        double futureValue;
//        futureValue = principal * Math.pow(1 + (annualRate / compoundingPerYear),compoundingPerYear );
//
//        System.out.print("Ending Balance = $%.2F\n");
//        System.out.print("futureValue -principal");
//
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Present Value Calculator");

        System.out.print("Enter the future value (FV): ");
        double futureValue = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        double years = scanner.nextDouble();

        double presentValue = futureValue / Math.pow(1 + annualRate, years);
        double interestAmount = futureValue  - presentValue;

        System.out.print("\n Present Value = $%.2f\n");
        System.out.print("Total Interest to Reach FV = $%.2f\n ");
    }
}
