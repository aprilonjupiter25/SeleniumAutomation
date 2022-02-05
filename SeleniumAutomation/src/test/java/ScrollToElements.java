import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ana-maria/RepositoryGitHub/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.moveToElement(name);
        Thread.sleep(2000);
        // am instruit browserul sa faca scroll pana cand ajunge in dreptul elementului name
        name.sendKeys("Marian Ionescu");
        Thread.sleep(2000);
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("12.12.2020");
        driver.quit();

    }
}

