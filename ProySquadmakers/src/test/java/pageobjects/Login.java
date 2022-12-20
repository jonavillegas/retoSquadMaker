package pageobjects;

import definitions.Base;
import org.openqa.selenium.By;

public class Login extends Base {

    By txtEmailLogin=By.id("user-name");
    By txtEmailPwd=By.id("password");
    By btnSession=By.id("login-button");



    public Login() {
        super(driver);
    }

    public boolean loginIsVisible(){
        return elementIsVisible(btnSession);
    }

    public void ingresarUsuario(String valor){
        enterText(txtEmailLogin,valor);
    }

    public void ingresarPassword(String valor){
        enterText(txtEmailPwd,valor);
    }

    public void clickLogin()  {
          click(btnSession);
    }






}
