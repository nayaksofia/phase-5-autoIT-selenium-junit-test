package com.ecom.webapp;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserProfileUploadTest {

	final String profileURL = "https://github.com/settings/profile";
	
	WebDriver driver;
	//setup
	@BeforeEach
	void setup() {
		
		InitializeDriver.init();
		driver = RunTimeDriver.getDriver();
	}
	
	@AfterEach
	void tearDown() {
		//InitializeDriver.destroy();
	}
	
	@Test
	public void testForGithubUserProfileUpload() throws InterruptedException, IOException {
		
		//login
		LoginToGithub.userLogin();
		
		//navigate to User Profile
		driver.get(profileURL);
		
		//Click Upload Profile
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/summary")).click();
		
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/details-menu/label")).click();
		
		Thread.sleep(2000);
		
		//Execute an Upload profile.exe file
		Runtime.getRuntime().exec("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\AutoIT_Practice\\autoit-file\\file-upload.exe");
		
		Thread.sleep(2000);
		
		//Submit Profile Image
		driver.findElement(By.xpath("/html/body/details/details-dialog/form/div[2]/button")).click();
		
		Thread.sleep(2000);
		
	}
	
	
}
