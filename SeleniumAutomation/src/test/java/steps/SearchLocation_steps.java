package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SearchLocation_steps {
    WebDriver driver = new Environment().getDriver();

    public SearchLocation_steps() {
    } // constructorul ne ajuta sa cream obiecte intr-o clasa

    @Given("I am on openstreetmap.org")
    public void open_street_map() {
        driver.get("https://www.openstreetmap.org/");
    }

    @When("I insert some data in the text box")
    public void insert_text() throws InterruptedException {
        WebElement insertText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div/div[1]/div/div[1]/input"));
        insertText.click();
        insertText.sendKeys("Str.Ion Barbu, nr. 34");
        Thread.sleep(2000);
    }

    @And("click on the Go button")
    public void click_on_go_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div/div[1]/div/div[2]/input")).click();
        Thread.sleep(2000);
    }

    @Then("I should have results returned")
    public void results() {
        System.out.println("Test has passed");
    }

    @When("I click route button")
    public void route_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div/div[2]/a")).click();
        Thread.sleep(1000);
    }

    @And("I insert some data in the text boxes")
    public void insert_data_in_the_text_boxes() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[2]/div[2]/div[2]/input")).sendKeys("Bucuresti");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[2]/div[3]/div[2]/input")).sendKeys("Cluj");
        Thread.sleep(1000);
    }

    @And("I click on the Go button")
    public void go_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[2]/div[4]/div[2]/input")).click();
        Thread.sleep(1000);
    }

    @Then("I should see the distance and time needed")
    public void result() {
        WebElement distance = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/p[1]"));
        System.out.println(distance.getText());
    }

    @And("I select any option from the dropdown")
    public void select_option_dropdown() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/form[2]/div[4]/div[1]/select")));
        int selectOptions = dropdown.getOptions().size();
        for (int i = 0; i < selectOptions; i++) {
            dropdown.selectByIndex(i);
            Thread.sleep(3500);
        }
    }

    // /html/body/div[1]/div[1]/div[5]/p[1]
    @Then("I should see the distance and time needed for each option")
    public void result_each_option() throws InterruptedException {

        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/form[2]/div[4]/div[1]/select")));
        int selectOptions = dropdown.getOptions().size();
        for (int i = 0; i < selectOptions; i++) {
            WebElement distance = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/p[1]"));
            System.out.println(distance.getText());
        }



    }
}

