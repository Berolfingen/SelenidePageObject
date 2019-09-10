package main.uk.co.theautomatedtester.suite;

import com.codeborne.selenide.WebDriverRunner;
import main.uk.co.theautomatedtester.pages.Chapter1Page;
import main.uk.co.theautomatedtester.pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;

public class TheAutomatedTesterTest {

    private static final String HOME_PAGE_URL = "http://book.theautomatedtester.co.uk/";
    private static final String TEXT_TO_LOOK_FOR = "Assert that this text is on the page";

    @BeforeClass
    public void setUp() {
        System.out.println("Running tests for TheAutomatedTesterTest.class");
    }

    //Just for the case
    @AfterClass
    public void teardown() {
        WebDriverRunner.closeWebDriver();
    }


    @Test
    public void chapter1PageHasText() {
        //use SoftAssert because here we have several assert checks
        SoftAssert softAssert = new SoftAssert();

        open(HOME_PAGE_URL);
        page(HomePage.class).goToChapter1Page();

        softAssert.assertTrue(page(Chapter1Page.class).webPageHasText(TEXT_TO_LOOK_FOR));

        page(Chapter1Page.class).goToHomePage();

        softAssert.assertEquals(url(), HOME_PAGE_URL);
        softAssert.assertAll();
    }
}
