package lesson1;

import lesson1.exercise3.Circle;
import lesson1.exercise3.Square;
import lesson1.exercise3.Triangle;


public class MainClass {
    public static void main(String[] args) {

        Person person = new Person()
                .addFirstName("Ivan")
                .addLastName("Ivanovich")
                .addMiddleName("Ivanov")
                .addCountry("Rus")
                .addAge(34);

        System.out.println(person);

        Triangle triangle = new Triangle(1,1,10);
        Square square = new Square(2,2,10);
        Circle circle = new Circle(0,0,10);

        triangle.printCenter();
        square.printCenter();
        circle.printCenter();

        triangle.move(2,2);
        square.move(1,1);
        circle.move(3,3);

        triangle.printCenter();
        square.printCenter();
        circle.printCenter();

    }

}
