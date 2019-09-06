package main.uk.co.theautomatedtester.suite;

import com.codeborne.selenide.WebDriverRunner;
import main.uk.co.theautomatedtester.pages.Chapter1Page;
import main.uk.co.theautomatedtester.pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.open;

public class TheAutomatedTesterTest {

    private static final String HomePageUrl = "http://book.theautomatedtester.co.uk/";
    private static final String textToLookFor = "Assert that this text is on the page";

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

        open(HomePageUrl);
        new HomePage().goToChapter1Page();

        Chapter1Page chapter1Page = new Chapter1Page();
        softAssert.assertTrue(chapter1Page.webPageHasText(textToLookFor));

        chapter1Page.goToHomePage();

        softAssert.assertEquals(WebDriverRunner.url(), HomePageUrl);
        softAssert.assertAll();
    }
}
