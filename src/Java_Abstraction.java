
/* Abstraction means hiding the implementation of the class and showing only the
essential details to the user.Abstraction can be achieved by abstraction class.
Abstract class may containg abstract method.Abstract method means a method without body.
Abstract class can be implemented by inheritance.The child class have to implement
all the abstract methods of abstract class if it inherit an abstract class. */


abstract class Animal1{
    abstract public void animalsound();
    public void animaltalk(){
        System.out.println("Animals can talk");
    }
}

class Cow extends Animal1{
    public void animalsound(){
        System.out.println("Cow sounds Hamba Hamba");
    }
}
public class Java_Abstraction {

    public static void main(String[] args) {
        Cow obj = new Cow();
        obj.animalsound();
        obj.animaltalk();
    }
}
