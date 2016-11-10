package com.testclass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTestng {
	@Test
  public void f() {

	public Webdriver driver;

	@BeforeMethod

	  public void Start(){
	  driver=new FirefoxDriver();
	  driver.get(“https://www.facebook.com/”);
      }

	@AfterMethod

	public void Close() {

		driver.quit();

	}

	@Test

	  public void LoginSignup() throws InterruptedException{
 //for login

 //driver.findElementById("email").clear();

		  driver.findElementById(“email”).sendKeys(“hardik@facebook.com”);
		  driver.findElementById(“pass”).sendKeys(“hardik1234”);
		  driver.findElementById(“u_0_v”).click();
 //for SignUP
		  driver.findElementByXPath(".//*[@id='u_0_2']").sendKeys("Hardik");
		  driver.findElementByXPath(".//*[@id='u_0_4']").sendKeys("Patel");
		  driver.findElementByXPath(".//*[@id='u_0_6']").sendKeys("xxx-xxx-xxxx");
		  driver.findElementByXPath(".//*[@id='u_0_9']").sendKeys("xxx-xxx-xxxx");
		  driver.findElementByXPath(".//*[@id='u_0_b']").sendKeys("hardik123");
 //for drop down
		  Select Days =new Select(driver.findElementById("day"));
		  Days.selectByValue("21");
		  Thread.sleep(1000);
		  Select Month =new Select(driver.findElementById("month"));
		  Month.selectByValue("7");
		  Thread.sleep(1000);
		  Select Year =new Select(driver.findElementById("year"));
		  Year.selectByValue("1993");
		  //driver.findElementByXPath(".//*[@id='u_0_b']/div[2]/a").click();
 //for radio button
		  driver.findElementByXPath(".//*[@id='u_0_j']").click();
 //for sign up button
		  driver.findElementByXPath(".//*[@id='u_0_f']").click();

	  }
}
