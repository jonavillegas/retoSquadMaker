package pageobjects;

import definitions.Base;
import org.openqa.selenium.By;

public class Home extends Base {
    By txtProducto=By.xpath("//span[contains(text(),'Products')]");
    By btnMenu = By.id("react-burger-menu-btn");
    By btnLogout = By.id("logout_sidebar_link");
    By lstProductos = By.xpath("//div/button[@class='btn btn_primary btn_small btn_inventory']");
    By iconCarrito = By.xpath("(//div/a[@class='shopping_cart_link'])[1]");
    By btnCheckout = By.id("checkout");
    By txtFirstname = By.id("first-name");
    By txtLastName = By.id("last-name");
    By txtZip = By.id("postal-code");
    By btnContinue = By.id("continue");
    By btnFinish = By.id("finish");
    By btnBackHome = By.id("back-to-products");
    public Home() {
        super(driver);
    }

    public boolean textoProductoEsVisible(){
         return elementIsVisible(txtProducto);
    }

    public void ingresarMenu(){
        elementHaveWait(btnMenu);
        click(btnMenu);
    }

    public void seleccionarElementosCarrito(int cantidad){
        seleccionarElementos(lstProductos,cantidad);
    }

    public void clickCarrito(){
        click(iconCarrito);
    }

    public void clickCheckout(){
        elementHaveWait(btnCheckout);
        click(btnCheckout);
    }
    public void ingresarDatos(String nombre, String apellido, String zip){
        elementHaveWait(txtFirstname);
        enterText(txtFirstname,nombre);
        enterText(txtLastName,apellido);
        enterText(txtZip,zip);
    }

    public void clickContinue(){
        elementHaveWait(btnContinue);
        click(btnContinue);
    }

    public void clickFinish(){
        elementHaveWait(btnFinish);
        click(btnFinish);
    }

    public boolean esVisibleBotonBack(){
         return elementIsVisible(btnBackHome);
    }

    public void logout(){
        elementHaveWait(btnLogout);
        click(btnLogout);
    }

}
