package orgUnitTesting.LabFinal;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SauceLabTest {
    static WebDriver webDriver;
    static SauceLab sauceLab;

    @BeforeAll
    public static void setup() throws InterruptedException {
        System.out.println("Setting Up Path : Swag Lab");

        System.setProperty("webdriver.edge.driver","E:\\Project Works\\UnitTesting\\Selenium Driver\\msedgedriver.exe");
        webDriver = new EdgeDriver();

        webDriver.get("https://www.saucedemo.com/");

        sauceLab = new SauceLab();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void runAllTest() throws InterruptedException{
        System.out.println("Testing Login");



        System.out.println("Testing Done");

    }


    @AfterAll
    public static void close() throws InterruptedException {
        System.out.println("Closing : Swag Lab");
        Thread.sleep(4000);
        webDriver.quit();
    }
}
