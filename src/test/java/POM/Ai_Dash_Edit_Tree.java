package POM;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class Ai_Dash_Edit_Tree {
    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";
    HashMap<Integer, String> LoginMap= new HashMap<Integer, String>();

    public Ai_Dash_Edit_Tree(WebDriver driver) {
        Logs.startLog("Aidash Home screen");
        this.driver = driver;
        PageFactory.initElements(driver, this);
        cm = new CommMeths();
    }

    //xpath for Tree card
    @FindBy(xpath = "//*[contains(text(),'EDIT')]")
    WebElement EditTree ;

    /*
   Function  to search movie director in letter box.
   */
    public void EditTreeButton()
    {
        cm.elementExplicitWait(driver, EditTree, 100);
        Logs.startLog("cliking on Edit Tree Card  " );

        if (EditTree.isDisplayed()) {
            Logs.addToReport("Select Edit Tree on webapp", info);
            EditTree.click();
            Logs.addToReport(" Edit Tree  selected", pass);
            Logs.stopLog();
        }
        else {
            Logs.addToReport("Error while clicking on Edit Tree", fail);
            Logs.stopLog();
        }

    }
}
