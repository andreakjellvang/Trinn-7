import java.awt.*;

public class Square extends Rectangle {

    public Square(){
        this(1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, Color color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }

}
