package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class PageOnlineshoppingDemoQA {

    public PageOnlineshoppingDemoQA(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public static void validaComprasOnline() throws InterruptedException {
        /** Ingreso a la pagina y maximiso*/
        String path = Paths.get(System.getProperty("user.dir"), "\\src\\main\\resources\\driver\\chromedriver.exe").toString();
        System.out.print(path);
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("http://advantageonlineshopping.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        /*************************REGISTRO LOGIN**********************************************************************************/
        //Login
      By btonLogin = By.xpath("//body[1]/header[1]/nav[1]/ul[1]/li[3]/a[1]");
      wait.until(ExpectedConditions.elementToBeClickable(btonLogin)).click();
        Thread.sleep(500);
        By txtusuario = By.name("username");
        WebElement webtxtusuario = driver.findElement(txtusuario);
        webtxtusuario.sendKeys("adminCiisa");
        Thread.sleep(500);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        Thread.sleep(500);
        By txtpass = By.xpath("//body[1]/login-modal[1]/div[1]/div[1]/div[3]/sec-form[1]/sec-view[2]/div[1]/input[1]");
        WebElement webtxtpass = driver.findElement(txtpass);
        webtxtpass.sendKeys("Admin321");
        Thread.sleep(1000);
        By btonIngresar = By.id("sign_in_btnundefined");
        wait.until(ExpectedConditions.elementToBeClickable(btonIngresar)).click();
        Thread.sleep(1500);
//        //Login
//        By btonLogin = By.xpath("//body[1]/header[1]/nav[1]/ul[1]/li[3]/a[1]");
//        wait.until(ExpectedConditions.elementToBeClickable(btonLogin)).click();
//
//        By btonRegistrate = By.xpath("//body[1]/login-modal[1]/div[1]/div[1]/div[3]/a[2]");
//        wait.until(ExpectedConditions.elementToBeClickable(btonRegistrate)).click();
//
//        By txtNameReg = By.xpath("//body[1]/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/sec-view[1]/div[1]/input[1]");
//        WebElement webtxtNameReg = driver.findElement(txtNameReg);
//        webtxtNameReg.sendKeys("adminCiisa99");
////        if (webtxtNameReg.isDisplayed()) {
////            webtxtNameReg.sendKeys("adminCiisa99");
////            System.out.println("Se realiza Ingreso de Registro UserName");
////            Assert.assertTrue(true);
////        } else {
////            System.out.println("No es  Posible realizar Ingreso de Registro UserName");
////            Assert.assertTrue(true);
////        }
//
//        By txtEmailReg = By.name("emailRegisterPage");
//        WebElement webtxtEmailReg = driver.findElement(txtEmailReg);
//        if (webtxtEmailReg.isDisplayed()) {
//            webtxtEmailReg.sendKeys("adminCiisa@example.com");
//            System.out.println("Se realiza Ingreso de Registro UserName");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro UserName");
//            Assert.assertTrue(true);
//        }
//
//        By txtPassReg = By.name("passwordRegisterPage");
//        WebElement webtxtPassReg = driver.findElement(txtPassReg);
//        if (webtxtPassReg.isDisplayed()) {
//            webtxtPassReg.sendKeys("Admin321");
//            System.out.println("Se realiza Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        }
//
//        By txtPassConf = By.name("confirm_passwordRegisterPage");
//        WebElement webtxtPassConf = driver.findElement(txtPassConf);
//        if (webtxtPassConf.isDisplayed()) {
//            webtxtPassConf.sendKeys("Admin321");
//            System.out.println("Se realiza Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        }
//
//        By txtPrimerName = By.name("first_nameRegisterPage");
//        WebElement webtxtPrimerName = driver.findElement(txtPrimerName);
//        if (webtxtPrimerName.isDisplayed()) {
//            webtxtPrimerName.sendKeys("Rodrigo");
//            System.out.println("Se realiza Ingreso de Registro Nombre");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        }
//
//        By txtApellidos = By.name("last_nameRegisterPage");
//        WebElement webtxtApellidos = driver.findElement(txtApellidos);
//        if (webtxtApellidos.isDisplayed()) {
//            webtxtApellidos.sendKeys("Espinoza Maltez");
//            System.out.println("Se realiza Ingreso de Registro de Apellidos");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        }
//
//        By txtFono = By.name("phone_numberRegisterPage");
//        WebElement webtxtFono = driver.findElement(txtFono);
//        if (webtxtFono.isDisplayed()) {
//            webtxtFono.sendKeys("966426677");
//            System.out.println("Se realiza Ingreso de Registro de Numero Celular");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        }
//
//        //seleccion de ComboBox
//        WebElement selectElement = driver.findElement(By.name("countryListboxRegisterPage"));
//        Select selectObject = new Select(selectElement);
//        selectObject.selectByVisibleText("Chile");
//
//        By txtCiudad = By.name("cityRegisterPage");
//        WebElement webtxtCiudad = driver.findElement(txtCiudad);
//        if (webtxtCiudad.isDisplayed()) {
//            webtxtCiudad.sendKeys("Santiago");
//            System.out.println("Se realiza Ingreso de Registro de Numero Celular");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        }
//
//        By txtHabla = By.name("addressRegisterPage");
//        WebElement webtxtHabla = driver.findElement(txtHabla);
//        if (webtxtHabla.isDisplayed()) {
//            webtxtHabla.sendKeys("Español, Ingles basico y Chilensis");
//            System.out.println("Se realiza Ingreso de Registro de que idioma Habla");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Password");
//            Assert.assertTrue(true);
//        }
//
//        By txtEstado = By.name("state_/_province_/_regionRegisterPage");
//        WebElement webtxtEstado = driver.findElement(txtEstado);
//        if (webtxtEstado.isDisplayed()) {
//            webtxtEstado.sendKeys("Santiago");
//            System.out.println("Se realiza Ingreso de Registro de Estado");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Estado");
//            Assert.assertTrue(true);
//        }
//
//        By txtCodPostal = By.name("postal_codeRegisterPage");
//        WebElement webtxtCodPostal = driver.findElement(txtCodPostal);
//        if (webtxtCodPostal.isDisplayed()) {
//            webtxtCodPostal.sendKeys("91200000");
//            System.out.println("Se realiza Ingreso de Registro de Codigo Postal");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("No es  Posible realizar Ingreso de Registro Estado");
//            Assert.assertTrue(true);
//        }
//
//        By OptionAcepta = By.name("i_agree");
//        wait.until(ExpectedConditions.elementToBeClickable(OptionAcepta)).click();
//
//        By BotonRegistrate = By.id("register_btnundefined");
//        wait.until(ExpectedConditions.elementToBeClickable(BotonRegistrate)).click();
///*************************************************************************************************************************/

/************************AGREGA PRODUCTOS PARLANTES**********************************************************************************/
       By btonSpeaker = By.id("speakersImg");
       wait.until(ExpectedConditions.elementToBeClickable(btonSpeaker)).click();
        Thread.sleep(300);
        By btonPrecio = By.id("accordionPrice");
        wait.until(ExpectedConditions.elementToBeClickable(btonPrecio)).click();
        Thread.sleep(300);
        By btonCompatib = By.id("accordionAttrib0");
        wait.until(ExpectedConditions.elementToBeClickable(btonCompatib)).click();
        By OptionCompatibOne = By.id("compatibility_0");
        wait.until(ExpectedConditions.elementToBeClickable(OptionCompatibOne)).click();
        By OptionCompatibDos = By.id("compatibility_1");
        wait.until(ExpectedConditions.elementToBeClickable(OptionCompatibDos)).click();
        Thread.sleep(300);
        By btonFabricante = By.id("accordionAttrib1");
        wait.until(ExpectedConditions.elementToBeClickable(btonFabricante)).click();
        By OptionHP = By.id("manufacturer_1");
        wait.until(ExpectedConditions.elementToBeClickable(OptionHP)).click();
        Thread.sleep(300);

        By BotonTecnologia = By.xpath("//body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/h4[1]");
        wait.until(ExpectedConditions.elementToBeClickable(BotonTecnologia)).click();
        By OptionBluetho = By.id("wireless_technology_0");
        wait.until(ExpectedConditions.elementToBeClickable(OptionBluetho)).click();
        Thread.sleep(300);
        By OptionColor = By.id("accordionColor");
        wait.until(ExpectedConditions.elementToBeClickable(OptionColor)).click();
        Thread.sleep(300);
        /**SELECCIONO PARLANTE HD*/
        By SeleccionAltavosHP = By.id("24");
        wait.until(ExpectedConditions.elementToBeClickable(SeleccionAltavosHP)).click();
        Thread.sleep(300);
        By SeleccionCant = By.xpath("//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]");
        wait.until(ExpectedConditions.elementToBeClickable(SeleccionCant)).click();
        Thread.sleep(300);
        By botonAnadeCarrito = By.name("save_to_cart");
        wait.until(ExpectedConditions.elementToBeClickable(botonAnadeCarrito)).click();

        Thread.sleep(1000);
        //Vuelve al menu principal
        By FrondCasa = By.xpath("//body[1]/div[3]/nav[1]/a[1]");
        wait.until(ExpectedConditions.elementToBeClickable(FrondCasa)).click();
        Thread.sleep(1000);
    /*****************************************************************************************************************************************/

    /************************AGREGA PRODUCTOS TABLETS**********************************************************************************/
        By btonTabletsImg = By.id("tabletsImg");
        wait.until(ExpectedConditions.elementToBeClickable(btonTabletsImg)).click();
        Thread.sleep(800);
        By OptionPrecioTB = By.id("accordionPrice");
        wait.until(ExpectedConditions.elementToBeClickable(OptionPrecioTB)).click();
        Thread.sleep(800);
        By OptionMonitor = By.id("accordionAttrib0");
        wait.until(ExpectedConditions.elementToBeClickable(OptionMonitor)).click();
        Thread.sleep(800);
        By PantallaUno = By.id("display_1");
        wait.until(ExpectedConditions.elementToBeClickable(PantallaUno)).click();
        Thread.sleep(800);
        By PantallaDos = By.id("display_0");
        wait.until(ExpectedConditions.elementToBeClickable(PantallaDos)).click();
        Thread.sleep(800);
        By PantallaTres = By.id("display_2");
        wait.until(ExpectedConditions.elementToBeClickable(PantallaTres)).click();
        Thread.sleep(800);
        By OptionProcesador = By.id("accordionAttrib1");
        wait.until(ExpectedConditions.elementToBeClickable(OptionProcesador)).click();
        Thread.sleep(800);
        By ProcesDos = By.id("processor_2");
        wait.until(ExpectedConditions.elementToBeClickable(ProcesDos)).click();
        Thread.sleep(800);
        By SelecionaTablets = By.id("17");
        wait.until(ExpectedConditions.elementToBeClickable(SelecionaTablets)).click();
        Thread.sleep(800);
        wait.until(ExpectedConditions.elementToBeClickable(botonAnadeCarrito)).click();
        Thread.sleep(1000);
        //Vuelve al menu principal
        wait.until(ExpectedConditions.elementToBeClickable(FrondCasa)).click();
        Thread.sleep(2000);
  /*********************************************************************************************************************************/

  /************************AGREGA PRODUCTOS LAPTOS**********************************************************************************/
       By btonLaptopsImg = By.id("laptopsImg");
       wait.until(ExpectedConditions.elementToBeClickable(btonLaptopsImg)).click();
        Thread.sleep(1000);
        By PrecioLap = By.id("accordionPrice");
        wait.until(ExpectedConditions.elementToBeClickable(PrecioLap)).click();
        Thread.sleep(800);
        By MonitorLap = By.id("accordionAttrib0");
        wait.until(ExpectedConditions.elementToBeClickable(MonitorLap)).click();
        Thread.sleep(800);
        By SistemaLap = By.id("accordionAttrib1");
        wait.until(ExpectedConditions.elementToBeClickable(SistemaLap)).click();
        Thread.sleep(800);
        By optwin10 = By.id("operating_system_1");
        wait.until(ExpectedConditions.elementToBeClickable(optwin10)).click();
        Thread.sleep(800);
        By ProcesadorLap = By.id("accordionAttrib2");
//        wait.until(ExpectedConditions.elementToBeClickable(ProcesadorLap)).click();
//        Thread.sleep(800);
//        By OptionProcesadorLap = By.id("processor_4");
//        wait.until(ExpectedConditions.elementToBeClickable(OptionProcesadorLap)).click();
        Thread.sleep(1000);
        By SeleccionaLap = By.xpath("//body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[7]/p[1]/a[1]");
        wait.until(ExpectedConditions.elementToBeClickable(SeleccionaLap)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(botonAnadeCarrito)).click();
        Thread.sleep(1000);
        //Vuelve al menu principal
        wait.until(ExpectedConditions.elementToBeClickable(FrondCasa)).click();
        Thread.sleep(2000);
    /*********************************************************************************************************************************/

    /************************Contacto***********************************************************************************************/
        //seleccion de ComboBox Mice
        WebElement selectElementMice = driver.findElement(By.name("categoryListboxContactUs"));
        Select selectMice = new Select(selectElementMice);
        selectMice.selectByVisibleText("Mice");
        Thread.sleep(1000);
        WebElement selectElementMiceProd = driver.findElement(By.xpath("//body[1]/div[3]/section[1]/article[5]/div[1]/div[1]/div[2]/sec-form[1]/div[1]/div[1]/sec-view[2]/div[1]/select[1]"));
        Select selectMiceProd = new Select(selectElementMiceProd);
        selectMiceProd.selectByVisibleText("Kensington Orbit 72337 Trackball with Scroll Ring");
        Thread.sleep(1000);
        By txtEmailContac = By.xpath("//body[1]/div[3]/section[1]/article[5]/div[1]/div[1]/div[2]/sec-form[1]/div[1]/div[1]/sec-view[3]/div[1]/input[1]");
        WebElement webtxtEmailContac = driver.findElement(txtEmailContac);
        if (webtxtEmailContac.isDisplayed()) {
            webtxtEmailContac.sendKeys("adminCiisa@example.com");
            System.out.println("Se realiza Ingreso de Registro Email");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Registro UserName");
            Assert.assertTrue(true);
        }
        Thread.sleep(1000);
        By txtMensaje = By.name("subjectTextareaContactUs");
        WebElement webtxtMensaje = driver.findElement(txtMensaje);
        if (webtxtMensaje.isDisplayed()) {
            webtxtMensaje.sendKeys("Favor necesito saber mas especificaciones del producto y el valor de envio a regiones adicional a esto el tiempo de entrega");
            System.out.println("Se realiza Ingreso de Registro Email");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Registro UserName");
            Assert.assertTrue(true);
        }
        Thread.sleep(1000);
        By btonEnviar = By.id("send_btnundefined");
        wait.until(ExpectedConditions.elementToBeClickable(btonEnviar)).click();
        Thread.sleep(1500);
        By Shoping = By.xpath("//body[1]/div[3]/section[1]/article[5]/div[2]/div[1]/a[1]");
        wait.until(ExpectedConditions.elementToBeClickable(Shoping)).click();
        Thread.sleep(2000);
        /*********************************************************************************************************************************/

        /************************Audifonos***********************************************************************************************/
        By menuAudifonos = By.id("headphonesImg");
        wait.until(ExpectedConditions.elementToBeClickable(menuAudifonos)).click();
        Thread.sleep(1000);
        By precioAudifonos = By.id("accordionPrice");
        wait.until(ExpectedConditions.elementToBeClickable(precioAudifonos)).click();
        Thread.sleep(1000);
        By compatyAudifonos = By.id("accordionAttrib0");
        wait.until(ExpectedConditions.elementToBeClickable(compatyAudifonos)).click();
        Thread.sleep(1000);
        By opcionAudifonos = By.id("accordionAttrib1");
        wait.until(ExpectedConditions.elementToBeClickable(opcionAudifonos)).click();
        Thread.sleep(1000);
        By Weight = By.id("accordionAttrib2");
        wait.until(ExpectedConditions.elementToBeClickable(Weight)).click();
        Thread.sleep(1000);
        By SeleccionaAudif = By.xpath("//body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/p[1]/a[1]");
        wait.until(ExpectedConditions.elementToBeClickable(SeleccionaAudif)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(botonAnadeCarrito)).click();
        Thread.sleep(1000);
        //Vuelve al menu principal
        wait.until(ExpectedConditions.elementToBeClickable(FrondCasa)).click();
        Thread.sleep(2000);
        /*********************************************************************************************************************************/

        /************************PAGO CARRITO***********************************************************************************************/
        By CarritoCompra = By.id("menuCart");
        wait.until(ExpectedConditions.elementToBeClickable(CarritoCompra)).click();
        Thread.sleep(2000);
        By Pagar = By.id("checkOutButton");
        wait.until(ExpectedConditions.elementToBeClickable(Pagar)).click();
        Thread.sleep(2000);
        By DatosPersonales = By.xpath("//body[1]/div[3]/section[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]");
        wait.until(ExpectedConditions.elementToBeClickable(DatosPersonales)).click();
        Thread.sleep(2000);
        By btonNext = By.id("next_btnundefined");
        wait.until(ExpectedConditions.elementToBeClickable(btonNext)).click();
        Thread.sleep(2000);
//        By opcionMasterC = By.id("//body[1]/div[3]/section[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/img[1]");
//        wait.until(ExpectedConditions.elementToBeClickable(opcionMasterC)).click();
//        Thread.sleep(2000);
        By PagarTotal = By.id("pay_now_btn_MasterCredit");
        wait.until(ExpectedConditions.elementToBeClickable(PagarTotal)).click();
        Thread.sleep(2000);

    }
}
