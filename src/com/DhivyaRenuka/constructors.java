package com.DhivyaRenuka;

public class constructors {
    /*
    static keyword means this belong to class all he object can access it
     */
    public static void main(String[] args) {
      Human h1= new Human();
      Human h2= new Human(45,"Renuka Devi");

        System.out.println(Human.count);
      h1.name="Dhivya";
      h1.age=21;
      h2.walk();
      h2.eat();
      h2.walk(234);

    }
}
class Human{
    String name; // property of a class
    int age;
    static int count=0;
    public Human(){ //default constructor
        count++;
        System.out.println("human class object created");
    }

    // overloading constructor
    public Human(int age, String name){
        this();  // this keyword is used to call one counstructor from other contructor and both are printed at last
        this.age=age;
        this.name=name; //call the var from other constructor as both anme are same we cannont assign name var it cause warning
    }

      void walk(){
        System.out.println(name+" is walking !");
    }
    void eat(){
        System.out.println(name+" is eating !");
    }
    void walk(int steps){
        System.out.println(name+" walked "+steps+" steps");
    }
    void dowork(){
        System.out.println("Person is working ");
    }
}