package main.uk.co.theautomatedtester.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Chapter1Page {

    private SelenideElement linkToHomePage = $(byText("Home Page"));

    public void goToHomePage() {
        linkToHomePage.click();

    }

    public boolean webPageHasText(String s) {
        return getSourcePage().contains(s);
    }

    private String getSourcePage() {
        return WebDriverRunner.source();
    }
}
