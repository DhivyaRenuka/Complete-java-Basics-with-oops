package com.DhivyaRenuka;

import java.util.Scanner;

public class switch_case {
    public static void main(String args[]){
// switch statement
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch(choose) {
            case 3:
                System.out.println("wednesday !");
                break; // break the line after this jump statement
            case 5:
                System.out.println("Friday");
                break;

                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Oops ! no option available");
                break;
        }
    }

}
