import java.awt.*;

public class Shape {

    protected Color color;
    protected boolean filled;

    public void Shape() {
        this.color = Color.red;
        this.filled = true;
    }

    public void Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", filled=" + filled +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
