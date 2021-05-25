package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;
import java.util.List;

public class Utils {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    //Accesadores y modificadores de los atributos de la clase
    public WebDriver getDriver() {
        return driver;
    }

    //Accesadores y modificadores de los atributos de la clase
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    //Accesadores y modificadores de los atributos de la clase
    public WebDriverWait getEspera() {
        return wait;
    }

    //Accesadores y modificadores de los atributos de la clase
    public void setEspera(WebDriverWait espera) {
        this.wait = wait;
    }

    //busqueda de elemento web
    public WebElement buscarElementoWeb(By localizador){
        return this.driver.findElement(localizador);
    }

    //busqueda de elementos web
    public List<WebElement> buscarElementosWeb(By localizador){
        return this.driver.findElements(localizador);
    }

    //Iniciar el webdriver con un sitio;
    public void cargarSitio(String url){
        this.driver.get(url);
    }

    //Esperas Explicitas
    public WebElement esperaExplicita(By localizador){
        wait = new WebDriverWait(this.driver,30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(localizador));

    }

    //Esperas Implicitas
    public void esperarXSegundos(int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //click a traves de un localizador
    public void click(By localizador){
        this.driver.findElement(localizador).click();
    }

    //click a traves de un elemento web
    public void click(WebElement element){
        element.click();
    }

    //obtener texto desde un localizador
    public String obtenerTexto(By localizador){
        return this.driver.findElement(localizador).getText();
    }

    //obtener texto desde un elemento web
    public String obtenerTexto(WebElement element){
        return element.getText();
    }

    //agregar texto
    public void agregarTexto(By localizador, String texto){
        this.driver.findElement(localizador).sendKeys(texto);
    }

    public void agregarTexto(WebElement element, String texto){
        element.sendKeys(texto);
    }

    //agregar combinación de teclas
    public void agregarCombinacionTeclas(By localizador, Keys key){
        this.driver.findElement(localizador).sendKeys(key);
    }

    public void maximizarBrowser(){
        this.driver.manage().window().maximize();
    }

    public void cerrarBrowser(){
        this.driver.close();
    }

    public WebDriver conexionDriver(){
        String ruta = Paths.get(System.getProperty("user.dir"), "src/main/resources/driver/chromedriver.exe").toString();

        System.setProperty("webdriver.chrome.driver",ruta);
        this.driver = new ChromeDriver();

        return this.driver;
    }

    public WebDriver conexionDriverBrowsers(String rutaDriver, String propertyDriver, String browser){

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty(propertyDriver,rutaDriver);
            this.driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty(propertyDriver,rutaDriver);
            this.driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("IExplorer")){
            System.setProperty(propertyDriver,rutaDriver);
            this.driver = new ChromeDriver();
        }
        return this.driver;
    }

    public Boolean estaDesplegado(By localizador){
        try {
            return this.driver.findElement(localizador).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public static boolean esperarElemento(WebElement elemento, int segudos){
        try {
            System.out.println("[Utils - esperarElemento] Se busca elemento: "+elemento);
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOf(elemento));
            return true;
        }catch (Exception e){
            System.out.println("[Utils - esperarElemento] Elemento: "+elemento+" no se econtro.");
            return false;
        }

    }

    public static String seleccionComboboxEnSelect(WebElement elementoSelect, String dato) {
        try {
            List<WebElement> opciones = elementoSelect.findElements(By.tagName("option"));
            for(int x = 0;x<=opciones.size()-1;x++){
                if(dato.equals(opciones.get(x).getText())){
                    Select select = new Select(elementoSelect);
                    select.selectByVisibleText(dato);

                    return dato;
                }
                if(x==opciones.size()-1){
                    System.out.println("No se encontro opcion.");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Error: ---> " + e.getLocalizedMessage() + "\n\n");
        }
        return dato;
    }
}
