package orgUnitTesting.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

    public static void main(String[] args) {


        System.setProperty("webdriver.edge.driver","E:\\Project Works\\UnitTesting\\Selenium Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/inventory.html");

    }
}
