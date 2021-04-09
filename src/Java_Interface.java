
 /* Java interface is another way to implement abstract class. It contains all
the abstract method.It can not be used to create object.A class can create
objects.But interface contains all the methods which a class can implement. */

interface  FirstInterface{
    public void mymethod();
}

interface SecondInterface{
    public void mymethod1();
}
public class Java_Interface implements FirstInterface,SecondInterface{

    public void mymethod(){
        System.out.println("This is interface implementation");
    }

    public void mymethod1(){
        System.out.println("This is an example of interface");
    }

    public static void main(String[] args) {

        Java_Interface obj = new Java_Interface();
        obj.mymethod();
        obj.mymethod();

    }

}
