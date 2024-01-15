package orgUnitTesting.services;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;


public class CalculatorTest {

    @BeforeClass
    public static void init(){
        System.out.println("Run Before : All Test Cases");
        System.out.println("Started Test : " + new Date());
    }

    @Before
    public void beforeEach(){
        System.out.println("Executes Methods before Running Each Test Cases");
    }

    @Test
    public void addTwoNumbersTest(){
        System.out.println("Test Case Running : addTwoNumbersTest()");

        int predictedResult = Calculator.addTwoNumbers(4,4);
        int actualResult = 8;

        Assert.assertEquals(actualResult,predictedResult);

    }

    @Test
    public void productTwoNumbersTest(){
    System.out.println("Test Case Running : productTwoNumbersTest()");

        int predictedResult = Calculator.productTwoNumbers(2,8);
        int actualResult = 16;

        Assert.assertEquals(actualResult,predictedResult);

    }


    @AfterClass
    public static void CleanUP(){
        System.out.println("Cleaning All Test Cases");
        System.out.println("Stopped Test : " + new Date());
    }
}
