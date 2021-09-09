package POM;

import commonMethods.Logs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
import java.util.concurrent.TimeUnit;

public class Ai_Dash_create_Tree_page {

        WebDriver driver;
        CommMeths cm;
        String info = "INFO";
        String pass = "PASS";
        String fail = "FAIL";
        HashMap<Integer, String> LoginMap= new HashMap<Integer, String>();

        public Ai_Dash_create_Tree_page(WebDriver driver) {
            Logs.startLog("Aidash Home screen");
            this.driver = driver;
            PageFactory.initElements(driver, this);
            cm = new CommMeths();

        }

    //Xpath for report tree button on tree list page
    @FindBy(xpath = "//*[@class='MuiButton-label'][contains(text(),'Next')]")
    WebElement NextButtonOnTreeCreatePage;

    //Xpath for species button and select species
    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-6'][1]/div/div/div/div")
    WebElement SpeciesDropdown;

    //Xpath for Tree condition dropdown
    @FindBy(xpath = " //*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-6'][2]/div/div/div/div")
    WebElement TreeConditionDropdown;

    //Xpath for Distance to line
    @FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1'][1][contains(text(),'1ft or less')]")
    WebElement DistanceToLine;
    //Xpath for Distance to line
    @FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1'][1][contains(text(),'2 to 10ft')]")
    WebElement UpdateDistanceToLineButton;

    //Xpath for Tree height dropdown
    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12'][3]/div/div/div/div")
    WebElement TreeHeightDropdown;

    //Xpath for Diameter Of Canopy
    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12'][1]/div/div/div[1]/div[1]/div[1]/div/div/div")
    WebElement DiameterOfCanopy;

    //Xpath for Diameter At Breast Height
    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12'][2]/div[1]/div/div/div[9]")
    WebElement DiameterAtBreastHeight;

    //Xpath for Risk Level
    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12'][3]/div/div/div/div[3]")
    WebElement RiskLevel;

    //Xpath for action
    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12'][4]/div/div/div")
    WebElement Action;

    //Xpath for action
    @FindBy(xpath = "//*[@class='MuiButton-label'][contains(text(),'Next')]")
    WebElement NextButtonTreeCreate;





    /*
     Function to click on next button on tree create page.
   */

