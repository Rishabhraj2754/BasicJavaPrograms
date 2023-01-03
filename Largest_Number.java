package com.bridgelabzz.basicjavaprograms;

import java.util.Scanner;

public class Largest_Number {
    public static void largest() {

        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
                num1= scanner.nextInt();
        System.out.println("enter the second number");
                num2= scanner.nextInt();
        System.out.println("enter the third number");
                num3= scanner.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println(num1 +" is the largest");
        else if(num2 > num3)
            System.out.println(num2 +" is the largest");
        else
            System.out.println(num3+" is the largest");
    }

    public static void main(String[] args) {
        largest();
    }
}