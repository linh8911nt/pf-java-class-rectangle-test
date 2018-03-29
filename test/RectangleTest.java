import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        double width = 4;
        double height = 40;
        Rectangle rectangle = new Rectangle(width, height);
        double expected = 160;

        double result = rectangle.getArea();
        assertEquals(expected, result);
    }

    @Test
    void getPerimeter() {
        double width = 3.5;
        double height = 35.5;
        Rectangle rectangle = new Rectangle(width, height);
        double expected = 19.5;

        double result = rectangle.getPerimeter();
        assertEquals(expected, result);
    }

    @Test
    void displayRectangle() {
        double width = 4;
        double height = 40;
        Rectangle rectangle = new Rectangle(width, height);
        String expected = "Rectangle{ width = 4.0, height = 40.0 }";

        String result = rectangle.displayRectangle();
        assertEquals(expected, result);
    }
}