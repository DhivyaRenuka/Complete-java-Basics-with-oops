package com.DhivyaRenuka;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

public class Encapulatin {
    public static void main(String[] args) {
/*
encpsulation -> wrapping up data under common name , achiving data hiding
this all becoz we need security

 */

        Laptop l1 = new Laptop();
        l1.SetPrice(23);
       // l1.price= 23; private var is not available outside the class
        l1.SetPrice(34);
        l1.getPrice();


    }
    protected void dowork(){
        System.out.println("Encapsuled value is called in main program");
    }
}
class Laptop{
    int ram;
    private int price=89;

    public int getPrice() {
        return price;
    }


    public int getRam() {
        return ram;
    }

    public void SetPrice(int price){
        // is user validation
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("your not admin  cannot modify");

        }
        else{
            System.out.println("You can change price of laptop");
            this.price=price;
        }
    }

}
