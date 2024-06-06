package LocaterPack;

import org.openqa.selenium.By;

public class BeverageClass extends CheckingTheCart {

	public By clickBeverage = By.xpath("//div[@data-label=\"Beverages\"]/span");
	public By clickPepsi = By.xpath("//div[@data-label=\"Beverages\"]//div[@data-label=\"Pepsi 475ml\"]//button[@data-label=\"addTocart\"]");
	public By clickAddPepsi = By.xpath("//div[@data-label=\"Beverages\"]//div[@data-label=\"Pepsi 475ml\"]//div[@data-label=\"increase\"]");

	public void Beverage() {
		
		implicitWait();
		driver.findElement(clickBeverage).click();
		driver.findElement(clickPepsi).click();
	}

	public void AddPepsi() {
		
		implicitWait();
		int No_of_Add = 12;
		for (int i = 1; i < No_of_Add; i++) {
			driver.findElement(clickAddPepsi).click();
		}
	}
}
