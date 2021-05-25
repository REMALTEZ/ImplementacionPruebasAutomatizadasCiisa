package pages;

import javafx.scene.control.Tab;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import static utils.Utils.seleccionComboboxEnSelect;


public class PageDemoQA {

    public PageDemoQA(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public static void validaPageDemoQA() throws InterruptedException {
        /** Ingreso a la pagina y maximiso*/
        String path = Paths.get(System.getProperty("user.dir"), "\\src\\main\\resources\\driver\\chromedriver.exe").toString();
        System.out.print(path);
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        /** Entro a la Pagina y recorro***********************************************************************************************/
        By imgToolsQA = By.xpath("//body[1]/div[1]/header[1]/a[1]/img[1]");
        WebElement webimgToolsQA = driver.findElement(imgToolsQA);
        if (webimgToolsQA.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webimgToolsQA)).click();
            System.out.println("Se realiza Click en Page ToolsQA");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }
        Thread.sleep(500);
        By botonElements = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
        WebElement webbotonElements = driver.findElement(botonElements);
        if (webbotonElements.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webbotonElements)).click();
            System.out.println("Se realiza Click en Boton Element");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }
        Thread.sleep(500);
        By botonTextBox = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
        WebElement webbotonTextBox = driver.findElement(botonTextBox);
        if (webbotonTextBox.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webbotonTextBox)).click();
            System.out.println("Se realiza Click en Boton TextBox");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Click en Boton TextBox");
            Assert.assertTrue(false);
        }
        Thread.sleep(500);
        By txtFullName = By.id("userName");
        WebElement webtxtFullName = driver.findElement(txtFullName);
        if (webtxtFullName.isDisplayed()) {
            webtxtFullName.sendKeys("Rodrigo Espinoza Maltez");
            System.out.println("Se realiza Ingreso de Full Name");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Full Name");
            Assert.assertTrue(true);
        }
        Thread.sleep(500);
        By txtEmailTB = By.id("userEmail");
        WebElement webtxtEmailTB = driver.findElement(txtEmailTB);
        if (webtxtEmailTB.isDisplayed()) {
            webtxtEmailTB.sendKeys("rodrigo.espinoza.maltez@ciisa.cl");
            System.out.println("Se realiza Ingreso de Email");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Email");
            Assert.assertTrue(false);
        }
        Thread.sleep(500);
        By txtDireccion = By.id("currentAddress");
        WebElement webtxtDireccion = driver.findElement(txtDireccion);
        if (webtxtDireccion.isDisplayed()) {
            webtxtDireccion.sendKeys("Plaza de la dignidad sin numeroo");
            System.out.println("Se realiza Ingreso de Direccion");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Direccion");
            Assert.assertTrue(false);
        }
        Thread.sleep(500);
        By txtDireccionPerm = By.id("permanentAddress");
        WebElement webtxtDireccionPerm = driver.findElement(txtDireccionPerm);
        if (webtxtDireccionPerm.isDisplayed()) {
            webtxtDireccionPerm.sendKeys("Plaza de la dignidad sin numero ex plaza italia o plaza Baquedano");
            System.out.println("Se realiza Ingreso de Direccion Permanente");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Direccion Permanente");
            Assert.assertTrue(false);
        }
        Thread.sleep(500);
        By botonSumit = By.id("submit");
        WebElement webtbotonSumit = driver.findElement(botonSumit);
        if (webtbotonSumit.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(botonSumit)).click();
            System.out.println("Se realiza click en boton Sumit");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click en boton Sumit ");
            Assert.assertTrue(false);
        }

        /**************************************************************************************************************************/

        /** OBJETOS PERTENECIENTES A OPCION ELEMENTS CHECKBOX*********************************************************************/
        By botonCheckbox = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]");
        WebElement webBotonCheckbox = driver.findElement(botonCheckbox);
        if (webBotonCheckbox.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonCheckbox)).click();
            System.out.println("Se realiza click en opcion ChecBox del menu lateral izquierdo");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click en boton Sumit ");
            Assert.assertTrue(false);
        }
        By btonMasCheckbox = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]");
        WebElement webBtonMasCheckbox = driver.findElement(btonMasCheckbox);
        if (webBtonMasCheckbox.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBtonMasCheckbox)).click();
            System.out.println("Se realiza click en + que expande el arbol del checkbox");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click en + que espande el arbol del checkbox");
            Assert.assertTrue(false);
        }
        By seleccionCheckBox = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]");
        WebElement webSeleccionCheckBox = driver.findElement(seleccionCheckBox);
        if (webSeleccionCheckBox.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webSeleccionCheckBox)).click();
            System.out.println("Se realiza click Seleccionador que expande el arbol del checkbox");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");
            Assert.assertTrue(false);
        }
        By FlechaAbajoExpandeUno = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]");
        WebElement webFlechaAbajoExpandeUno = driver.findElement(FlechaAbajoExpandeUno);
        if (webFlechaAbajoExpandeUno.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webFlechaAbajoExpandeUno)).click();
            System.out.println("Se realiza click Seleccionador que expande el arbol del checkbox");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");
            Assert.assertTrue(false);
        }
        By FlechaAbajoExpandeDos = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]");
        WebElement webFlechaAbajoExpandeDos = driver.findElement(FlechaAbajoExpandeDos);
        if (webFlechaAbajoExpandeDos.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webFlechaAbajoExpandeDos)).click();
            System.out.println("Se realiza click Seleccionador que expande el arbol del checkbox");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");
            Assert.assertTrue(false);
        }
        By BotonMas = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]");
        WebElement webBotonMas = driver.findElement(BotonMas);
        if (webBotonMas.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonMas)).click();
            System.out.println("Se realiza click + que expande el arbol del checkbox");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click + que expande el arbol del checkbox");
            Assert.assertTrue(false);
        }
        By BotonMenos = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]");
        WebElement webBotonMenos = driver.findElement(BotonMenos);
        if (webBotonMenos.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonMenos)).click();
            System.out.println("Se realiza click (-) que expande el arbol del checkbox");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click (-) que expande el arbol del checkbox");
            Assert.assertTrue(false);
        }
        /************************************************************************************************************************/

        /** OBJETOS PERTENECIENTES A OPCION ELEMENTS RADIO BUTON*********************************************************************/
        By BotonRadioButton = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]");
        WebElement webBotonRadioButton = driver.findElement(BotonRadioButton);
        if (webBotonRadioButton.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonRadioButton)).click();
            System.out.println("Se realiza click menu lateral Radio Button");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click menu lateral Radio Button");
            Assert.assertTrue(false);
        }
        By OptionYes = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]");
        WebElement webOptionYes = driver.findElement(OptionYes);
        if (webOptionYes.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webOptionYes)).click();
            System.out.println("Se realiza click option Yes");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click option Yes");
            Assert.assertTrue(false);
        }
        By OptionImpres = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]");
        WebElement webOptionImpres = driver.findElement(OptionImpres);
        if (webOptionImpres.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webOptionImpres)).click();
            System.out.println("Se realiza click Option Impressive");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click Option Impressive");
            Assert.assertTrue(false);
        }
        /***************************************************************************************************************************/

        /** OBJETOS PERTENECIENTES A OPCION ELEMENTS WEB TABLES*********************************************************************/
        By BotonWebTable = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]");
        WebElement webBotonWebTable = driver.findElement(BotonWebTable);
        if (webBotonWebTable.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonWebTable)).click();
            System.out.println("Se realiza click Menu Lateral Web Table");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click Menu Lateral Web Table");
            Assert.assertTrue(false);
        }
        By BotonADD = By.id("addNewRecordButton");
        WebElement webBotonADD = driver.findElement(BotonADD);
        if (webBotonADD.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonADD)).click();
            System.out.println("Se realiza click ADD de web table");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click ADD de web table");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtFullNameWT = By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]");
        WebElement webtxtFullNameTB = driver.findElement(txtFullNameWT);
        webtxtFullNameTB.sendKeys("Rodrigo");
        Thread.sleep(200);
        By txtLastNameWT = By.id("lastName");
        WebElement webtxtLastNameWT = driver.findElement(txtLastNameWT);
        if (webtxtLastNameWT.isDisplayed()) {
            webtxtLastNameWT.sendKeys("Espinoza Maltez");
            System.out.println("Se realiza Ingreso de last Name");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de last Name");
            Assert.assertTrue(true);
        }
        Thread.sleep(200);
        By txtEmailWT = By.id("userEmail");
        WebElement webtxtEmailWT = driver.findElement(txtEmailWT);
        if (webtxtEmailWT.isDisplayed()) {
            webtxtEmailWT.sendKeys("prueba@gmail.com");
            System.out.println("Se realiza Ingreso Email");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Email");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtEdad = By.id("age");
        WebElement webtxtEdad = driver.findElement(txtEdad);
        if (webtxtEdad.isDisplayed()) {
            webtxtEdad.sendKeys("35");
            System.out.println("Se realiza Ingreso EDAD");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de EDAD");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtSalario = By.id("salary");
        WebElement webtxtSalario = driver.findElement(txtSalario);
        if (webtxtSalario.isDisplayed()) {
            webtxtSalario.sendKeys("850000");
            System.out.println("Se realiza Ingreso Salario");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Salario");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtDepartamento = By.id("department");
        WebElement webtxtDepartamento = driver.findElement(txtDepartamento);
        if (webtxtDepartamento.isDisplayed()) {
            webtxtDepartamento.sendKeys("QA AUTOMATION");
            System.out.println("Se realiza Ingreso Departamento");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Departamento");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By BotonSumitWT = By.id("submit");
        WebElement webBotonSumitWT = driver.findElement(BotonSumitWT);
        if (webBotonSumitWT.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonSumitWT)).submit();
            System.out.println("Se realiza click Sumit Web Tables");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click Menu Lateral Web Table");
            Assert.assertTrue(false);
        }
        Thread.sleep(500);
        /**-->1-**Repito Ingreso************************************************************************************************/
        if (webBotonADD.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonADD)).click();
            System.out.println("Se realiza click ADD de web table");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click ADD de web table");
            Assert.assertTrue(false);
        }
        By txtFullNameWT1 = By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]");
        WebElement webtxtFullNameTB1 = driver.findElement(txtFullNameWT1);
        webtxtFullNameTB1.sendKeys("Jonathan");
        Thread.sleep(200);
        By txtLastNameWT1 = By.id("lastName");
        WebElement webtxtLastNameWT1 = driver.findElement(txtLastNameWT1);
        if (webtxtLastNameWT1.isDisplayed()) {
            webtxtLastNameWT1.sendKeys("Cuevas Muñoz");
            System.out.println("Se realiza Ingreso de last Name");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de last Name");
            Assert.assertTrue(true);
        }
        Thread.sleep(200);
        By txtEmailWT1 = By.id("userEmail");
        WebElement webtxtEmailWT1 = driver.findElement(txtEmailWT1);
        if (webtxtEmailWT1.isDisplayed()) {
            webtxtEmailWT1.sendKeys("prueba@gmail.com");
            System.out.println("Se realiza Ingreso Email");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Email");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtEdad1 = By.id("age");
        WebElement webtxtEdad1 = driver.findElement(txtEdad1);
        if (webtxtEdad1.isDisplayed()) {
            webtxtEdad1.sendKeys("35");
            System.out.println("Se realiza Ingreso EDAD");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de EDAD");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtSalario1 = By.id("salary");
        WebElement webtxtSalario1 = driver.findElement(txtSalario1);
        if (webtxtSalario1.isDisplayed()) {
            webtxtSalario1.sendKeys("1850000");
            System.out.println("Se realiza Ingreso Salario");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Salario");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtDepartamento1 = By.id("department");
        WebElement webtxtDepartamento1 = driver.findElement(txtDepartamento1);
        if (webtxtDepartamento1.isDisplayed()) {
            webtxtDepartamento1.sendKeys("TESTER QA AUTOMATION");
            System.out.println("Se realiza Ingreso Departamento");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Departamento");
            Assert.assertTrue(false);
        }
        //By BotonSumitWT = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]");
        Thread.sleep(200);
        By BotonSumitWT1 = By.id("submit");
        WebElement webBotonSumitWT1 = driver.findElement(BotonSumitWT1);
        if (webBotonSumitWT1.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonSumitWT1)).submit();
            System.out.println("Se realiza click Sumit Web Tables");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click Menu Lateral Web Table");
            Assert.assertTrue(false);
        }
        /*****************************************************************************************************************************/

        /**-->2-**Repito Ingreso************************************************************************************************/
        if (webBotonADD.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonADD)).click();
            System.out.println("Se realiza click ADD de web table");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click ADD de web table");
            Assert.assertTrue(false);
        }
        By txtFullNameWT2 = By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]");
        WebElement webtxtFullNameTB2 = driver.findElement(txtFullNameWT1);
        webtxtFullNameTB2.sendKeys("Juan Francisco");
        Thread.sleep(200);
        By txtLastNameWT2 = By.id("lastName");
        WebElement webtxtLastNameWT2 = driver.findElement(txtLastNameWT2);
        if (webtxtLastNameWT2.isDisplayed()) {
            webtxtLastNameWT2.sendKeys("Perez Perez");
            System.out.println("Se realiza Ingreso de last Name");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de last Name");
            Assert.assertTrue(true);
        }
        Thread.sleep(200);
        By txtEmailWT2 = By.id("userEmail");
        WebElement webtxtEmailWT2 = driver.findElement(txtEmailWT2);
        if (webtxtEmailWT2.isDisplayed()) {
            webtxtEmailWT2.sendKeys("prueba@gmail.com");
            System.out.println("Se realiza Ingreso Email");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Email");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtEdad2 = By.id("age");
        WebElement webtxtEdad2 = driver.findElement(txtEdad2);
        if (webtxtEdad2.isDisplayed()) {
            webtxtEdad2.sendKeys("35");
            System.out.println("Se realiza Ingreso EDAD");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de EDAD");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtSalario2 = By.id("salary");
        WebElement webtxtSalario2 = driver.findElement(txtSalario2);
        if (webtxtSalario2.isDisplayed()) {
            webtxtSalario2.sendKeys("1850000");
            System.out.println("Se realiza Ingreso Salario");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Salario");
            Assert.assertTrue(false);
        }
        Thread.sleep(200);
        By txtDepartamento2 = By.id("department");
        WebElement webtxtDepartamento2 = driver.findElement(txtDepartamento2);
        if (webtxtDepartamento2.isDisplayed()) {
            webtxtDepartamento2.sendKeys("INGENIERO TESTER QA AUTOMATION");
            System.out.println("Se realiza Ingreso Departamento");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Departamento");
            Assert.assertTrue(false);
        }
        //By BotonSumitWT = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]");
        Thread.sleep(200);
        By BotonSumitWT2 = By.id("submit");
        WebElement webBotonSumitWT2 = driver.findElement(BotonSumitWT1);
        if (webBotonSumitWT2.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(webBotonSumitWT2)).submit();
            System.out.println("Se realiza click Sumit Web Tables");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click Menu Lateral Web Table");
            Assert.assertTrue(false);
        }
        /********************************************************************************************************************************/

        //Fin Elements
        By botonFlechaSube = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]");
        WebElement webbotonFlechaSube = driver.findElement(botonFlechaSube);
        wait.until(ExpectedConditions.elementToBeClickable(webbotonFlechaSube)).click();
        /***************************************************************************************************************************/

        /** OBJETOS PERTENECIENTES A OPCION ELEMENTS FORMS*********************************************************************/

        //Click ToolQA
        Thread.sleep(500);
        By ToolsQA = By.xpath("//*[@id=\"app\"]/header/a/img");
        wait.until(ExpectedConditions.elementToBeClickable(ToolsQA)).click();

        By MenuCentralForms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div");
        wait.until(ExpectedConditions.elementToBeClickable(MenuCentralForms)).click();

        By botonPracticForms = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]");
        wait.until(ExpectedConditions.elementToBeClickable(botonPracticForms)).click();

        By txtNameF = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]");
        WebElement webtxtNameF = driver.findElement(txtNameF);
        if (webtxtNameF.isDisplayed()) {
            webtxtNameF.sendKeys("Rodrigo Alejandro");
            System.out.println("Se realiza Ingreso de Name");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Name");
            Assert.assertTrue(false);
        }
        Thread.sleep(300);
        By txtlastNameF = By.id("lastName");
        WebElement webtxtlastNameF = driver.findElement(txtlastNameF);
        if (webtxtlastNameF.isDisplayed()) {
            webtxtlastNameF.sendKeys("Espinoza Maltez");
            System.out.println("Se realiza Ingreso Apellidos");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Salario");
            Assert.assertTrue(false);
        }
        Thread.sleep(300);
        By optionMasculino = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/label[1]");
        WebElement weboptionMasculino = driver.findElement(optionMasculino);
        wait.until(ExpectedConditions.elementToBeClickable(weboptionMasculino)).click();
        Thread.sleep(300);
        By txtEmailF = By.id("userEmail");
        WebElement webtxtEmailF = driver.findElement(txtEmailF);
        if (webtxtEmailF.isDisplayed()) {
            webtxtEmailF.sendKeys("RspinozaM@example.com");
            System.out.println("Se realiza Ingreso de Email");
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Salario");
            Assert.assertTrue(false);
        }
        Thread.sleep(300);
            By txtMobile = By.id("userNumber");
            WebElement webtxtMobile = driver.findElement(txtMobile);
            if (webtxtMobile.isDisplayed()) {
                webtxtMobile.sendKeys("1234567890");
                System.out.println("Se realiza Ingreso Numero Mobile");
                Assert.assertTrue(true);
            } else {
                System.out.println("No es  Posible realizar Ingreso Numero Mobile");
                Assert.assertTrue(false);
            }
        Thread.sleep(300);
            By optionDeporte = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[1]/label[1]");
            WebElement weboptionDeporte = driver.findElement(optionDeporte);
            wait.until(ExpectedConditions.elementToBeClickable(weboptionDeporte)).click();
        Thread.sleep(300);
            By optionLeer = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[2]/label[1]");
            WebElement webooptionLeer = driver.findElement(optionLeer);
            wait.until(ExpectedConditions.elementToBeClickable(webooptionLeer)).click();
        Thread.sleep(300);
            By optionMusic = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[3]/label[1]");
            WebElement weboptionMusic = driver.findElement(optionMusic);
            wait.until(ExpectedConditions.elementToBeClickable(weboptionMusic)).click();
        Thread.sleep(300);
            By txtDireccionF = By.id("currentAddress");
            WebElement webtxtDireccionF = driver.findElement(txtDireccionF);
            if (webtxtDireccionF.isDisplayed()) {
                webtxtDireccionF.sendKeys("Alameda 1150, Morande con Compañia");
                System.out.println("Se realiza Ingreso Direccion");
                Assert.assertTrue(true);
            } else {
                System.out.println("No es  Posible realizar Ingreso de Direccion");
                Assert.assertTrue(false);
            }
        Thread.sleep(300);
            //seleccion de ComboBox Asignaturas
            By txtAsignaturas = By.id("subjectsInput");
            WebElement webtxtAsignatura = driver.findElement(txtAsignaturas);
            webtxtAsignatura.sendKeys("English");
            Thread.sleep(400);
            webtxtAsignatura.sendKeys("Computer Science");
            Thread.sleep(400);
            webtxtAsignatura.sendKeys("Arts");
            Thread.sleep(400);
            webtxtAsignatura.sendKeys("Social Studies");
            Thread.sleep(400);
            webtxtAsignatura.sendKeys("History");
            Thread.sleep(400);
           By CboselectCiudad = By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]");
           WebElement webCboselectCiudad = driver.findElement(CboselectCiudad);
           wait.until(ExpectedConditions.elementToBeClickable(webCboselectCiudad)).click();
           Thread.sleep(500);


        /***************************************************************************************************************************/

        /********OPCION WIDGETS******************************************************************************************************************/
        wait.until(ExpectedConditions.elementToBeClickable(ToolsQA)).click();
        Thread.sleep(700);
        By MenuWidget = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div");
        WebElement webMenuWidget = driver.findElement(MenuWidget);
        wait.until(ExpectedConditions.elementToBeClickable(webMenuWidget)).click();
        Thread.sleep(500);
        By MenuAcordian = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]");
        WebElement webMenuAcordian = driver.findElement(MenuAcordian);
        wait.until(ExpectedConditions.elementToBeClickable(webMenuAcordian)).click();
        Thread.sleep(300);
        By Acordion2 = By.id("section2Heading");
        wait.until(ExpectedConditions.elementToBeClickable(Acordion2)).click();
        Thread.sleep(300);
        By Acordion3= By.id("section3Heading");
        wait.until(ExpectedConditions.elementToBeClickable(Acordion3)).click();
        Thread.sleep(300);
        By Acordion1= By.id("section1Heading");
        wait.until(ExpectedConditions.elementToBeClickable(Acordion1)).click();
        Thread.sleep(300);
        By MenuProgresBar= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]");
        wait.until(ExpectedConditions.elementToBeClickable(MenuProgresBar)).click();
        Thread.sleep(300);
        By StarProgres= By.id("startStopButton");
        wait.until(ExpectedConditions.elementToBeClickable(StarProgres)).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ToolsQA)).click();
        /***************************************************************************************************************************/








    }
}
