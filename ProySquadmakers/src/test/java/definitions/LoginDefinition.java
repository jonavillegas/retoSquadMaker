package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.Home;
import pageobjects.Login;

public class LoginDefinition {

    Login login;
    Home home;

    public LoginDefinition(){
        login = new Login();
        home = new Home();
    }

    @Given("La URL esta operativa")
    public void laURLEstaOperativa() {
        login.accederUrl();
    }

    @When("el usuario ingresa su usuario {string} y password {string}")
    public void elUsuarioIngresaSuUsuarioYPassword(String usuario, String password) {
        login.ingresarUsuario(usuario);
        login.ingresarPassword(password);
    }

    @And("el usuario da click en login")
    public void elUsuarioDaClickEnLogin() {
        login.clickLogin();
    }

    @Then("se muestra la pagina de productos")
    public void seMuestraLaPaginaDeProductos() {
        Assert.assertTrue(home.textoProductoEsVisible());
    }

    @And("el usuario selecciona el menu principal")
    public void elUsuarioSeleccionaElMenuPrincipal() {
        home.ingresarMenu();
    }

    @And("el usuario da click en LOGOUT")
    public void elUsuarioDaClickEnLOGOUT() {
        home.logout();
    }

    @Then("se muestra la pagina de inicio de sesion")
    public void seMuestraLaPaginaDeInicioDeSesion() {
        Assert.assertTrue(login.loginIsVisible());
    }
}
