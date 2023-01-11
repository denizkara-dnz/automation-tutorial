import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver = new ChromeDriver();

    @Test
    void titleControl() {
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
    }

}