
//Java Inheritance is the process where one class can acquire the properties
//of other class.The class which inherits the properties of other class is called
//sub-class.The class which is inherited called superclass.

import java.util.Scanner;

class Calculation{
    int z;
    public void addition(int x,int y){
         z = x+y;
        System.out.println("The sum of given intergers: "+z);
    }

    public void subtraction(int x,int y){
         z = x-y;
        System.out.println("The difference is: "+z);
    }

    int num = 20;
    public void display(){
        System.out.println("This is the display method of superclass");
    }

}

public class Java_Inheritance extends Calculation{

    public void multiplication(int x,int y){
         z = x*y;
         System.out.println("The product is: "+z);
    }

    int num = 10;

    public void display(){
        System.out.println("This is the display method of subclass");
    }

    public void my_method(){
        Java_Inheritance sub = new Java_Inheritance();

        sub.display();
        super.display();

        System.out.println("value of the variable num in subclass is : "+sub.num);
        System.out.println("value of the variable num in superclass is : "+super.num);

    }


    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int a = myobj.nextInt();
        int b = myobj.nextInt();


        Java_Inheritance myclass = new Java_Inheritance();
        myclass.addition(a,b);
        myclass.subtraction(a,b);
        myclass.multiplication(a,b);


        myclass.my_method();




    }

}
