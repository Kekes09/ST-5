package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        double val = Double.parseDouble("64.0");
        Sqrt sqrt = new Sqrt(val);
        double result = sqrt.calc();
        System.out.println("Sqrt of " + val + " = " + result);
    }
}