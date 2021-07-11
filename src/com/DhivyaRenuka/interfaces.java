package com.DhivyaRenuka;

public class interfaces  {
    public static void main(String[] args) {
        interface_imp i =new interface_imp();
        i.start();
    }

        /*
        everything inside the interface is public and abstract in nature
        this follow true abstraction we cannot define body for fn in interfaces

        java does not allow multiple parents in it so interfaces are used in such places
         */

}
interface Carrrs{
    void start();
}

 class interface_imp implements Carrrs{
    public void start(){
        System.out.println("starting the car");

    }
}