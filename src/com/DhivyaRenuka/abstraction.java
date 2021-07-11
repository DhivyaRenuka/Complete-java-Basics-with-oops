package com.DhivyaRenuka;

public class abstraction
{
    public static void main(String[] args) {
        /*
        abstraction -> hiding the information from the user
        abstraction can be done with two ways
        1 abstract keyword
         included in abstract method and class this method should always be override by its extended classes
         this can have body
        2 interface
        is the blueprint
        they provide true abstraction
         */
//        car c1 =new car();
//        c1.start();
        audi a= new audi();
        a.start();
        a.breaks();
    }
}
class audi extends car{

    @Override
    void start(){
        System.out.println("Starting my audi car");
    }

}
class BMW extends car{
    @Override
    void start(){
        System.out.println("Starting my BMW car");
    }
}
abstract class car{
    String brand;
    int price;
    abstract void start();
    void breaks(){
        System.out.println("breaking or stopping");
    }

}

