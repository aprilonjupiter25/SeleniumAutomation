package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Environment {
    private static WebDriver driver; // am definit variabila driver care sa ne stocheze noua instanta in care va rula driverul
    // un obiect este o instanta a unei clase, reprezentarea reala a unei clase
    // putem accesa variabila driver doar prin intermediul clasei
    // am folosit keyword-ul static pt a putea accesa variabila driver prin intermediul clasei
    /*
    exista 3 modificatori de acces:
    - private care limiteaza accesul metodei sau variabilei doar la clasa curenta
    - protected care limiteaza accesul metodei sau variabilei doar la pachetul curent
    - public - variabila sau metoda pot fi accesate de oriunde
     */
    @Before // tag-ul "Before" anunta sistemul ca urmatoarea metoda (urmatorul set de instructiuni) care este scrisa trebuie sa fie executata inainte de toate testele
    public void SetUp () {
        System.setProperty("webdriver.chrome.driver", "/Users/ana-maria/RepositoryGitHub/chromedriver");
        driver = new ChromeDriver();
    }

        @After // tag-ul anunta sistemul ca urmatorul set de instructiuni care este scris trebuie sa fie executata dupa de toate testele
        public void tearDown() throws InterruptedException {
            driver.quit();
            Thread.sleep(1000);
        }

    public static WebDriver getDriver() {
        return driver;
    }// metoda getDriver este folosita pt a trimite catre exterior variabila privata driver
    //si este declarata statica pt a putea fi accesata prin intermediul clasei
    //o metoda/functie este un set de instructiuni grupate sub un anumit nume
    // atunci cand vrem sa executam instructiunile respective nu trebuie sa le rescriem, ci doar sa specificam sistemului
    //numele sub care se gasesc
}
