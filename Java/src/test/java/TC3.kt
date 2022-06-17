package com.example

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import org.openqa.selenium.*
import org.openqa.selenium.chrome.ChromeDriver
import java.util.*
import java.util.concurrent.TimeUnit

class UntitledTestCase {
    private var driver: WebDriver? = null
    private var baseUrl: String? = null
    private var acceptNextAlert = true
    private val verificationErrors = StringBuffer()
    var js: JavascriptExecutor? = null
    @Before
    @kotlin.Throws(Exception::class)
    fun setUp() {
        System.setProperty("webdriver.chrome.driver", "")
        driver = ChromeDriver()
        baseUrl = "https://www.google.com/"
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)
        js = driver as JavascriptExecutor?
    }

    @Test
    @kotlin.Throws(Exception::class)
    fun testUntitledTestCase() {
        driver.get("https://www.kayak.ch/")
        driver.findElement(By.xpath("//div[@id='OG_D']/div/div/div/div/div[2]/div/div[3]/div/div/input")).click()
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sun 24.7.'])[1]/following::*[name()='svg'][3]")).click()
        driver.findElement(By.cssSelector("#c3t0N-price-title > div.icon > svg > path")).click()
        driver.findElement(By.id("c3t0N-price-price-slider-sliderWidget-handle-0")).click()
        driver.findElement(By.id("c3t0N-stops-6221-1-check-icon")).click()
    }

    @After
    @kotlin.Throws(Exception::class)
    fun tearDown() {
        driver.quit()
        val verificationErrorString = verificationErrors.toString()
        if ("" != verificationErrorString) {
            fail(verificationErrorString)
        }
    }

    private fun isElementPresent(by: By): Boolean {
        return try {
            driver.findElement(by)
            true
        } catch (e: NoSuchElementException) {
            false
        }
    }

    private val isAlertPresent: Boolean
        private get() = try {
            driver.switchTo().alert()
            true
        } catch (e: NoAlertPresentException) {
            false
        }

    private fun closeAlertAndGetItsText(): String {
        return try {
            val alert: Alert = driver.switchTo().alert()
            val alertText: String = alert.getText()
            if (acceptNextAlert) {
                alert.accept()
            } else {
                alert.dismiss()
            }
            alertText
        } finally {
            acceptNextAlert = true
        }
    }
}