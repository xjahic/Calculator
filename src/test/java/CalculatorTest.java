import com.streetofcode.Operands;
import com.streetofcode.calculator.CalculatorHolder;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    private CalculatorHolder calculatorHolder = new CalculatorHolder();
    private Operands operands = new Operands(10.0, 5.0);

    @Test
    public void addition() {
        final double result = calculatorHolder.calculate(operands, '+');
        final double expectedResult = 15.0;
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void subtraction() {
        final double result = calculatorHolder.calculate(operands, '-');
        final double expectedResult = 5.0;
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void multiplication() {
        final double result = calculatorHolder.calculate(operands, '*');
        final double expectedResult = 50.0;
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void division() {
        final double result = calculatorHolder.calculate(operands, '/');
        final double expectedResult = 2.0;
        assertEquals(expectedResult, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void unsupportedOperation() {
        calculatorHolder.calculate(operands, '=');
    }

}
