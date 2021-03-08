package lesson1.exercise3;

public class Shape {
    private Integer centerX;
    private Integer centerY;

    public Shape() {
    }

    public Shape(Integer centerX, Integer centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void printCenter(){
        System.out.println( "center x - "+ centerX + "\ncenter y - " + centerY);
    }

    public void move( Integer x, Integer y){
        centerX += x;
        centerY += y;
    }


    public Integer getCenterX() {
        return centerX;
    }

    public void setCenterX(Integer centerX) {
        this.centerX = centerX;
    }

    public Integer getCenterY() {
        return centerY;
    }

    public void setCenterY(Integer centerY) {
        this.centerY = centerY;
    }
}
