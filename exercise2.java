package com.info;

import java.util.Scanner;

public class exercise2 {
        public static void main(String[] args){
            int num1, num2;
            Scanner numInt = new Scanner(System.in);
            System.out.println("Enter the first integer number: ");
            num1 = numInt.nextInt();
            numInt.close();

            System.out.println("Enter the second integer number: ");
            num2 = numInt.nextInt();
            numImput(num1,num2);
        }
        public static void numImput(int num1, int num2){
            //I think that this process can be optimized by means of some procedure, but I did not find other solution.
            int sum = num1 + num2;
            int res = num1 - num2;
            int mult = num1 * num2;
            int divi = num1 / num2;
            int mod = num1 % num2;
            System.out.println(num1 + " + " + num2 + " " +"="+ " " +sum);
            System.out.println(num1 + " - " + num2 + " " +"="+ " " +res);
            System.out.println(num1 + " * " + num2 + " " +"="+ " " +mult);
            System.out.println(num1 + " / " + num2 + " " +"="+ " " +divi);
            System.out.println(num1 + " % " + num2 + " " +"="+ " " +mod);
        }
    }
