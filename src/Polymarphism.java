
//Polymorphism is the process of using same method in different ways.When a method can
//work differently then polymorphism is used.

class Employee{
    String name;
    String address;
    int number;

    public Employee(String name,String address,int number){
        System.out.println("Constructing and Employee");
        this.name = name;
        this.address = address;
        this.number = number;

    }

    public void mailcheck(){
        System.out.println("Mailing a check to "+ name+" "+address);
    }

    public String toString(){
        return name+" "+address+" "+number;
    }

}

class Salary extends Employee{
    int salary;
    public Salary(String name,String address,int number,int salary){
        super(name,address,number);
        this.salary = salary;
    }

    public void mailcheck(){
        System.out.println("Within mailcheck of Salary class");
        System.out.println("Mailing check to "+ name+" "+address+" "+salary);
    }


}
public class Polymarphism {
    public static void main(String[] args) {
        Salary s = new Salary("Habib","akhalia",012,3600);
        Employee e = new Salary("Nuru","surma",022,4000);

        s.mailcheck();
        e.mailcheck();

    }
}
