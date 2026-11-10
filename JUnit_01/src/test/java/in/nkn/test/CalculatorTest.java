package in.nkn.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import in.nkn.beans.Calculator;

@SpringBootTest
public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator c = new Calculator();

        int actualResul = c.add(10, 20);
        int expectedResult = 30;

        Assertions.assertEquals(expectedResult, actualResul);
    }
    
    @Test
    public void testMul() {

        Calculator c = new Calculator();

        int actualResul = c.mul(10, 20);
        int expectedResult = 200;

        Assertions.assertEquals(expectedResult, actualResul);
    }
}