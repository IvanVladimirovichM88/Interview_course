package lesson1.exercise2;

public abstract class MyCar {
    private Engine engine;
    private String color;
    private String name;


    abstract void start();

    abstract void move();

    abstract void open();

    abstract void stop();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
