package lesson1.exercise3;

public class Square extends Shape {
    public static final Integer CORNERS = 4;
    private Integer sideLen;

    public Square(){}

    public Square(Integer xCenter, Integer yCenter, Integer sideLen) {
        super(xCenter,yCenter);
        this.sideLen = sideLen;
    }

    public Integer getSideLen() {
        return sideLen;
    }

    public void setSideLen(Integer sideLen) {
        this.sideLen = sideLen;
    }
}
