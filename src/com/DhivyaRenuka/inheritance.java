package com.DhivyaRenuka;

public class inheritance {
    public static void main(String[] args) {
        Humans h1= new Humans();
//        Humans h2= new Humans(45,"Renuka Devi");
//
//        System.out.println(Human.count);
//        h1.name="Dhivya";
//        h1.age=21;
//        h2.walk();
//        h2.eat();
//        h2.walk(234);

        Developer d1=new Developer(21,"Dhivya");
        d1.eat();
        d1.walk();
        d1.dowork();

        Encapulatin obj=new Encapulatin();
        obj.dowork(); // this is public method that called form other java class out of this java file if the access modifier is changed then it will not be available in other file

    }
}

class Humans {
    String name; // property of a class
    int age;
    static int count = 0;

    public Humans() { //default constructor
        count++;
        System.out.println("human class object created");
    }

    // overloading constructor
    public Humans(int age, String name) {
        this();  // this keyword is used to call one counstructor from other contructor and both are printed at last
        this.age = age;
        this.name = name; //call the var from other constructor as both anme are same we cannont assign name var it cause warning
    }

    void walk() {
        System.out.println(name + " is walking !");
    }

    void eat() {
        System.out.println(name + " is eating !");
    }

    void walk(int steps) { // compiler time polymorphism here the two walk fn is defined during compling the java recognize the path to choose which fn
        System.out.println(name + " walked " + steps + " steps");
    }

    void dowork() {
        System.out.println("Person is working ");
    }
}

class Developer extends Humans{
    public Developer(int age, String name){
        super(age, name); // calling the constructor of Humans class (parent) by using super keyword
    }
    void walk(){
        System.out.println("Developer "+name+" walking !"); // run  time polymorphism while running the java decide and choose which walk fn should be called
    }

}