package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete_steps {
    WebDriver driver = new Environment().getDriver();
    public Autocomplete_steps(){};
    //acesta este un constructor care trebuie sa fie gol din cauza dependintei de Serenity
    @Given("I am on herokuapp.com")
    public void i_am_on_herokuapp_com() {
        System.out.println(driver);
        driver.get("https://formy-project.herokuapp.com/autocomplete");

    }
    @When("I insert some text in the address field")
    public void i_insert_some_text_in_the_address_field() throws InterruptedException {
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));  //aici am identificat input fieldulpt adresa identificat prin idul "autocomplete"
        autocomplete.sendKeys("Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi");
        //Thread.sleep(3000);     //se asteapta 3 secunde
        WebDriverWait wait = new WebDriverWait(driver,10); // am definit o variabila cu care sa accesam metodele de asteptare
        //browser-ul desch pag, cauta adresa respectiva si asteapta pana gaseste selector-ul respectiv si de-abia dupa ce s-a incarcat a dat click pe el
        // explicit wait stie mai bine cat trebuie sa astepte fata de Thread.sleep
        // tine elem in standby pana cand gaseste elementul pe care il cauta indiferent de cat timp setam noi acolo: 10s, 20s, 5s
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.pac-container > div > table > tr > td:nth-child(2) > button")));
        autocompleteResult.click();
    }
    @Then("I consider my test passed")
    public void i_consider_my_test_passed() {
        System.out.println("The test has passed");

    }

}

