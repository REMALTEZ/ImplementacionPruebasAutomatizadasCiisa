package utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.reporter.configuration.ViewName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.File.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;


import static org.testng.internal.Constants.*;

public class HtmlReport {
    private static ExtentReports reports;
    private static ExtentTest test;
    public static ExtentSparkReporter spark;
    private static WebDriver driver;
    private static final DateFormat dateFormat = new SimpleDateFormat("hhmmSSS");
    private static int paso;
    private static String suite;
    private static ArrayList<String> errorMessages;
    //private static String URL_REPORT = "src\\test\\resources\\reports\\";
    private static String URL_REPORT = "HTMLREPORTS\\";
    public HtmlReport(String suiteName) {
        reports = new ExtentReports();
        spark = new ExtentSparkReporter(URL_REPORT + suiteName + "\\ReporteEjecucion.html").viewConfigurer().viewOrder()
                .as(new ViewName[] {
                        ViewName.DASHBOARD,
                        ViewName.CATEGORY,
                        ViewName.TEST,
                        ViewName.AUTHOR,
                        ViewName.DEVICE,
                        ViewName.EXCEPTION,
                        ViewName.LOG
                })
                .apply();

        reports.attachReporter(new ExtentObserver[]{spark});
        reports.setSystemInfo("OS",System.getProperty("os.name").toLowerCase());
        try {
            File json;
            json = new File("C:\\Selenium\\PMV_Automatizacion\\src\\main\\java\\utils\\htmlConfig.json");
            //File json = new File(Constants.RUTA_CONFIG_HTML_REPORT+ "src\\main\\java\\utilis\\htmlConfig.json");

            spark.loadJSONConfig(json);
        } catch (IOException var3) {
            var3.printStackTrace();
        }

        suite = suiteName;
        paso = 1;
        errorMessages = new ArrayList();
    }

    public static void setReportPath(String path) {
        URL_REPORT = path;
    }

    public static void newTest(String testName,String tag,String url) {
        test = reports.createTest(testName).assignCategory(tag);
        test.log(Status.INFO,"Ir a Qtest : <a href='"+url+"' target=\"_blank\">"+testName+"</a>");
        paso = 1;
    }
    public static String getSuite(){
        return suite;
    }
    public static String getReportPath(){
        return System.getProperty("user.dir")+ "\\"+URL_REPORT;
    }

    public static void updateDriver(WebDriver driv) {
        driver = driv;
    }

    private static String captureScreenShot(WebDriver driver) {
        String imageName = System.currentTimeMillis() + ".png";
        File screenshotFile = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File targetFile = new File(URL_REPORT + suite + "\\htmlScreenshots", imageName);

        try {
            FileUtils.copyFile(screenshotFile, targetFile);
        } catch (IOException var5) {
            test.log(Status.INFO, "No se pudo obtener el screenshot");
        }

        System.out.println("Screenshot: " + targetFile.getName());
        return targetFile.getName();
    }

    public static void addStep(Status status, String nombrePaso, String descripcion, Boolean screenshot) {
        test.log(Status.INFO, "PASO " + paso + ": " + nombrePaso);
        if (screenshot) {
            String ss = captureScreenShot(driver);
            test.log(status, descripcion, MediaEntityBuilder.createScreenCaptureFromPath("htmlScreenshots\\" + ss).build());
        } else {
            test.log(status, descripcion);
        }

        if (status.toString().equals("Fail")) {
            addErrorMessagesToReport();
        }

        ++paso;
    }

    public static void addInfo(String info) {
        String condition = "Build info";
        if (info.contains(condition)) {
            String[] info1 = info.split(condition);
            test.log(Status.WARNING, info1[0]);
        } else {
            test.log(Status.WARNING, info);
        }

    }

    public static void addErrorMessage(String message) {
        errorMessages.add(message);
    }

    public static void addErrorMessagesToReport() {
        if (!errorMessages.isEmpty()) {
            Iterator var0 = errorMessages.iterator();

            while(var0.hasNext()) {
                String message = (String)var0.next();
                addInfo(message);
            }

            errorMessages.clear();
        }

    }

    public static void addSystemInfo(String info) {
        String[] infos = info.split(",");
        test.assignCategory(infos);
    }

    public static void endReport() {
        reports.flush();
    }

    /*public void leerHtml() {
        String rutaHtml = "./report/suite.html";

        try {
            File htmlTemplateFile = new File(rutaHtml);
            String htmlString = FileUtils.readFileToString(htmlTemplateFile, StandardCharsets.UTF_8);
            htmlString = htmlString.replace("./report", ".");
            File newHtmlFile = new File(rutaHtml);
            FileUtils.writeStringToFile(newHtmlFile, htmlString, StandardCharsets.UTF_8);
        } catch (Exception var5) {
            System.out.println("Error " + var5.toString());
        }

    }*/

    public static void reporteObjetoDesplegado(boolean estadoObjeto, String objeto, String vista, boolean fatal) {
        if (estadoObjeto) {
            addStep(Status.PASS, vista, "Elemento encontrado: " + objeto, true);
        } else {
            addStep(Status.FAIL, vista, "Elemento no encontrado: " + objeto, true);
            if (fatal) {
                Assert.fail("[ Elemento no encontrado: " + objeto + " ]");
            }
        }

    }
    public static void addWebReportImage(String nombre, String descripcion, Status status, boolean fatal){
        if (fatal){
            addStep(status,nombre,descripcion,true);
            Assert.fail();
        }
        else {
            addStep(status,nombre,descripcion,true);
        }
    }
    public static void addWebReport(String nombre, String descripcion, Status status, boolean fatal){
        if (fatal){
            addStep(status,nombre,descripcion,false);
            Assert.fail();
        }
        else {
            addStep(status,nombre,descripcion,false);
        }
    }

    public static void fail(Throwable t){
        test.fail(t);
    }
    public static void fail(String t){
        test.fail(t);
    }
}
