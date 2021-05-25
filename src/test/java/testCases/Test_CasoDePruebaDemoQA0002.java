package testCases;


import org.testng.annotations.Test;
import pages.PageOnlineshoppingDemoQA;

public class Test_CasoDePruebaDemoQA0002 {
    private PageOnlineshoppingDemoQA pageOnlineDemoQA;

    public Test_CasoDePruebaDemoQA0002() { }

@Test
    public void testFlujoPageOnlineDemoQA() throws InterruptedException {
        pageOnlineDemoQA.validaComprasOnline();
    }

}
