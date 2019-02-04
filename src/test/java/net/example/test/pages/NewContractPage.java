package net.example.test.pages;

import net.example.test.widgets.Dropdown;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NewContractPage {

    public void setPriority(String option) {
        Dropdown.select("#priority-contractsYw", option);
    }

    public void setPeStatus(String option) {
        Dropdown.select("#pe_status-contractsYw", option);
    }

    public void close() {
        $(".ui-dialog").$(byText("Close")).click();
    }

}
