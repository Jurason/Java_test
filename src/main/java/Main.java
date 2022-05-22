import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.database.model.Error;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\djon\\IdeaProjects\\tools\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.sports.ru");

        WebElement input = driver.findElement(By.cssSelector("a.super-top__link"));

        WebElement elementExpect = (new WebDriverWait(driver, Duration.ofSeconds(10))
         .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-line-wrapper.nav-line-wrapper--top "))));


        WebElement element = driver.findElement(By.className("search-block-trigger"));
        String par = element.getAttribute("baseURI"); //look inside the Properties

        /*add sendKeys*/

        System.out.println(par);

    }
}

