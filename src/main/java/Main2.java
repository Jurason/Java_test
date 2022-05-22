import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\djon\\IdeaProjects\\tools\\chromedriver.exe");
        ChromeDriver browserSession = new ChromeDriver();

        browserSession.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //

        WebDriverWait wait = new WebDriverWait(browserSession, Duration.ofSeconds(10));


        try {
            browserSession.get("https://www.bbc.com");
            Thread.sleep(3000);

            WebElement consentButton = browserSession.findElement(By.cssSelector("button[class='fc-button fc-cta-consent fc-primary-button']"));
            consentButton.click();
            //BIG GOAL
            //Try to collect all images from pages and save to local folder
            List<WebElement> elements = browserSession.findElements(By.xpath("//img"));

            //Create List with pictures links
            List<String> links = new ArrayList<>();

            //Fill the List within links (using enhanced 'for'
            for(WebElement pic : elements) {
                links.add(pic.getAttribute("currentSrc"));
            }

            //Check data (using another loop's description)
            for(int i = 0; i< links.size(); i++) {
                System.out.println(links.get(i));
            }

            //Try to collect al links from header and then open them at new tabs
//            List<WebElement> linkPages = browserSession.findElements(By.cssSelector("nav[class*='international'] a"));

            //Print links one below the other
//            for(WebElement link : linkPages) {
//                System.out.println(link.getAttribute("href"));
//            }

            //Check linkPages List
//            System.out.println(elements.size());
//            System.out.println(linkPages.size());


//            browserSession.get(linkPages.get(3).getAttribute("href"));
            Thread.sleep(1000);




            //String link = elements.get(0).getAttribute("src");

        } catch(InterruptedException e) {
            e.printStackTrace();
        } finally {
            browserSession.quit();
        }





//        WebElement element = browserSession.findElement(By.id(""));

    }
}
