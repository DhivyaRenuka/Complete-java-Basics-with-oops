package com.DhivyaRenuka;

public class arrays {

public static void main(String args[]){
    int [] marks ={1,2,3,4,5};
    System.out.println(marks[0]);
    System.out.println(marks[4]);
    marks[0]=34; // changes the value of array index 1 (updated value)
    System.out.println(marks[0]);

    System.out.println("print all marks in array");
    for (int i=0;i<=marks.length;i++){
        System.out.println(marks[i]);
    }

    System.out.println("Print by for each");
    // using for each print the array
    for (int val:marks){
        System.out.println(val);
    }

    // creating 2d array = matrix

    int [][] matrix ={{1,2,3},{4,5,6}};
    System.out.println(matrix[0][2]);
    System.out.println("print the 2 d array");
    for (int j =0 ;j<=matrix.length;j++){
        for(int k=0; k<=matrix.length;k++){
            System.out.print(matrix[j][k]+" ");
        }
        System.out.println();
    }

    // string array
    String [] car={"jaquar","audi","honda","hundai"};
    for(String val :car){
        System.out.println(val);
    }

}








}
