import java.awt.*;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        super(Color.green, true);
        width = 1;
        length = 2;
    }

    public Rectangle(double width, double length) {
        super(Color.green, true);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, Color color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(width+length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
