package orgUnitTesting.Selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BookingFlightTest {

    static WebDriver webDriver;

    @BeforeAll
    public static void setup(){
        System.out.println("Setting Up Path : Book.Spicejet");

        System.setProperty("webdriver.edge.driver","E:\\Project Works\\UnitTesting\\Selenium Driver\\msedgedriver.exe");
        webDriver = new EdgeDriver();

        webDriver.get("https://book.spicejet.com/search.aspx");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectDepartureCityTest() throws InterruptedException {
        BookingFlight bookingFlight = new BookingFlight();
        bookingFlight.navigateToWeb();
        bookingFlight.selectDepartureCity();

        WebElement departureCityInput = webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"));
        String departureCityText = departureCityInput.getText();
        System.out.println("Departure City: " + departureCityText);
    }

    @AfterAll
    public static void close(){
        System.out.println("Closing : Book.Spicejet");
        webDriver.quit();
    }
}
