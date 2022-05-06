package us100;

import java.util.Arrays;
//kolla kendini neler oldu az önce


public class TestCase002 {

    public static void main(String[] args) {

        Shape shape1 = new Square(14.2);
        Volume volume1 = new Sphere(3.8);
        Sphere sep2 =new Sphere(2.7);
        Square squ1 = new Square(3.9);

        //Shape[] shapeArr = {shape1,sep2,squ1,volume1};
        //volume1 i koymamiza izin yok cunku volume shape parent class ile aralarinda
        // is a relationship yok
        Shape[] shapeArr = {shape1,sep2,squ1};
        System.out.println("Arrays.toString(shapeArr) = " + Arrays.toString(shapeArr));
    }
}
