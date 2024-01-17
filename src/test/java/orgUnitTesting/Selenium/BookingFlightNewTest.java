package orgUnitTesting.Selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BookingFlightNewTest {
    static WebDriver webDriver;
    static BookingFlightNew bookingFlight;

    @BeforeAll
    public static void setup() throws InterruptedException {
        System.out.println("Setting Up Path : Book.Spicejet");

        System.setProperty("webdriver.edge.driver","E:\\Project Works\\UnitTesting\\Selenium Driver\\msedgedriver.exe");
        webDriver = new EdgeDriver();

        webDriver.get("https://book.spicejet.com/search.aspx");
//        Thread.sleep(16000);

        bookingFlight = new BookingFlightNew();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectDepartureCityTest1() throws InterruptedException {

        bookingFlight.selectDepartureCity(webDriver,"Chennai (MAA)");

        WebElement departureCityInput = webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"));
        Thread.sleep(2000);
        String departureCityText = departureCityInput.getAttribute("value");
        System.out.println("Departure City: " + departureCityText );


        Assertions.assertEquals(departureCityText,"Chennai (MAA)");
        Thread.sleep(2000);
    }

    @Test
    public void selectArrivalCityTest1() throws InterruptedException{

        bookingFlight.selectArrivalCity(webDriver,"Delhi (DEL)");

        Thread.sleep(2000);

        WebElement arrivalCityInput =  webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT"));
        String arrivalCityText = arrivalCityInput.getAttribute("value");
        System.out.println("Arrival City: " + arrivalCityText);

        Thread.sleep(2000);

        Assertions.assertEquals(arrivalCityText,"Delhi (DEL)");
    }


    @AfterAll
    public static void close() throws InterruptedException {
        System.out.println("Closing : Book.Spicejet");
        Thread.sleep(4000);
        webDriver.quit();
    }
}
