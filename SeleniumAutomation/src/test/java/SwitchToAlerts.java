import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// alertele st facute cu JS nu cu html si nu mai putem identifica id-uri ale butoanelor ca in celalat exemplu cu butonul ok
public class SwitchToAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ana-maria/RepositoryGitHub/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.findElement(By.linkText("Switch Window")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("alert-button")).click();
        Thread.sleep(1000);
        Alert alertWindow = driver.switchTo().alert();
        Thread.sleep(1000);
        alertWindow.dismiss();
        driver.quit();
    }
}
