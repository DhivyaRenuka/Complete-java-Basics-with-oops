package com.DhivyaRenuka;

public class Exception_handling {
    public static void main(String args[]){
        String [] car={"jaquar","audi","honda","hundai"};
        for(String val :car){
            System.out.println(val);
        }
        try {
            System.out.println(car[6]); // out of array boundary index error

        }
        catch(Exception e){
            System.out.println(e);

        }
        System.out.println("thank you !!!"); // now due to catch this line is printed
    }

}
