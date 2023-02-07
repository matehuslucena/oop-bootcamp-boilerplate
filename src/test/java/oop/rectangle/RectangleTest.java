package oop.rectangle;

import oop.Rectangle;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RectangleTest {

    Rectangle rectangle;

    @BeforeTest
    public void Setup() {
        double sideA = 2.0;
        double sideB = 3.0;

        rectangle = new Rectangle(sideA, sideB);
    }

    @Test
    public void itShouldCalculatePerimeter() {
        assertEquals(rectangle.calculatePerimeter(), 10.0);
    }

    @Test
    public void itShouldCalculateArea() {
        assertEquals(rectangle.calculateArea(), 6.0);
    }
}
