package orgUnitTesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLab_UI {

    public void login(WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(2000);

    }

    public void sort(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("product_sort_container")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("option[value='lohi']")).click();
        Thread.sleep(2000);
    }

    public void selectProduct(WebDriver driver) throws InterruptedException{
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
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

    public void checkOverview(WebDriver driver) throws InterruptedException{
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
    }
    public void backHome(WebDriver driver) throws InterruptedException{
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);
    }

    public void logOut(WebDriver driver) throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    public void quit(WebDriver driver) throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","E:\\Project Works\\UnitTesting\\Selenium Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");

        SwagLab_UI swag = new SwagLab_UI();
        swag.login(driver);
        swag.sort(driver);
        swag.selectProduct(driver);
        swag.openCart(driver);
        swag.checkOut(driver);
        swag.fillUpForm(driver);
        swag.checkOverview(driver);
        swag.backHome(driver);
        swag.logOut(driver);
        swag.quit(driver);

    }
}
