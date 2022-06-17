package com.example;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

    public class UntitledTestCase {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();
        JavascriptExecutor js;
        @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver", "");
            driver = new ChromeDriver();
            baseUrl = "https://www.google.com/";
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            js = (JavascriptExecutor) driver;
        }

        @Test
        public void testUntitledTestCase() throws Exception {
            driver.get("https://www.kayak.ch/");
            driver.findElement(By.xpath("//div[@id='OG_D']/div/div/div/div/div[2]/div/div[3]/div/div/input")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sun 24.7.'])[1]/following::*[name()='svg'][3]")).click();
            driver.findElement(By.cssSelector("#c3t0N-price-title > div.icon > svg > path")).click();
            driver.findElement(By.id("c3t0N-price-price-slider-sliderWidget-handle-0")).click();
            driver.findElement(By.id("c3t0N-stops-6221-1-check-icon")).click();
        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private boolean isAlertPresent() {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
    }

}
