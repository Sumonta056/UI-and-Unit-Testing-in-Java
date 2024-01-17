package orgUnitTesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BookingFlightNew {

    public void selectDepartureCity(WebDriver webDriver, String City) throws InterruptedException{

        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        Thread.sleep(2000);

        webDriver.findElement(By.linkText(City)).click();
        Thread.sleep(2000);

    }

    // Select "Delhi(Del)" on Arrival City
    public void selectArrivalCity(WebDriver webDriver, String City) throws InterruptedException{
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
        Thread.sleep(1500);

        webDriver.findElement(By.linkText(City)).click();
        Thread.sleep(2000);
    }


    //Select 20 January as the departureDate
    public void selectDepartureDate(WebDriver webDriver) throws InterruptedException{
        webDriver.findElement(By.id("custom_date_picker_id_1")).click();
        Thread.sleep(2000);

        webDriver.findElement(By.linkText("20")).click();
        Thread.sleep(2000);
    }

    //Select Currency as BDT
    public void selectCurrency(WebDriver webDriver) throws InterruptedException{
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")).click();
        Thread.sleep(2000);

        webDriver.findElement(By.cssSelector("option[value='BDT']")).click();
        Thread.sleep(2000);
    }

    // Click on Search Flight
    public void selectSearchFlight(WebDriver webDriver) throws InterruptedException{
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
        Thread.sleep(10000);
    }

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","E:\\Project Works\\UnitTesting\\Selenium Driver\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();

        webDriver.get("https://book.spicejet.com/search.aspx");
        Thread.sleep(2000);

        BookingFlightNew bookingFlightNew = new BookingFlightNew();

        bookingFlightNew.selectDepartureCity(webDriver,"Chennai (MAA)");
        bookingFlightNew.selectArrivalCity(webDriver,"Delhi (DEL)");


    }
}
