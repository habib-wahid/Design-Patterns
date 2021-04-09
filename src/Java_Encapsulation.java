
/* Encapsulation is the process of hiding the implementation of a class form the user.
The variables and method of the class can be accessed only by the
class itself.It's like steering of a car which internally have a lot of
components coupled together which move the car in desired direction but
externally there is only one interface.The dirver actually does not know
how the system is working. */

class EncapTest{
    private String name;
    private String address;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getAge(){
        return age;
    }
}
public class Java_Encapsulation {

    public static void main(String[] args) {
        EncapTest obj = new EncapTest();
        obj.setName("habib");
        obj.setAddress("surma");
        obj.setAge(20);

        System.out.println("Name "+ obj.getName());
        System.out.println("Address "+ obj.getAddress());
        System.out.println("Age "+ obj.getAge());
    }
}
