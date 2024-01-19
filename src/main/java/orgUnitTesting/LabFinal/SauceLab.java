package orgUnitTesting.LabFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SauceLab {

    public void login(WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(500);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(500);

    }

    public void selectBagPack(WebDriver driver) throws InterruptedException{
        Thread.sleep(500);
        driver.findElement(By.id("item_4_img_link")).click();
        Thread.sleep(2000);
    }

    public void backToProduct(WebDriver driver) throws InterruptedException{
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);

    }

    public void openCart(WebDriver driver) throws InterruptedException{
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(2000);
    }

    public void checkOut(WebDriver driver) throws InterruptedException{
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
    }

    public void fillUpForm(WebDriver driver) throws InterruptedException{
        driver.findElement(By.id("first-name")).sendKeys("Sumonta");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Saha");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("1400");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
    }


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","E:\\Project Works\\UnitTesting\\Selenium Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");

        SauceLab lab = new SauceLab();

        lab.login(driver);
        lab.selectBagPack(driver);
        lab.backToProduct(driver);
        lab.openCart(driver);
        lab.checkOut(driver);
        lab.fillUpForm(driver);

    }
}
