// this code finds prime numbers in the range of number user inserted and prints out
// those prime numbers to the console
// if you activate commented codes below they will terminate the code when 10 prime numbers found
// so they are recommended to activate only when you need 10 prime numbers in the range of your given number
package com.karshiev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert your number: ");
        int yourNumber = scanner.nextInt();
        /*int primeNumberCounter = 0;*/
        for (int i = 1; i < yourNumber ; i++) {
            if (isPrimeNumber(i)){
                /*primeNumberCounter++;*/
                System.out.println( i + " is Prime number");
               /* if (primeNumberCounter == 10){
                    break;
                }*/
            }
        }
    }

    private static boolean isPrimeNumber(int n) {
        if (n == 1){
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
