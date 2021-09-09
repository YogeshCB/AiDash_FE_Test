package POM;


import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
public class Ai_Dash_Home_Page {
    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";
    HashMap<Integer, String> LoginMap= new HashMap<Integer, String>();

    public Ai_Dash_Home_Page(WebDriver driver) {
        Logs.startLog("Aidash Home screen");
        this.driver = driver;
        PageFactory.initElements(driver, this);
        cm = new CommMeths();
    }



    //xpath for MUi
    @FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root']/span")
    WebElement Muibutton ;

    //xpath for Hazardtree
    @FindBy(xpath = "//*[@title='Hazard/Danger Tree']")
    WebElement HazardTreeMUIButton;

    //xpath for tree removal button in MUI screen
    @FindBy(xpath = "//*[@title='Tree Removal']")
    WebElement TreeRemovalButton;

    //Xpath for report tree button on tree list page
    @FindBy(xpath = "//*[@id='btnYes']/span[1]")
    WebElement ReportTreeButton;




    /*
    Function expand MUi screen.
    */
    public void clickMUIButton()
    {
        cm.elementExplicitWait(driver, Muibutton, 100);
        Logs.startLog("cliking on Mui button and expand screen  " );
        if (Muibutton.isDisplayed()) {
            Logs.addToReport("clicked on MUI button and screen in large now", info);
            Muibutton.click();
            Logs.addToReport("clicked on MUI button and screen in large now", pass);
            System.out.println("MUI screen is large now");
            cm.elementExplicitWait(driver, Muibutton, 700);
            Logs.stopLog();
        }
        else {
            Logs.addToReport("Error while clicking on MUI button and screen is not large now", fail);
            Logs.stopLog();
        }

    }

    /*
   Function to click on hazard tree button in MUI screen  .
   */
    public void  HazardTreeMUIButton ()
    {
        cm.elementExplicitWait(driver, HazardTreeMUIButton, 100);
        Logs.startLog("clicking on HazardTreeMUIButton field");


        if (HazardTreeMUIButton.isDisplayed()) {
            HazardTreeMUIButton.click();
            Logs.addToReport("clicking on HazardTreeMUIButton field", pass);
            System.out.println("clicking on HazardTreeMUIButton field");
            cm.elementExplicitWait(driver, HazardTreeMUIButton, 700);
            Logs.stopLog();
        }
        else {
            Logs.addToReport("Error while entering password field ", fail);
            Logs.stopLog();
        }

    }

    /*
   Function to click on tree removal button in MUI screen  .
   */
    public void TreeRemovalButton() {
        cm.elementExplicitWait(driver, TreeRemovalButton, 100);
        Logs.startLog("clicking on treee removal button");


        if (TreeRemovalButton.isDisplayed()) {
            TreeRemovalButton.click();
            Logs.addToReport("clicking on treee removal button", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("clicking on treee removal button", fail);
            Logs.stopLog();
        }
    }

    /*
   Function to click on report tree button on tree list page.
   */

    public void ReportTreeButton() {
        cm.elementExplicitWait(driver, ReportTreeButton, 100);
        Logs.startLog("clicking on treee removal button");


        if (ReportTreeButton.isDisplayed()) {
            ReportTreeButton.click();
            Logs.addToReport("clicking on treee removal button\"", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("clicking on treee removal button", fail);
            Logs.stopLog();
        }
    }




}