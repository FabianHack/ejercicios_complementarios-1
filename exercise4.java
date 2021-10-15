package com.info;

import java.util.Scanner;

public class exercise4 {
        public static void main(String[] args){
            Scanner numInt = new Scanner(System.in);
            System.out.println("Enter one integer number: ");

            int num = numInt.nextInt();
            numInt.close();


            System.out.println("The factorial of the number " + num + " is = " + factorial(num));
        }

        public static double factorial(int n){
            double aux = 1;

            for (int i=2 ; i <= n ; i++){
                aux *= i;
            }
            return aux;
        }
}
