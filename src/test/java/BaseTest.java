import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver = new ChromeDriver();

    @Test
    void titleControl() {
        driver.get("https://www.google.com/");
        //driver.get("https://www.haberturk.com/");
        //WebElement elem = driver.findElement(By.linkText("Spor"));
        //WebElement elem = driver.findElement(By.xpath("//a[@title='Ekonomi']"));
        WebElement elem = driver.findElement(By.name("q"));
        //System.out.println(elem.getText());
        //elem.click();
        elem.sendKeys("deneme");
        driver.quit();
    }

}