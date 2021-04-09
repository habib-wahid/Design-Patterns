
//Overriding is the process of using a method of superclass by childclass according
//to it's need.Sometimes same method can be used by the superclass and subclass.

class Animal{
    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("Dogs can walk and run");
    }

    public void bark(){

        System.out.println("Dogs bark ");
    }

}
public class Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        a.move();
        b.move();

    }
}
