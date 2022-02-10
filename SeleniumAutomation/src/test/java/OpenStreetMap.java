import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenStreetMap {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ana-maria/RepositoryGitHub/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.openstreetmap.org");
        WebElement query = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div/div[1]/div/div[1]/input"));
        Thread.sleep(2000);
        query.click();
        query.sendKeys("Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/form[1]/div/div[1]/div/div[2]/input"));
        Thread.sleep(2000);
        searchButton.click();
        WebElement whereIsThis = driver.findElement(By.cssSelector("#sidebar > div.search_forms > form.search_form.px-1.py-2 > div > div.col > div > div.query_wrapper.position-relative.flex-grow-1 > a"));
        Thread.sleep(2000);
        whereIsThis.click();
    }
}
