package orgUnitTesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BookingFlight {

    WebDriver webDriver;

    // Navigate to the following website
    public void navigateToWeb() throws InterruptedException{

        System.setProperty("webdriver.edge.driver","E:\\Project Works\\UnitTesting\\Selenium Driver\\msedgedriver.exe");
        webDriver = new EdgeDriver();

        webDriver.get("https://book.spicejet.com/search.aspx");
        Thread.sleep(2000);
    }

    // Click on departure City and Select Chennai
    public void selectDepartureCity() throws InterruptedException{

        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        Thread.sleep(2000);

        webDriver.findElement(By.linkText("Chennai (MAA)")).click();
        Thread.sleep(2000);

    }

    // Select "Delhi(Del)" on Arrival City
    public void selectArrivalCity() throws InterruptedException{
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
        Thread.sleep(1500);

        webDriver.findElement(By.linkText("Delhi (DEL)")).click();
        Thread.sleep(2000);
    }


    //Select 20 January as the departureDate
    public void selectDepartureDate() throws InterruptedException{
        webDriver.findElement(By.id("custom_date_picker_id_1")).click();
        Thread.sleep(2000);

        webDriver.findElement(By.linkText("20")).click();
        Thread.sleep(2000);
    }

    //Select Currency as BDT
    public void selectCurrency() throws InterruptedException{
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")).click();
        Thread.sleep(2000);

        webDriver.findElement(By.cssSelector("option[value='BDT']")).click();
        Thread.sleep(2000);
    }

    // Click on Search Flight
    public void selectSearchFlight() throws InterruptedException{
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
        Thread.sleep(10000);
    }

    public void exit() {
        webDriver.quit();
    }


    public static void main(String[] args) {

        BookingFlight bookingFlight = new BookingFlight();
        try {
            bookingFlight.navigateToWeb();

            bookingFlight.selectDepartureCity();

            bookingFlight.selectArrivalCity();

            bookingFlight.selectDepartureDate();

            bookingFlight.selectCurrency();

            bookingFlight.selectSearchFlight();

            //bookingFlight.exit();

        } catch (InterruptedException e) {
            System.out.println("Something Wrong !!");
        }
    }

}
