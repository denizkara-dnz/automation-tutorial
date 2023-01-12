import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class BaseTest {

    WebDriver driver = new ChromeDriver();

    @Test
    /*
    //ilk ders
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
    */
    void getList() {
        driver.get("https://www.milliyet.com.tr/");
        //driver.findElement(By.linkText("Gündem")).click();
        WebElement element = driver.findElement(By.className("main-menu__mobile-scroll"));
        List<WebElement> headerMenuBtn = element.findElements(By.tagName("li"));
//        for (int i = 0; i < headerMenuBtn.size(); i++) {
//            WebElement menuText = headerMenuBtn.get(i);
//            if (menuText.getText().equals("Gündem")) {
//                menuText.click();
//                break;
//            }
//        }
        for (WebElement lst:headerMenuBtn) {
            if (lst.getText().equals("Gündem")){
                lst.click();
                break;
            }
        }
        driver.quit();
    }
}