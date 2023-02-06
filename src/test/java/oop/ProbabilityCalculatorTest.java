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
        assertEquals(ProbabilityCalculator.probabilityOfNotGettingSix(), (float) 0.83, 0.01d);
    }
}
