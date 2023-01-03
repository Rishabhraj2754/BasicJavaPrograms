package com.bridgelabzz.basicjavaprograms;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int number;
        int count=0;
        System.out.println("Enter The Number:");
        Scanner scanner = new Scanner(System.in);
        number= scanner.nextInt();
        for(int i=2;i<=number/2;i++){
            if(number % i == 0){
                System.out.println(number + " Is Not Prime" );
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(number + " Is a Prime Number");
        }
    }
}
