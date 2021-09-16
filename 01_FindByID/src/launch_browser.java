import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_browser
{
    public static void main ( String [] args ) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        String title = "";
        String expectedTitle = "Google";
        String url = "https://www.google.com.mx/";
        driver.get( url );

        WebElement googleSearchBtn = driver.findElement(By.name( "q" ));
        googleSearchBtn.sendKeys( "Hello google from selenium" );
        googleSearchBtn.sendKeys( Keys.ENTER );

        Thread.sleep(4000);
        driver.close();
    }
}
