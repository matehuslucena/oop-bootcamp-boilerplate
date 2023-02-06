package oop;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RectangleTest {
    @Test
    public void itShouldCreateRectangle() {
        double sideA = 2.0;
        double sideB = 3.0;
        Rectangle rectangle = new Rectangle(sideA, sideB);

        assertEquals(rectangle.getSideA(), 2.0);
        assertEquals(rectangle.getSideB(), 3.0);
    }
}
