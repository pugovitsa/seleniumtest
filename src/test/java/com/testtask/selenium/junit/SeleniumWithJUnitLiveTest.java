package com.testtask.selenium.junit;

import com.testtask.selenium.SeleniumExample;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class SeleniumWithJUnitLiveTest {

    private static SeleniumExample seleniumExample;
    private String expectedTitle = "About Baeldung | Baeldung";

    @BeforeClass
    public static void setUp() {
        seleniumExample = new SeleniumExample();
    }

    @AfterClass
    public static void tearDown() {
        seleniumExample.closeWindow();
    }

}
