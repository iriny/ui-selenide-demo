package net.example.test.widgets;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Dropdown {

    public static void select(String cssSelector, String option){
        $(cssSelector + " .ui-combobox-toggle").click();
        $$(byText(option)).find(visible).click();
    }
}
