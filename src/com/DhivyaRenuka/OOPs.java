package com.DhivyaRenuka;

public class OOPs {
    /*
    object oriented programming
    object
    class -> blueprint of person we can make many person using single class
    class have property and behaviour
    property - variable
    method- behaviour
     access modifiers -> public, private , protected, default
     public -> can access from anywhere
     private-> can be accessed by only that class
     protected -> can be access by the class and their children
     default -> can be accessed by all within the package

    ->abstraction/ hiding
    ->encapsulation
    ->polymorphism : more than one way walk we used multiple way as walk() and walk(20)
    ->abstract
    interface
    ->inheritance
     */
    public static void main(String[] args) {
        System.out.println("hello world !");
        Person p1= new Person(); // default constructor
        p1.name="Dhivya";
        p1.age=21;
        Person p2 = new Person();
        p2.name="Renuka";
        p2.age=45;
        System.out.println("Person p1 name "+ p1.name+" age "+p1.age);
        System.out.println("Person p2 name "+ p2.name+" age "+p2.age);
        p1.eat(); // accessing the behaviour of class by its property
        p2.walk();
        p1.walk(200);
        p1.walk();
    }
}
class Person{
    String name; // property of a class
    int age;
    void walk(){
        System.out.println(name+" is walking !");
    }
    void eat(){
        System.out.println(name+" is eating !");
    }
    void walk(int steps){
        System.out.println(name+" walked "+steps+" steps");
    }
}