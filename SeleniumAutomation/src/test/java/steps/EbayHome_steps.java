package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.fail;

public class EbayHome_steps {
    WebDriver driver = new Environment().getDriver();

    public EbayHome_steps() {}
    //acesta este un constructor care trebuie sa fie gol din cauza dependintei de Serenity

        @Given("I am on ebay home page")
        public void i_am_on_ebay_home_page() throws InterruptedException {
            driver.get("https://www.ebay.com/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
        }
        @When("I click on the advanced search link")
        public void i_click_on_the_advanced_search_link() {
            driver.findElement(By.linkText("Advanced")).click();
        }

        @Then("I navigate to advanced search page")
        public void i_navigate_to_advanced_search_page() {
            String expURL = "https://www.ebay.com/sch/ebayadvsearch";
            String actURL = driver.getCurrentUrl(); //metoda getCurrentUrl extrage din browser
            // URl-ul paginii care este deschisa in momentul acesta
            if (!expURL.equals(actURL)) {
                fail("Link does not navigate to expected page");
            } else {
                System.out.println("Test has passed");
            }
        }
    }


/* componentele unei decizii:
- inceputul deciziei (if)
- conditia decizionala care se evalueaza (!expUrl.equals(actUrl)) care poate sa returneze T sau F
- "then" - ramura din dreapta care se executa in cazul in care conditia este adevarata (reprezentata de deschiderea acoladei,
set de instructiuni si inchiderea acoladei;
- else (ramura din stanga) care se executa in cazul in care conditia este falsa - reprezentata de keyword-ul else,
urmat de acolada deschisa, set de instructiuni si acolada inchisa
- sfarsitul deciziei care este reprezentat de inchiderea acoladei la else sau la then in cazul in care nu avem else
 */