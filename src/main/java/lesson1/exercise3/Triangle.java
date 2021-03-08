package lesson1.exercise3;

public class Triangle extends Shape{
    public static final Integer CORNERS = 3;
    private Integer sideLen;

    public Triangle() {
    }

    public Triangle(Integer centerX, Integer centerY, Integer sideLen) {
        super(centerX, centerY);
        this.sideLen = sideLen;
    }

    public Integer getSideLen() {
        return sideLen;
    }

    public void setSideLen(Integer sideLen) {
        this.sideLen = sideLen;
    }
}
