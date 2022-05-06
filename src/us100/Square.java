package us100;

public class Square extends Shape{

    private double side;

    public Square(double side) {

        super("square");
        this.side = side;
    }

    @Override
    public double area() {

        return side*side;
    }

    @Override
    public double perimeter() {
        return 4* side;
    }

    @Override
    public String toString() {
        return "\n\n\nSquare{" +
                "\nside=" + side +
                "\narea = "+ area()+
                "\nperimeter = "+ perimeter()+
                "\n}\n\n";
    }
}
