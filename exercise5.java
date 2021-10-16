package com.info;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {

        Scanner prod = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int num1 = prod.nextInt();
        prod.nextLine();

        System.out.print("Enter the second number: ");
        int num2 = prod.nextInt();

        prod.close();

        System.out.println("The result of multiplication by successive sums for " + num1 + " * "+ num2 +" = " + productSums(num1, num2));
        }
        public static int productSums(int n1, int n2){
            int aux = 0;
            //Condition = n1 and n2 !=0.
            if((n1 != 0) && (n2 != 0)){
                for (int i = 1; i <= n2; i++) {
                    aux += n1;
                }
            }
            return aux;
        }
}
