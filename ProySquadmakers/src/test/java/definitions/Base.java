package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class Base {
    public static WebDriver driver;
    public static WebDriverWait wait;


    public Base(WebDriver driver) {
        this.driver = driver;
    }

    @Before
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,20);
    }

    public void accederUrl(){
        driver.get("https://www.saucedemo.com/");
    }

    public void enterText(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }


    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public boolean elementIsVisible(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void elementHaveWait(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void seleccionarElementos(By element, int cantidad) {
        List<WebElement> lista = findElements(element);
        for(int i =0; i<cantidad;i++) {
            lista.get(i + 1).click();
        }
    }


    @After
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
