package oop;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class ConverterTest {

    private final Double DELTA = 0.01d;

    @Test
    public void itShouldConverterFeetToMeters() {
        Double result = Converter.feetToMeters(5.0);

        assertEquals(result, 1.524, DELTA);
    }

    @Test
    public void itShouldConvertInchesToYards() {
        Double result = Converter.inchesToYards(5.0);

        assertEquals(result, 0.1389, DELTA);
    }

    @Test
    public void itShouldConvertMetersToCentimeters() {
        Double result = Converter.metersToCentimeters(2.0);
        assertEquals(result, 200);
    }
}
