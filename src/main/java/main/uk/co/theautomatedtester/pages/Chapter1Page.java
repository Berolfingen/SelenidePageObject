package main.uk.co.theautomatedtester.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.source;

public class Chapter1Page {

    private SelenideElement linkToHomePage = $(byXpath("//a[text() = 'Home Page']"));

    public void goToHomePage() {
        linkToHomePage.click();

    }

    public boolean webPageHasText(String s) {
        return source().contains(s);
    }
}
