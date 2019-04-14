/**
 * 
 */
package com.OpenWealthMapTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OpenWealthMapTest.Base.HelperClass;

/**
 * @author admin
 *
 */
public class OpenWealthHome extends HelperClass {
	
	
	
	//Defining xpath
	
	@FindBy(xpath="//a[text()='Weather']")
	WebElement Weather;
	@FindBy(xpath="//li[@class='nav__item dropdown']/a")
	WebElement Maps;
	@FindBy(xpath="	//a[text()='Guide']")
	WebElement Guide;
	@FindBy(xpath="//a[text()='API']")
	WebElement API;
	@FindBy(xpath="//a[text()='Price']")
	WebElement Price;
	@FindBy(xpath="//a[text()='Partners']")
	WebElement Partners;
	@FindBy(xpath="//a[text()='Stations']")
	WebElement Stations;
	@FindBy(xpath="//a[text()='Widgets']")
	WebElement Widgets;
	@FindBy(xpath="//a[text()='Blog']")
	WebElement Blog;
	public OpenWealthHome() {	
		super();
		PageFactory.initElements(driver, this);
	}
	public String getTitle() {
		String Titile=driver.getTitle();
		return Titile;
		
	}
	
	public String getWeathertxt() {
		return Weather.getText();
		
	}
	
	public String getMapstxt() {
		return Maps.getText();
		
	}
	public String getGuidetxt() {
		return Guide.getText();
		
	}
	public String getAPItxt() {
		return API.getText();
		
	}
	public String getPricetxt() {
		return Price.getText();
		
	}
	public String getPartnerstxt() {
		return Partners.getText();
		
	}
	public String getStationstxt() {
		return Stations.getText();
		
	}
	
	public String getWiedgtstxt() {
		return Widgets.getText();
		
	}
	
	public String getBlogtxt() {
		return Blog.getText();
		
	}

}
