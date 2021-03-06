package us100;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape {

    private String name;
    static ArrayList<String> shapesList = new ArrayList<>();

    public Shape(String name) {

        setName(name);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        int count = 0;
        for (String each : shapesList) {

            if (each.toString().equalsIgnoreCase(name)) {
                count++;

            }
        }
        if (count == 0) {

            throw new RuntimeException("invalid name "+ name);
        }
        this.name = name;
    }

    static {
        shapesList.add("cicle");
        shapesList.addAll(Arrays.asList("square", "sphere"));
    }

    abstract double area();

    abstract double perimeter();

    public void geometricalShape () {

        System.out.println(name + " is geometrical shape !!!");
    }

    @Override
    public String toString() {
        return "\n\n\n"+ getClass().getSimpleName()+ "{" +
                "\nname='" + name + '\'' +
                "\n}\n\n\n";
    }
}
