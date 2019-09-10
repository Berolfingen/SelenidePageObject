package main.uk.co.theautomatedtester.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {


    private SelenideElement linkToChapter1Page = $(byXpath("//a[@href = '/chapter1']"));

    public void goToChapter1Page() {
        linkToChapter1Page.click();

    }
}
