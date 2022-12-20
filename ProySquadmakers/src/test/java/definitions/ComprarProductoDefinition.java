package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.Home;
import pageobjects.Login;

public class ComprarProductoDefinition {
    Login login;
    Home home;

    public ComprarProductoDefinition(){
        login = new Login();
        home = new Home();
    }
    @And("el usuario agrega {string} productos al carrito")
    public void elUsuarioAgregaProductosAlCarrito(String cantidad) {
        Integer num =  Integer.parseInt(cantidad);
        home.seleccionarElementosCarrito(num);
    }

    @And("el usuario da click en el carrito")
    public void elUsuarioDaClickEnElCarrito() {
        home.clickCarrito();
    }

    @And("el usuario da click en checkout")
    public void elUsuarioDaClickEnCheckout() {
        home.clickCheckout();
    }

    @When("el usuario ingresa nombre {string}, apellido {string} y codigoPostal {string}")
    public void elUsuarioIngresaNombreApellidoYCodigoPostal(String nombre, String apellido, String zip) {
        home.ingresarDatos(nombre, apellido, zip);
    }

    @And("el usuario da click en continue")
    public void elUsuarioDaClickEnContinue() {
        home.clickContinue();
    }

    @And("el usuario da click en finish")
    public void elUsuarioDaClickEnFinish() {
        home.clickFinish();
    }

    @And("se muestra el boton de BackHome")
    public void seMuestraElBotonDeBackHome() {
        Assert.assertTrue(home.esVisibleBotonBack());
    }
}
