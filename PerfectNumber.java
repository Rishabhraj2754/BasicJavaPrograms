package com.bridgelabzz.basicjavaprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter The Number:");
        Scanner scanner = new Scanner(System.in);
        number= scanner.nextInt();
        int sum = 0;
        for(int i=1; i<number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
            if(number==sum){
                System.out.println(number + " is Perfect Number");
            }
            else{
                System.out.println(number +" Not Perfect Number");
            }
        }
    }

