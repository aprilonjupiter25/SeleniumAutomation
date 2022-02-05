import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ana-maria/RepositoryGitHub/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("#checkbox-2")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")).click();
        //aici am identificat elementul pe baza de xpath care este adresa HTML la care se afla elementul
    }
}
