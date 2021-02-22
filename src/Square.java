import java.awt.*;

public class Square extends Shape {
    
    private double side;

    public Square() {
        super(Color.green, true);
        side = 1;
    }

    public Square(double side) {
        super(Color.green, true);
        this.side = side;
    }

    public Square(double side, Color color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }

    public double getArea() {
        return side*side;
    }

    public double getPerimeter() {
        return side*4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
