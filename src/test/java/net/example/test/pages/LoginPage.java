package net.ciklum.erm.pages;

import com.codeborne.selenide.Selenide;
import net.ciklum.erm.Config;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by irisha on 7/8/16.
 */
public class LoginPage {

    public void open(){
        Selenide.open(Config.baseUrl);
    }

    public void doLogin(String user, String password){
        $("#username").setValue(user);
        $("#password").setValue(password);
        $(".button[value=Login]").click();
    }
}
