package com.DhivyaRenuka;

public class looping_statement {
    public static void main(String args[]){
        // while loop
        int i =23;
                while(i<38){
                    System.out.println(i);
                    ++i;
                }
        // do while loop -> this execute atleast once
        System.out.println("do while");
        int j=10;
        do{
            System.out.println(j);
            ++j;

        }while(j>35);

        // for loop
        System.out.println(" for loop");
        for(int k =0 ; k<=10; k++){
            System.out.println(k);
            if (k==6){
                continue;
            }
            if(k == 9){
                break;
            }
        }

        // jump statement
        /*
        break , continue
         */
    }

}
