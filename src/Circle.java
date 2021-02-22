import java.awt.*;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
        radius = 1;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(Color color, boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + color +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }

    public double getArea() {
        return (radius*radius)*Math.PI;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
