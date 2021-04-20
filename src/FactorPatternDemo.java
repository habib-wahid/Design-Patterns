
interface Shape{
    void draw();
}

class Rectangle implements Shape{

    public void draw(){
        System.out.println("Rectangle Class : Rectangle");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Circle Class : Circle");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("Square class : Square");
    }
}

class ShapeFactory{
    public Shape getShape(String shapetype){
        if(shapetype == null)
            return null;
        if(shapetype.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapetype.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shapetype.equalsIgnoreCase("SQUARE"))
            return new Square();
        else
            return null;
    }
}

public class FactorPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapefactory = new ShapeFactory();

        Shape shape1 = shapefactory.getShape("circle");

        shape1.draw();

        Shape shape2 = shapefactory.getShape("rectangle");

        shape2.draw();

        Shape shape3 = shapefactory.getShape("square");

        shape3.draw();
    }
}
