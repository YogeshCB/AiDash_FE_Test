package TestExecutionSuite;


import TestCases.EditTreeTestCases;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public class UpdateTreeTestCases {

    EditTreeTestCases etcs;
    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("Execution Suite starts");
    }




    @BeforeTest
    public void setup() throws IOException
    {
        System.out.println(" Execution Suite Test starts");
    }


    @Test(priority = 0)
    @Parameters("browser")
    public void driverInitalization(String browser)
    {
        etcs = new EditTreeTestCases();
        etcs.initalizeDriver(browser);
    }


    @Test (priority = 1)
    public void openUrlForAidashLoginPage()
    {
        etcs.OpenAidash();

    }

    @Test (priority = 2)
    public void LoginToAidash()
    {
        etcs.Ai_dash_login_screen();

    }

    @Test (priority = 3)
    public void Navigation()
    {
        etcs.Ai_Dash_Home_Page();

    }

    @Test (priority = 4)
    public void ListTreeCardsPage() throws InterruptedException {
        etcs.Ai_Dash_Tree_List_Page();
        Thread.sleep(1000);

    }

    @Test (priority = 5)
    public void EditTreeCardsPage() throws InterruptedException {
        etcs.Ai_Dash_Edit_Tree();
        Thread.sleep(1000);


    }

    @Test (priority = 6)
    public void UpdateTreeCardsPage() throws InterruptedException {

        etcs.Ai_Dash_create_Tree_page();

        Thread.sleep(1000);

    }

    @Test (priority = 7)
    public void CreateTreeScreen3()
    {
        etcs.Ai_dash_create_tree_screen2();

    }


    @AfterMethod
    public void afterEveryMethod(ITestResult result)
    {
        if(ITestResult.FAILURE==result.getStatus())
        {
            etcs.takeScreenShotOnFailure(result.getTestName());
        }
    }

    @AfterTest
    public void teardown()
    {
        etcs.flushLogs();
    }


}
