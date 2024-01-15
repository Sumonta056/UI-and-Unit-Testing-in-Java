package orgUnitTesting.services;

import junit.framework.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void addTwoNumbersTest(){

     int predictedResult = Calculator.addTwoNumbers(4,4);
     int actualResult = 3;

     Assert.assertEquals(actualResult,predictedResult);

    }
}
