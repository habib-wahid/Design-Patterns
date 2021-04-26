
class SingleObject{
    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void message(){
        System.out.println("hello eveyone");
    }
}


public class SinglePatternDemo {

    public static void main(String[] args) {

        SingleObject obj = SingleObject.getInstance();

        obj.message();

    }
}
