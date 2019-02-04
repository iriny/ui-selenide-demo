package net.example.test.pages;

import com.codeborne.selenide.Selenide;
import net.example.test.Config;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class EmployeePage {

    int id;

    public EmployeePage(int id) {
        this.id = id;
    }

    public void open() {
        Selenide.open(Config.baseUrl + "/employees/view?id=" + this.id);
    }

    public void toggleContracts() {
        $(byText("Contracts")).click();
    }

    public void toggleLevels() {
        $(byText("Levels")).click();
    }

    public NewContractPage startNewConract() {
        $("#create-button-contractsYw").click();
        return new NewContractPage();
    }
}