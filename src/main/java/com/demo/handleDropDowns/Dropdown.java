package com.demo.handleDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ideElement = driver.findElement(By.xpath("//span[text()='Dropdown']/following::select"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropdownoptions = ideDropdown.getOptions();
		for (WebElement option : ideDropdownoptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0);//volvo
        Thread.sleep(3000);
        ideDropdown.selectByValue("saab");//saab
        Thread.sleep(3000);
        ideDropdown.selectByVisibleText("Opel");
        Thread.sleep(3000);
        //DeSelection
        
        
        ideDropdown.deselectByIndex(0);
       
       System.out.println(ideDropdown);
       List<WebElement> selectedOptions=ideDropdown.getAllSelectedOptions();
       for (WebElement selectedOption : selectedOptions) 
       {
			System.out.println("selected visible text-"+selectedOption.getText());
		}
       ideDropdown.deselectAll();
       driver.close();
	}

}
