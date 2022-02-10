package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// fisier care serveste ca punct comun de rulare ( nu mai rulam fiecare fisier individual)
// dupa definirea test runner-ului, trebuie sa definim Environment = pct comun pt initializarea driver-ului
// mergem mai departe cu testarea automata efectiva: creare unui feature file si crearea unui step definition file
@RunWith(Cucumber.class) //testRunner ruleaza cu clasa Cucumber
@CucumberOptions(
        features = {"features"}, // aceasta instructiune specifica unde poate sistemul sa gaseasca folderul cu feature files
        glue = {"steps"}, // aceasta instructiune specifica unde sa gasim fisierele de Step Definitions
        //plugin = {"pretty","html:reports.html"}, //aceasta instr. specifica formatul raportului care se va genera (html)
        //si numele raportului (reports.html)
        plugin = {"pretty","html:reports/reports.html"},
        // aceasta instructiune specifica formatul raportului impreuna cu folderul in care trebuie sa se genereze
        //daca folderul nu exista, va fi creat automat
        //plugin = {"pretty","json:reports/reports.json"} // instructiunea aceasta genereaza raportul in format json
        //plugin = {"pretty","junit:reports/reports.junit"} // instructiunea aceasta genereaza raportul in format junit
        dryRun = false, //daca optiunea este setata pe true nu se va rula codul si se va verifica daca toate fisierele de features
        // au un fisier corespondent de steps
        monochrome = true, // instructiunea aceasta elimina informatiile redundante din consola
        tags = "@T5" // aceasta instructiune ruleaza doar testele care sunt marcate cu tagul T1
        //name = "search" // aceasta instructiune ruleaza testele care au acest keyword in numele scenariului
)
public class TestRunner {

}
