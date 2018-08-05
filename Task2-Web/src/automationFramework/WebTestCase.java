package automationFramework;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTestCase {

	public static void main(String[] args) {
		//Creating an instance of the firefox driver.
		WebDriver wd = new FirefoxDriver();		
       
		//Navigating to the url.
		wd.get("http://www.way2automation.com/angularjs-protractor/webtables/");		
		
		//Making the thread sleep for 5 seconds.
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{					
			e.printStackTrace();
		}
		
		//i used the xpath to find the elements location as there where no id's available.
		WebElement tableHeaders = wd.findElement(By.xpath("/html/body/table/thead/tr[3]"));
		if(tableHeaders.isDisplayed())
		{
			WebElement addUserButton = wd.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button"));		
			//This is used to click an object.
			addUserButton.click();
			
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{					
				e.printStackTrace();
			}
			
			WebElement addUserHeader = wd.findElement(By.xpath("/html/body/div[3]/div[1]/h3"));
			//Validating that the header is displayed.
			if(addUserHeader.isDisplayed())
			{
				WebElement firstNameTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
				//This is used to enter text into a textbox.
				firstNameTextbox.sendKeys("FName1");
				
				WebElement surnameTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
				surnameTextbox.sendKeys("LName1");
				
				WebElement userNameTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
				userNameTextbox.sendKeys("User1");
				
				WebElement passworTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
				passworTextbox.sendKeys("Pass1");				
				
				WebElement CompanyAAARadio = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input"));
				CompanyAAARadio.click();				
				
				WebElement roleCombobox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select"));
				//This is used to select the dropdown option by the value.
				Select roleSelect = new Select(roleCombobox);
				roleSelect.selectByValue("Admin");
				
				WebElement emailTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
				emailTextbox.sendKeys("admin@mail.com");
				
				WebElement cellNumberTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input"));
				cellNumberTextbox.sendKeys("082555");
								
				WebElement saveButton = wd.findElement(By.xpath("html/body/div[3]/div[3]/button[2]"));				
				WebElement closeButton = wd.findElement(By.xpath("/html/body/div[3]/div[3]/button[1]"));
				
				//Validating before clicking the button.
				if(saveButton.isEnabled())
				{
					saveButton.click();
				}
				else
				{
					closeButton.click();
					System.out.println("Save button was not enabled and add user window was closed.");
				}
				
				try 
				{
					Thread.sleep(5000);
				} catch (InterruptedException e) 
				{					
					e.printStackTrace();
				}
				
			
				WebElement CompanyBBBRadio = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input"));
				CompanyBBBRadio.click();
			
			}
			else
			{
				System.out.println("Add User Header is not displayed.");
			}
			
			WebElement addUserButton2 = wd.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button"));		
			addUserButton2.click();
			
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{					
				e.printStackTrace();
			}
			
			WebElement addUserHeader2 = wd.findElement(By.xpath("/html/body/div[3]/div[1]/h3"));
			if(addUserHeader2.isDisplayed())
			{
				WebElement firstNameTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
				firstNameTextbox.sendKeys("FName2");
				
				WebElement surnameTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
				surnameTextbox.sendKeys("LName2");
				
				WebElement userNameTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
				userNameTextbox.sendKeys("User2");
				
				WebElement passworTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
				passworTextbox.sendKeys("Pass2");				
				
				WebElement CompanyBBBRadio = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input"));
				CompanyBBBRadio.click();				
				
				WebElement roleCombobox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select"));
				Select roleSelect = new Select(roleCombobox);
				roleSelect.selectByValue("Customer");
				
				WebElement emailTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
				emailTextbox.sendKeys("customer@mail.com");
				
				WebElement cellNumberTextbox = wd.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input"));
				cellNumberTextbox.sendKeys("082444");
								
				WebElement saveButton = wd.findElement(By.xpath("html/body/div[3]/div[3]/button[2]"));				
				WebElement closeButton = wd.findElement(By.xpath("/html/body/div[3]/div[3]/button[1]"));
				
				if(saveButton.isEnabled())
				{
					saveButton.click();
				}
				else
				{
					closeButton.click();
					System.out.println("Save button was not enabled and add user window was closed.");
				}
				
				try 
				{
					Thread.sleep(5000);
				} catch (InterruptedException e) 
				{					
					e.printStackTrace();
				}			
			}
			else
			{
				System.out.println("Add User Header is not displayed.");
			}
		}
		else
		{
			System.out.println("The user list table is not displayed.");
		}
		        
		wd.quit();

	}
}
