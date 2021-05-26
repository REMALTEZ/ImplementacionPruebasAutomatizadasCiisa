package testCases;


import org.testng.annotations.Test;
import pages.PageDemoQA;

public class Test_CasoDePruebaDemoQA0001 {
    private PageDemoQA pageDemoQA;

    public Test_CasoDePruebaDemoQA0001() {
    }

@Test
    public void testFlujoPageDemoQA() throws InterruptedException {
    pageDemoQA.validaPageDemoQA();
    }
}
