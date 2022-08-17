package Cucumber_learning;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import io.cucumber.java.en.And;

public class itemDef_step_def 
{
 WebDriver driver=null;

	
	
	@Given ("The user navigates to the website Nimbus")
	public void open_url_for_item() throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	     driver =new ChromeDriver();
		//open url
		driver.get("https://www.nimbusrms.com/");
		//MAXIMIZE cHROME WINDOW
	    driver.manage().window().maximize();
	    Thread.sleep(1500);
		
	}
	
	@And ("The user logs in through Login Screen Window by using companyname Username  Password")
	public void login_nimbs_data() throws Exception
	{
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#menu-item-8089 > a")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion");
	    Thread.sleep(2000);
	    driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    Thread.sleep(2000);
	   driver.findElement(By.cssSelector("#submit_form > div > div.login_body > div:nth-child(6) > button")).click();
	    Thread.sleep(15000);
		
	}
	
	@When ("Open Item Definition Screen")
	public void open_item_def_screen() throws Exception
	{
		 Thread.sleep(30000);
		    
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		   Thread.sleep(10000);
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
				
	}
	@And ("Click on New button")
	public void click_on_new() throws Exception
	{
		 Thread.sleep(30000);
		 driver.findElement(By.id("btnNew")).click();
		 
		
		
	}
	@And ("Enter data to define new item like lineitem code name costprice and retailprice")
	public void define_new_item() throws Exception
	{
		Thread.sleep(5000);
		   driver.findElement(By.id("ddlLineItemDef")).sendKeys("General");
		   Thread.sleep(1000);
		   driver.findElement(By.id("SingleTemplateCode")).click();
		   Thread.sleep(1000);
		   Random rad= new Random();
		   
		   driver.findElement(By.id("ProductName")).sendKeys("Surf Excel "+rad.nextInt(50));
		   Thread.sleep(1000);
		   driver.findElement(By.id("AverageCost")).sendKeys("500");
		   Thread.sleep(1000);
		   driver.findElement(By.id("Price")).sendKeys("800");
		   Thread.sleep(2000);
		
	}
	@And ("clcik  on save button")
	public void click_on_save() throws InterruptedException
	{
		
		driver.findElement(By.id("btnSaveProduct")).click();
		   Thread.sleep(1000);
	   driver.findElement(By.id("okButton")).click();
	}
	@Then ("Verified New defined item")
	public void cerified_new_item() throws Exception
	{
		 String ExpectedSuccessMessage="";
		    String ActualSuccessMessage=driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]")).getText();
		    Assert.assertEquals(ActualSuccessMessage, ExpectedSuccessMessage);
		    Thread.sleep(3000);
		
	}
	@And ("logout from nimbus") 
	public void logut_from_nimbus() throws Exception
	{
		 Thread.sleep(5000);
		driver.findElement(By.cssSelector("#user_img")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
	    Thread.sleep(1500);
	   
	    driver.close();
	}
	
	//------------------------------------------Update Item Def---------------------------------------------
	
	@Given ("The user navigates to the website Nimbus for update")
	public void open_url_for_item_update() throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	     driver =new ChromeDriver();
		//open url
		driver.get("https://www.nimbusrms.com/");
		//MAXIMIZE cHROME WINDOW
	    driver.manage().window().maximize();
	    Thread.sleep(1500);
		
	}
	
	@And ("The user logs in through Login Screen Window by using companyname Username  Password for update")
	public void login_nimbs_data_for_update() throws Exception
	{
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#menu-item-8089 > a")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion");
	    Thread.sleep(2000);
	    driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    Thread.sleep(2000);
	   driver.findElement(By.cssSelector("#submit_form > div > div.login_body > div:nth-child(6) > button")).click();
	    Thread.sleep(15000);
		
	}
	
	@When ("Open again Item Definition Screen")
	public void open_item_def_again_for_update() throws Exception
	{
		Thread.sleep(30000);
	    
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		   Thread.sleep(10000);
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		
	}
	@And ("Click on Edit button")
	public void click_on_Editbtn() throws Exception
	{
		Thread.sleep(10000);
		   driver.findElement(By.id("btnEdit")).click();
		   Thread.sleep(5000); 
		
	}
	@And ("Also click on update button")
	public void click_on_update() throws Exception
	{
		 
		   driver.findElement(By.id("btnUpdateProduct")).click();
		   Thread.sleep(3000); 
		   driver.findElement(By.id("okButton")).click();		  
		   Thread.sleep(3000);
	}
	@Then ("Verfied udpated item")
	public void verified_update_item() throws Exception
	{
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#user_img")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
	    Thread.sleep(3000); 
		System.out.println("Update itam Successfully ");
		
	driver.close();
	}

	//-----------------------------------------------------Delete Newly Defined  item----------------------------------------
	
	@Given ("The user navigates to the website Nimbus for Delete")
	public void open_url_for_item_Delete() throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	     driver =new ChromeDriver();
		//open url
		driver.get("https://www.nimbusrms.com/");
		//MAXIMIZE cHROME WINDOW
	    driver.manage().window().maximize();
	    Thread.sleep(1500);
		
	}
	
	@And ("The user logs in through Login Screen Window by using companyname Username  Password for Delete")
	public void login_nimbs_data_for_Delete() throws Exception
	{
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#menu-item-8089 > a")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion");
	    Thread.sleep(2000);
	    driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    Thread.sleep(2000);
	   driver.findElement(By.cssSelector("#submit_form > div > div.login_body > div:nth-child(6) > button")).click();
	    Thread.sleep(15000);
		
	}
	
	
	
	
	@When ("Open again Item Definition Screen for Item Deletion")
	public void open_itemdef_for_deletion() throws Exception
	{
		
		Thread.sleep(30000);
	    
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		   Thread.sleep(10000);
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		
	}
	@And ("Click on Edit button for deletion")
	public void click_on_edit_for_deletion() throws Exception
	{
		Thread.sleep(10000);
		   driver.findElement(By.id("btnEdit")).click();
		   Thread.sleep(3000);
		
	}
	@And ("Also click on Delete button")
	public void click_on_delete_item() throws Exception
	{
		driver.findElement(By.cssSelector("#btnDeleteProduct")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("okButton")).click();
		   Thread.sleep(3000);
		 
		
	}
	@Then ("Verfied Deleted item data")
	public void verfied_delete_item() throws Exception
	{
		   driver.findElement(By.cssSelector("#user_img")).click();
		    Thread.sleep(1500);
		    driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
		   
		   Thread.sleep(3000); 
		   System.out.println("Delete itam Successfully ");
		
		driver.close();
	}

}


