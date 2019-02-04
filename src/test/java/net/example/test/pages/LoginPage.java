package net.example.test.pages;

import com.codeborne.selenide.Selenide;
import net.example.test.Config;

import static com.codeborne.selenide.Selenide.$;

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
