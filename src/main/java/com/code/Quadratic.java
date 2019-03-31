package com.code;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficient a = ");
        double a = scanner.nextDouble();
        System.out.println("Enter coefficient b = ");
        double b = scanner.nextDouble();
        System.out.println("Enter coefficient c = ");
        double c = scanner.nextDouble();
        System.out.println("Quadratic Equation of form is "+ a + " * x2 + "+ b +" * x + "+ c +" = 0");
        double delta = b*b - 4*a*c;
        if (delta > 0){
            System.out.println("Quadratic has roots is: x1 = " + (-b+Math.sqrt(delta))/(2*a)+
                    ", x2 = "+ (-b-Math.sqrt(delta))/(2*a));
        }else if (delta == 0){
            System.out.println("Quadratic has root is: x = "+ (-b)/(2*a));
        }else {
            System.out.println("Quadratic NOT real root.");
        }
    }
}
