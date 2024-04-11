import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calculator = new Calculator();
    @Test
    public void testAddition() {
        int resultat = calculator.add(5, 5);
        assertEquals(10, resultat);
    }

    @Test
    public void testSoustraction() {
        int resultat = calculator.soustraction(5, 2);
        assertEquals(3, resultat);
    }

    @Test
    public void testMultiplication() {
        int resultat = calculator.multi(5, 5);
        assertEquals(25, resultat);
    }

    @Test
    public void testDivision() {
        int resultat = calculator.div(8, 2);
        assertEquals(4, resultat);
    }
}
