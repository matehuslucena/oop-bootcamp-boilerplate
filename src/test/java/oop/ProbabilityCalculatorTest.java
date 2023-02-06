package oop;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProbabilityCalculatorTest {
    @Test
    public void itShouldReturnTheChanceOfGetting6WhenRollDice() {
        assertEquals(ProbabilityCalculator.probabilityOfGettingSix(), (float) 0.16, 0.01d);
    }

    @Test
    public void itShouldReturnTheChanceOfNotGetting6WhenRollDice() {
        float expected = 1 - ProbabilityCalculator.probabilityOfGettingSix();
        assertEquals(expected, (float) 0.83, 0.01d);
    }
    
    /*@Test
    public void itShouldReturnTheProductOfTwoChances() {
        float expected = ProbabilityCalculator.probabilityOfGettingSix() * ProbabilityCalculator.probabilityOfNotGettingSix();
        assertEquals(expected, (float) 0.13, 0.01d);
    }*/

    @Test
    public void itShouldReturnTheProductOfTwoChances() {
        assertEquals(ProbabilityCalculator.productOfTwoChances((float)0.1,(float)0.2), (float) 0.02, 0.01d);
    }
}
