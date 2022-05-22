import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\djon\\IdeaProjects\\tools\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.selenium.dev/documentation/webdriver/browser/windows/");
        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;

        //Click the link which opens in a new window
        driver.findElement(By.linkText("new window")).click();

        //Wait for the new window or tab
        wait.until(numberOfWindowsToBe(2));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        //Wait for the new tab to finish loading content
        wait.until(titleIs("Selenium"));
    }
}