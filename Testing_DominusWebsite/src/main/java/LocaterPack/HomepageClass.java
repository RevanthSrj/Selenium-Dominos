package LocaterPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class HomepageClass extends BaseClass{

	public By clickOrderButton = By.linkText("ORDER ONLINE NOW");

	public By enterAddress = By.xpath("//input[@placeholder=\"Enter your delivery address\"]");
	public By enterPincode = By.xpath("//input[@placeholder=\"Enter Area / Locality\"]");
	public By clickAllow = By.xpath("//button[@id=\"optInText\"]");
	public By clickLocateme = By.xpath("//button[@data-label=\"Locate_Me\"]");

	public void onlineOrder() {

		driver.findElement(clickOrderButton).click();
	}

	public void deliveryAddress() {
		 
		driver.findElement(enterAddress).click();
		implicitWait();
		driver.findElement(enterPincode).sendKeys("600096");
		driver.findElement(clickAllow).click();
		driver.findElement(clickLocateme).click();
	
	}

}
