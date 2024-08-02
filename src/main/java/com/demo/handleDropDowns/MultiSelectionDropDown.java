package com.demo.handleDropDowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionDropDown 
{	
	 public static void main( String[] args ) throws Exception
	    {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        
	        WebElement ideElement=driver.findElement(By.id("ide"));
	        Select ideDropdown=new Select(ideElement);
	        List<WebElement> ideDropdownoptions=ideDropdown.getOptions();
	        for (WebElement option : ideDropdownoptions) 
	        {
				System.out.println(option.getText());
			}
	        ideDropdown.selectByIndex(0);//Ecllipsce
	        Thread.sleep(3000);
	        ideDropdown.selectByValue("ij");//Intellij IDEA
	        Thread.sleep(3000);
	        ideDropdown.selectByVisibleText("NetBeans");//NetBeans
	        Thread.sleep(3000);
	        //DeSelection

	        ideDropdown.deselectByVisibleText("IntelliJ IDEA");
	        //System.out.println(ideDropdown);
	        /*
	        List<WebElement> selectedOptions=ideDropdown.getAllSelectedOptions();
	        for (WebElement selectedOption : selectedOptions) 
	        {
				System.out.println("selected visible text-"+selectedOption.getText());
			}
			*/

	    }
}
