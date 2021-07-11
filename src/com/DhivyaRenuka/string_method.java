package com.DhivyaRenuka;
import java.util.Scanner;
public class string_method {
    public static void main(String args[] ){
        Scanner s = new Scanner(System.in);
        String input=s.nextLine();
        System.out.println("Entered input : "+input);

        //System.out.println("Enter string");
        //String st=s.next(); // leave the value after white space
        //System.out.println(st);
        //System.out.println("Enter integer");
        // print the length of the string entred
        System.out.println(input.length());
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
        System.out.println(input+ " from\" "+ "chennai \"");
        // \" print the "" in output
        System.out.println(input+ " from\\ "+ "chennai \\");
        // to print / in output screen
        System.out.println(input+ " from\t "+ "chennai \t");
        // print the tab space
        System.out.println(input+ " from\n "+ "chennai ");
        // print content in next line
        System.out.println(input.contains("Di")); // contain the str in our string
        System.out.println(input.charAt(2)); // index 2 value is returned
        //System.out.println(input.endsWith('a'));
        System.out.println(input.indexOf('a')); // return index of a
        System.out.println(input.indexOf('x')); // which is not in the string return -1



    }
}
