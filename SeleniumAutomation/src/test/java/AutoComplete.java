import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ana-maria/RepositoryGitHub/chromedriver"); // am definit calea catre chromedriver
        WebDriver driver = new ChromeDriver(); // am creat o instanta a driver-ului care sa fie incarcata in program
        // variabila driver este un obiect al clasei ChromeDriver
        // variabila driver are tipul de data WebDriver
        // variabila e o adresa de memorie reprezentata de un nume
        // deschidem Chrome si stocam asta in variabila driver
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        // metoda "get" este folosita pentru a putea deschide browser-ul web
        WebElement autocomplete = driver.findElement(By.id("autocomplete")); // aici am identificat input field-ul pentru adresa identificat prin id-ul "autocomplete"
        autocomplete.sendKeys("Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("body > div.pac-container.hdpi > div > table > tr > td:nth-child(2) > button")).click();
        //aici am identificat un element pe baza de cssSelector
        WebElement street_number = driver.findElement(By.id("street_number"));
        street_number.sendKeys("23");

        Thread.sleep(3000); // aici am instruit sistemul sa astepte sa se incarce pagina inainte sa treaca la instructiunea urmatoare
        //driver.quit(); // cu instructiunea aceasta inchidem complet broweser-ul de chrome

    }
}


