package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginface {
	public static WebDriver driver;
	@Given("navigate to Facebook page")
	public void navigate_to_Facebook_page() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
	    
	}

	@When("user logged in using username as {string} and password as {string}")
	public void user_logged_in_using_username_as_and_password_as(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	   
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	   
	}
	
	@When("user logged in using invalid username as {string} and password as {string}")
	public void user_logged_in_using_invalid_username_as_and_password_as(String invalidusername, String validpassword) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys(invalidusername);
		driver.findElement(By.id("pass")).sendKeys(validpassword);
	   
	}

	@When("user logged in using multple credentials username as  {string} and password as {string}")
	public void user_logged_in_using_multple_credentials_username_as_and_password_as(String string, String string2) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}
	
	@Given("clear all the browser")
	public void clear_all_the_browser() throws InterruptedException {
		Thread.sleep(10000);
	    driver.quit();
	}


}
