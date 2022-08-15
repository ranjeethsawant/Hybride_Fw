package com.hrms.lib;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
		
	//******** Methods ***************** 
	
	public void open_App() {
		System.setProperty("webdriver.chrome.driver","S:\\Jar_Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("App open");
		Reporter.log("App Open");
		Log.info("App open");
	    }
	    
	public void close_App() {
		driver.close();
		System.out.println("App Close");
		Reporter.log("App Close");
		Log.info("App Close");
	    }
	public void login_App() {
		driver.findElement(By.name(txt_un)).sendKeys(un);
		driver.findElement(By.name(txt_pw)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
        }
    public void logout_App()  {
    	driver.findElement(By.linkText(link_submit)).click();
    	System.out.println("Logout");
    	Reporter.log("Logout");
        }
    public void enter_frame() {
    	driver.switchTo().frame("rightMenu");
    	System.out.println("Enter frame");
    	Reporter.log("Enter frame");
    	Log.info("Enter frame");
        }
    public void exit_frame() {
    	driver.switchTo().defaultContent();
    	System.out.println("exit frame");
    	Reporter.log("Exit frame");
    	Log.info("exit frame");
        }
    public void add_emp() {
    	driver.findElement(By.xpath(btn_add)).click();
    	driver.findElement(By.xpath(txt_empLN)).sendKeys(LN);
        driver.findElement(By.xpath(txt_empFN)).sendKeys(FN);
        driver.findElement(By.xpath(btn_save)).click();
        System.out.println("Add Emp detail");
        Reporter.log("Add Emp detail");
        Log.info("Add Emp detail");
    }
    public void upload_file() throws Exception {
    driver.findElement(By.xpath(btn_add)).click();
	driver.findElement(By.xpath(txt_empLN)).sendKeys(LN);
    driver.findElement(By.xpath(txt_empFN)).sendKeys(FN);
    WebElement fileupload = driver.findElement(By.xpath(txt_file));
    fileupload.sendKeys(File);
    Thread.sleep(5000);
    driver.findElement(By.xpath(btn_save)).click();
    System.out.println("Upload file");
    Reporter.log("Upload file");
    Log.info("Upload file");
    
        }
}


