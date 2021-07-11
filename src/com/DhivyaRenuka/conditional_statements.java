package com.DhivyaRenuka;

import java.util.Scanner;

public class conditional_statements {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the age :");
        int age= s.nextInt();
        /*
        types of conditional statements
        1 if statement
        2 if else statement
        3 if else if statement ladder statement
         */
        // if statement true always the condition will execute
        int a=90;
        if (true){
            System.out.println("print a always as "+a);
        }
        // ladder statement
        if(age<8){
            System.out.println("Ur a Kid");
        }
        else if(age <16)
        {
            System.out.println("ur a teenager");
        }
        else{
            System.out.println("ur an adult");
        }


    }
}
