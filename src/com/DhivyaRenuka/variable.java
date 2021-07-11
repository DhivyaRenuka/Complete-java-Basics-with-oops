package com.DhivyaRenuka;

import java.sql.SQLOutput;

public class variable {
    public static void main(String args[]){
        System.out.println("Hello");
        /* variables in java
        in java we have lot of containers,
        variables are containers that store data values
        string, int , float,double, char, boolean
        string - text
        int - number
        float - floating point number or decimal
        char - single character
        boolean - true or false

        how to declare a variables:
         syntax -> <datatype> <var name> = < value>
         */

        String  name="Dhivya";
        System.out.println("hello "+name);

        int a=89, x=90,y=87;
        float b=67.89f; // float should include f at end of number
        boolean isAdult=true;
        System.out.println("Integer : "+a +" "+x+" "+y);
        System.out.println("Float :"+b);
        System.out.println("Is Adult: "+ isAdult);
//Rules for constructing variables
        /*
        1 names can begin only with letter or underscore
        2 name should not be a keyword
        3 can start with $ or _
        4 case sensitive language divya var is diffrent fro Divya
        5 variables should not contain white spaces
         */






    }
}
