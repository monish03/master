package com.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepsdefination {

	public static WebDriver driver;

	@Given("user navigate to bank site")
	public void user_navigate_to_bank_site() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();

	}

	@When("user enter Username")
	public void user_enter_Username() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("123456");

	}

	@And("user entered pass")
	public void user_entered_pass() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd123");

	}

	@Then("user succesfully logged in")
	public void user_succesfully_logged_in() {
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

	}

	//////////////////////// with
	//////////////////////// datapass///////////////////////////////////////////////

	@When("user enter Username {string}")
	public void user_enter_Username(String uname) {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(uname);

	}

	@When("user entered pass {string}")
	public void user_entered_pass(String passw) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passw);
	}

	@After
	public void closebrowser() throws InterruptedException {
		//Thread.sleep(3000);
	//	driver.quit();
	}

	@Given("user navigate to changepassword")
	public void user_navigate_to_changepassword() {
		driver.findElement(By.xpath("//*[text()='Changepassword']")).click();
	}

	@When("user enter  old password")
	public void user_enter_old_password() {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		driver.findElement(By.xpath("//input[@name='oldpassword']")).sendKeys("mon03@");

	}

	@When("user enters new password and confirm password")
	public void user_enters_new_password_and_confirm_password() {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		 driver.findElement(By.xpath("//input[@name='newpassword']")).sendKeys("kkk123@");
		 driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("kkk123@");
		// List<String> Listdata;
		//List<Map<String,String>> data1= dataTable.asMaps(String.class,String.class);
	   
	}

	@Then("user succesfully change the password")
	public void user_succesfully_change_the_password() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().alert().accept();
	    
	}
	@Given("user navigates to logout functionality")
	public void user_navigates_to_logout_functionality() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Log out']")).click();
	   
	}
}
