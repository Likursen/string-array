import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(6, calculator.multiply(2, 3));
    }
}
