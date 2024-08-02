package com.demo.handleDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement CourseElement=driver.findElement(By.id("course"));
        Select CourseNameDropdown=new Select(CourseElement);
        
        List<WebElement> CourseNameDropdownoptions=CourseNameDropdown.getOptions();
        
        for (WebElement option : CourseNameDropdownoptions) 
        {
			System.out.println(option.getText());
		}
        CourseNameDropdown.selectByIndex(1);//java
        Thread.sleep(3000);
        CourseNameDropdown.selectByValue("net");//Dot net
        Thread.sleep(3000);
        CourseNameDropdown.selectByVisibleText("Javascript");//Javascript
        Thread.sleep(3000);
        
        String selectedtext =CourseNameDropdown.getFirstSelectedOption().getText();
        System.out.println("select visible text-"+selectedtext);
        
        
    }
}
