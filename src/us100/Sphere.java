package us100;

public class Sphere extends Shape implements Volume{

    private double radius;
    public static final double pi = 3.14;

    public Sphere(Double radius) {

        super("sphere");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("radius can ot be zero or below zero");
        }
        this.radius = radius;
    }

    @Override
    public double area() {

        return pi* radius* radius;
    }

    @Override
    public double perimeter() {

        return 2* pi* radius;
    }

    @Override
    public double volume() {

        return pi* radius* radius* radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                "area =" + area() +
                "perimeter =" + perimeter() +
                "volume = "+ volume()+
                '}';
    }
}
