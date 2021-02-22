import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class CircleTest {

    @Test
    void createCircleEmptyConstructor() {
        Circle circle = new Circle();
        Assertions.assertTrue(circle.isFilled());
        Assertions.assertEquals(circle.getRadius(), 1.0);
        Assertions.assertEquals(Color.RED, circle.getColor());
    }

    @Test
    void createCircleRadiusConstructor() {
        Circle circle = new Circle(2.0);
        Assertions.assertTrue(circle.isFilled());
        Assertions.assertEquals(circle.getRadius(), 2.0);
        Assertions.assertEquals(Color.RED, circle.getColor());
    }
    @Test
    void createCircleFullConstructor() {
        Circle circle = new Circle(2.0);
        Assertions.assertTrue(circle.isFilled());
        Assertions.assertEquals(circle.getRadius(), 2.0);
        Assertions.assertEquals(Color.RED, circle.getColor());
    }


    @Test
    void getPerimeter() {
        Circle circle = new Circle(2.0);
        Assertions.assertEquals(4.0 * Math.PI, circle.getPerimeter());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(3.0);
        Assertions.assertEquals(Math.PI * 3.0 * 3.0, circle.getArea());
    }

}