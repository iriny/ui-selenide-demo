package net.ciklum.erm.scenarios;

import net.ciklum.erm.Config;
import net.ciklum.erm.pages.EmployeePage;
import net.ciklum.erm.pages.LoginPage;
import net.ciklum.erm.pages.NewContractPage;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by irisha on 7/7/16.
 */
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
