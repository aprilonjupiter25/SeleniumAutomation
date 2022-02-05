import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ana-maria/RepositoryGitHub/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        //aici am identificat butonul care deschide o fereastra noua
        newTabButton.click();
        // aici am dat click pe butonul identificat anterior
        Thread.sleep(3000);
       for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.close(); // aceasta comanda inchide fereastra activa
    }
}
