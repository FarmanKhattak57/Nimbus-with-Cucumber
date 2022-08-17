package Cucumber_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class login_step_def {

	WebDriver driver=null; 


	@Given("user navigates to the website Nimbus")
	public void open_url()
	{
		WebDriverManager.chromedriver().setup();
	     driver =new ChromeDriver();
	     driver.get("https://app.nimbusrms.com/login");
	     driver.manage().window().maximize();
		
	}
	
	@And("There user logs in through Login Window by using companyname Username  Password")
	public void enter_data() throws Exception
	{
		 Thread.sleep(1500);
		    driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion");
		    Thread.sleep(2000);
		    driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
		    Thread.sleep(2000);
		    driver.findElement(By.id("Password")).sendKeys("12345");
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("#submit_form > div > div.login_body > div:nth-child(6) > button")).click();
		    Thread.sleep(30000);
		
		
		
	}
	@Then ("login must be successful.")
	public void verification() throws Exception
	{
		
		Thread.sleep(3000);
	    String ExpectedUrl="https://app.nimbusrms.com/Home";
	    String Actualurl=driver.getCurrentUrl();
	   Assert.assertEquals(Actualurl, ExpectedUrl);
	    Thread.sleep(3000);
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#user_img")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
	   
	    driver.close();
		
	//	System.out.println("ALL CALSSES will be  Execuite");
		
	}
	
	//-------------------------------------------------Logout-------------------------------------------------------------------
	 @Given ("user navigates to the website NimbusRms")
	 public void open_url_For_logout()
	 {

			WebDriverManager.chromedriver().setup();
		     driver =new ChromeDriver();
		     driver.get("https://app.nimbusrms.com/login");
		     driver.manage().window().maximize();
			
		 
		 
	 }
	 @And ("The user logsin through Loginscreen by using companyname Username  Password")
	 public void enter_valid_data() throws Exception
	 {
		 Thread.sleep(1500);
		    driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion");
		    Thread.sleep(2000);
		    driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
		    Thread.sleep(2000);
		    driver.findElement(By.id("Password")).sendKeys("12345");
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("#submit_form > div > div.login_body > div:nth-child(6) > button")).click();
		    Thread.sleep(30000);
		    Thread.sleep(3000);
		    
	 }
	 @And ("click on logut Image")
	 public void click_logut_image() throws Exception
	 {
		 Thread.sleep(3000);
		    driver.findElement(By.cssSelector("#user_img")).click();
		 
	 }
	 @And ("Click on Logut button")
	 public void  clcik_on_logout_link() throws Exception
	 {
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
	 }
	 @Then ("url of New loging should be verified")
	 
	 public void logout_verifiection() throws Exception
	 
	 {
		 Thread.sleep(3000);
		    String ExpectedUrl="https://app.nimbusrms.com/login";
		    String Actualurl=driver.getCurrentUrl();
		   Assert.assertEquals(Actualurl, ExpectedUrl);
		 
		   driver.close();
	 }
	
	
	

}