package net.example.test.scenarios;

import net.example.test.Config;
import net.example.test.pages.EmployeePage;
import net.example.test.pages.LoginPage;
import net.example.test.pages.NewContractPage;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeContractTest {

    @BeforeClass
    public static void authenticate() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.doLogin(Config.user, Config.password);
    }

    @Test
    public void cancelNewForeignCitizenContract(){
        EmployeePage alexPage = new EmployeePage(3);
        alexPage.open();
        alexPage.toggleContracts();

        NewContractPage newContract = alexPage.startNewConract();
        newContract.setPriority("Secondary");
        newContract.setPeStatus("Foreign citizen");

        newContract.close();
    }
}
