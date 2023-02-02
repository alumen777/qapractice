package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GoogleTest extends Base{
    private WebDriver driver;
    private String baseUrl= "https://demoqa.com/text-box";

    @Test
    public void setUp() throws IOException {
        driver=initializeDriver();
        driver.get(baseUrl);
        String title= driver.getTitle();
        InputFromPage inputFromPage = new InputFromPage(driver);
        WebElement name = inputFromPage.name();
        WebElement userEmail = inputFromPage.getUserEmail();
        WebElement currentAddress = inputFromPage.currentAddress();
        WebElement permanentAddress = inputFromPage.getPermanentAddress();
        WebElement   submitButton = inputFromPage.getSubmitButton();
        WebElement outputBox = inputFromPage.output();

        name.sendKeys(" John");
        userEmail.sendKeys("jonh@doe.com");
        currentAddress.sendKeys("New York 6th ave ");
        permanentAddress.sendKeys("Chicago Michigan ave");
        submitButton.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      Assert.assertEquals(title,"ToolsQA","title is not as expected");
      Assert.assertEquals(outputBox.isDisplayed(),);
        System.out.println(" output ");



        }

    }



