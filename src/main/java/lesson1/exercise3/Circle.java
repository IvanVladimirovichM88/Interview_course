package lesson1.exercise3;

public class Circle extends Shape{
    private Integer Radius;

    public Circle(){}

    public Circle(Integer centerX, Integer centerY, Integer radius) {
        super(centerX, centerY);
        Radius = radius;
    }

    public Integer getRadius() {
        return Radius;
    }

    public void setRadius(Integer radius) {
        Radius = radius;
    }
}