    public void ClickOnNextButton() {
        cm.elementExplicitWait(driver, NextButtonOnTreeCreatePage, 100);
        Logs.startLog("Click next button on tree create page");


        if (NextButtonOnTreeCreatePage.isDisplayed()) {
            NextButtonOnTreeCreatePage.click();
            Logs.addToReport("Click on next button", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("clicking on next removal button", fail);
            Logs.stopLog();

            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        }
    }

    /*
     Function to click on Species Dropdown Button on tree create page.
   */

    public void SpeciesDropdownButton() {
        cm.elementExplicitWait(driver, SpeciesDropdown, 100);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        Logs.startLog("On tree create screen check to see if you can click on drop down button for Species");


        if (SpeciesDropdown.isDisplayed()) {
            SpeciesDropdown.click();
            Logs.addToReport("click on species button is successful", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("click on species button is failed", fail);
            Logs.stopLog();
        }
    }

    /*
     Function to click on Tree Condition Dropdown Dropdown Button on tree create page.
   */

    public void TreeConditionDropdownButton() {
        cm.elementExplicitWait(driver, TreeConditionDropdown, 100);
        Logs.startLog("On tree create screen check to see if you can click on drop down button for Tree Condition ");


        if (TreeConditionDropdown.isDisplayed()) {
            TreeConditionDropdown.click();

            Logs.addToReport("click on Tree Condition Dropdown button is successful", pass);
            Logs.stopLog();
           // driver.findElement(By.xpath("//*[text() = 'Tree Condition']")).click();

        } else {
            Logs.addToReport("click on Tree Condition Dropdown button is failed", fail);
            Logs.stopLog();
        }
    }

     /*
     Function to click on Distance To Line Button on tree create page.
   */

    public void DistanceToLineButton() {
        cm.elementExplicitWait(driver, DistanceToLine, 100);
        Logs.startLog("On tree create screen check to see if you can click on options for Distance To Line");


        if (DistanceToLine.isDisplayed()) {
            DistanceToLine.click();
            Logs.addToReport("click on Distance To Line button is successful", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("click on Distance To Line is failed", fail);
            Logs.stopLog();
        }
    }

    public void UpdateDistanceToLineButton() {
        cm.elementExplicitWait(driver, DistanceToLine, 100);
        Logs.startLog("On tree create screen check to see if you can click on options for Distance To Line");


        if (DistanceToLine.isDisplayed()) {
            DistanceToLine.click();
            Logs.addToReport("click on Distance To Line button is successful", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("click on Distance To Line is failed", fail);
            Logs.stopLog();
        }
    }

     /*
     Function to click on Distance To Line Button on tree create page.
   */

    public void TreeHeightDropdownButton() {
        cm.elementExplicitWait(driver, TreeHeightDropdown, 100);
        Logs.startLog("On tree create screen check to see if you can click on options for Tree Height Dropdown");


        if (TreeHeightDropdown.isDisplayed()) {
            TreeHeightDropdown.click();
            Logs.addToReport("click on Tree Height Dropdown button is successful", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("click on Tree Height Dropdown is failed", fail);
            Logs.stopLog();
        }
    }

     /*
     Function to click on Diameter Of Canopy Button on tree create page.
   */

    public void DiameterOfCanopyButton() {
        cm.elementExplicitWait(driver, DiameterOfCanopy, 100);
        Logs.startLog("On tree create screen check to see if you can click on options for Diameter Of Canopy Dropdown");


        if (DiameterOfCanopy.isDisplayed()) {
            DiameterOfCanopy.click();
            Logs.addToReport("click on Diameter Of Canopy Dropdown button is successful", pass);
            driver.findElement(By.xpath("//*[text() = 'Distance to Line']")).click();
            Logs.stopLog();

        } else {
            Logs.addToReport("click on Diameter Of Canopy Dropdown is failed", fail);
            Logs.stopLog();
        }
    }


     /*
     Function to click on Diameter At Breast Height Button on tree create page.
   */

    public void DiameterAtBreastHeightButton() {
        cm.elementExplicitWait(driver, DiameterAtBreastHeight, 100);
        Logs.startLog("On tree create screen check to see if you can click on options for Diameter At Breas tHeight");


        if (DiameterAtBreastHeight.isDisplayed()) {
            DiameterAtBreastHeight.click();
            Logs.addToReport("click on Diameter At Breast Height button is successful", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("click on Diameter At Breast Height button is failed", fail);
            Logs.stopLog();
        }
    }

    /*
     Function to click on RiskLevel Button on tree create page.
    */

    public void RiskLevelButton() {
        cm.elementExplicitWait(driver, RiskLevel, 100);
        Logs.startLog("On tree create screen check to see if you can click on button for RiskLevel");


        if (RiskLevel.isDisplayed()) {
            RiskLevel.click();
            Logs.addToReport("click on RiskLevel button is successful", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("click on RiskLevel button is failed", fail);
            Logs.stopLog();
        }
    }

    /*
     Function to click on RiskLevel Button on tree create page.
    */

    public void Action() throws InterruptedException {
        cm.elementExplicitWait(driver, Action, 100);
        Logs.startLog("On tree create screen check to see if you can click on button for Action");


        if (Action.isDisplayed()) {
            Action.click();
            Logs.addToReport("click on Action button is successful", pass);
            RiskLevel.click();
            Thread.sleep(1000);
            Logs.stopLog();

        } else {
            Logs.addToReport("click on Action button is failed", fail);
            Logs.stopLog();
        }
    }

    public void NextButtonTreeCreateButton() {
        cm.elementExplicitWait(driver, NextButtonTreeCreate, 100);
        Logs.startLog("On tree create screen check to see if you can click on button for Action");


        if (NextButtonTreeCreate.isDisplayed()) {
            NextButtonTreeCreate.click();
            Logs.addToReport("click on Action button is successful", pass);
            Logs.stopLog();

        } else {
            Logs.addToReport("click on Action button is failed", fail);
            Logs.stopLog();
        }
    }




}
