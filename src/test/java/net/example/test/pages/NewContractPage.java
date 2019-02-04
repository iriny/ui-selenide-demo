package net.ciklum.erm.pages;

import net.ciklum.erm.widgets.Dropdown;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by irisha on 7/8/16.
 */
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
