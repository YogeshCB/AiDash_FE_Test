package POM;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class Ai_Dash_Tree_List_Page {

    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";
    HashMap<Integer, String> LoginMap= new HashMap<Integer, String>();

    public Ai_Dash_Tree_List_Page(WebDriver driver) {
        Logs.startLog("Aidash Home screen");
        this.driver = driver;
        PageFactory.initElements(driver, this);
        cm = new CommMeths();
    }


    @FindBy(xpath = "//*[@id='1']/div[2]/div/div")
    WebElement TreeCard ;

    /*
   Function  to search movie director in letter box.
   */
    public void TreeCard()
    {
        cm.elementExplicitWait(driver, TreeCard, 100);
        Logs.startLog("cliking on Tree Card  " );

        if (TreeCard.isDisplayed()) {
            Logs.addToReport("Select Tree Card  on webapp", info);
            TreeCard.click();
            Logs.addToReport(" Tree Card  selected", pass);
            Logs.stopLog();
        }
        else {
            Logs.addToReport("Error while entering email field", fail);
            Logs.stopLog();
        }

    }
}
