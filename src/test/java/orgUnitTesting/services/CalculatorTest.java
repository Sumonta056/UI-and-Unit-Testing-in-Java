package orgUnitTesting.services;



import org.junit.jupiter.api.*;

import java.util.Date;


public class CalculatorTest {

    @BeforeAll
    public static void init(){
        System.out.println("Run Before : All Test Cases");
        System.out.println("Started Test : " + new Date());
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Executes Methods before Running Each Test Cases");
    }

    @Test
    public void addTwoNumbersTest(){
        System.out.println("Test Case Running : addTwoNumbersTest()");

        int predictedResult = Calculator.addTwoNumbers(4,4);
        int actualResult = 8;

        Assertions.assertEquals(actualResult,predictedResult);

    }

    @Test
    public void productTwoNumbersTest(){
    System.out.println("Test Case Running : productTwoNumbersTest()");

        int predictedResult = Calculator.productTwoNumbers(2,8);
        int actualResult = 16;

        Assertions.assertEquals(actualResult,predictedResult);

    }

    @Test
    public void compareTest(){
        System.out.println("Test Case Running: Compare()");

        String predictedResult = Calculator.compare(3,3);
        String actualResult = "Number1 == Number2";

        Assertions.assertEquals(actualResult,predictedResult);
    }


    @AfterAll
    public static void CleanUP(){
        System.out.println("Cleaning All Test Cases");
        System.out.println("Stopped Test : " + new Date());
    }
}
