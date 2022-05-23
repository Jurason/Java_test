package PageObjects;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class firstClass {

    public static  void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\djon\\IdeaProjects\\tools\\chromedriver.exe");
        ChromeDriver browserSession = new ChromeDriver();
        browserSession.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(browserSession, Duration.ofSeconds(10));

        try {

            browserSession.get("");
            Thread.sleep(5000);

            //Use PageObject for sing in on the website//
            LoginPage lp = new LoginPage();
            lp.login("admin", "admin");


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            browserSession.quit();
        }
    }
}

