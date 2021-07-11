package com.DhivyaRenuka;

import java.util.Scanner;

public class calculator_mini_project {
    static float sum1(float a, float b){
        return a+b;
    }
    static float sub1(float a, float b){
        return a-b;
    }
    static float mul(float a, float b){
        return a*b;
    }
    static float div(float a, float b){
        return a/b;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float num1, num2;
        System.out.println("Enter number 1");
        num1= sc.nextFloat();
        System.out.println("Enter number 2");
        num2= sc.nextFloat();
        String choose="Enter 0 for addition "+"1 for subraction , 2 for multiplication and 3 for division";
        System.out.println(choose);
        int c= sc.nextInt();
        System.out.println("selected choice"+c);
        switch (c){
            case 0:
                System.out.println("Addition of two number");
                System.out.println(sum1(num1,num2));
                break;
            case 1:
                System.out.println("Subraction of two number");
                System.out.println(sub1(num1,num2));
                break;
            case 2:
                System.out.println("Multiplication of two number");
                System.out.println(mul(num1,num2));
                break;
            case 3:
                System.out.println("Division of two number");
                System.out.println(div(num1,num2));
                break;
            default:
                System.out.println("Oops !! wrong choice");


        }
    }
}
