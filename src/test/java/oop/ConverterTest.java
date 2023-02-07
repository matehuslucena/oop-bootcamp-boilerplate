package oop;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void itShouldCompareFeetWithMeters() {
        Double result = Converter.feetToMeters(5);

        assertEquals(result, 1.524);
    }
}
