import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class SquareTest {

    @Test
    void createSquareEmptyConstructor() {
        Square square = new Square();
        Assertions.assertTrue(square.isFilled());
        Assertions.assertEquals(square.getLength(), 1.0);
        Assertions.assertEquals(square.getWidth(), 1.0);
        Assertions.assertEquals(Color.GREEN, square.getColor());
    }

    @Test
    void createSquareWidthSideConstructor() {
        Square square = new Square(5.0);
        Assertions.assertTrue(square.isFilled());
        Assertions.assertEquals(square.getLength(), 5.0);
        Assertions.assertEquals(square.getWidth(), 5.0);
        Assertions.assertEquals(Color.GREEN, square.getColor());
    }
    @Test
    void createSquareFullConstructor() {
        Square square = new Square(7.0, Color.DARK_GRAY, false);
        Assertions.assertFalse(square.isFilled());
        Assertions.assertEquals(square.getLength(), 7.0);
        Assertions.assertEquals(square.getWidth(), 7.0);
        Assertions.assertEquals(Color.DARK_GRAY, square.getColor());
    }

    @Test
    void getArea() {
        Square square = new Square(5.0);
        Assertions.assertEquals(square.getArea(), 25.0);
    }

    @Test
    void getPerimeter() {
        Square square = new Square(5.0);
        Assertions.assertEquals(square.getPerimeter(), 20.0);
    }

}