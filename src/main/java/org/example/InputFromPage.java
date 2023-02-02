package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFromPage extends Base{

    private final WebElement name;
    private final WebElement userEmail;
    private final WebElement currentAddress;
    private final WebElement permanentAddress;
    private final WebElement submitButton;
    private final WebElement outputBox;


    public InputFromPage(WebDriver driver) {

        this.driver=driver;
        this.name = driver.findElement(By.id("userName"));
        this.userEmail= driver.findElement(By.id("userEmail"));
        this.currentAddress= driver.findElement(By.id("currentAddress"));
        this.permanentAddress= driver.findElement(By.id("permanentAddress"));
        this. submitButton=   driver.findElement(By.id("submit"));
        this.outputBox = driver.findElement(By.id("output"));
    }
    public WebElement name(){return this.name;}
    public WebElement getUserEmail(){return this.userEmail;}
    public WebElement currentAddress(){return this.currentAddress;}
    public WebElement getPermanentAddress(){return this.permanentAddress;}
    public WebElement  getSubmitButton(){return this.submitButton;}
    public WebElement output(){return this.outputBox;}
}
