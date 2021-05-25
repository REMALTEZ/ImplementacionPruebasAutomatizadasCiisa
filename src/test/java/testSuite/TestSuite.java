package testSuite;

import org.testng.annotations.Test;
import pages.PageDemoQA;
import testCases.Test_CasoDePruebaDemoQA0001;

public class TestSuite {
    private TestSuite testSuite;

    public TestSuite() {
    }

    private void EjecutaSuit() throws InterruptedException {
        Test_CasoDePruebaDemoQA0001 test_001 = new Test_CasoDePruebaDemoQA0001();
        test_001.testFlujoPageDemoQA();
        testSuite.EjecutaSuit();
    }


}
