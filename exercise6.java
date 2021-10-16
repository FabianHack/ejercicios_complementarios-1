package com.info;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner prod = new Scanner(System.in);

        System.out.print("Enter the first integer number. It's used like base of the operation: ");
        int base = prod.nextInt();
        prod.nextLine();

        System.out.print("Enter the second integer number. It's used like an exponent of the operation: ");
        int exp = prod.nextInt();

        prod.close();

        System.out.println("The result of operation for " + base + " ^ " + exp + " = " + exponential(base, exp));
    }

        public static int exponential(int base, int exp){
            int result = 1;
            //Condition exp ==0.
            if(base > 0 && exp == 0){
                return result;
            }
            //Condition base ==0.
            else if(base == 0 && exp >= 1){
                return 0;
            }
            else{
                for(int i = 1; i <= exp; i++){
                    result *= base;
                }
                return result;
            }
        }
}
