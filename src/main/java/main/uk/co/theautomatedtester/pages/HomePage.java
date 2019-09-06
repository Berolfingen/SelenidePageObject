package main.uk.co.theautomatedtester.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {


    private SelenideElement linkToChapter1Page = $(byText("Chapter1"));

    public void goToChapter1Page() {
        linkToChapter1Page.click();

    }

}
