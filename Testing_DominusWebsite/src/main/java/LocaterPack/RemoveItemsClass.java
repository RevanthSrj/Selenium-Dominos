package LocaterPack;

import org.openqa.selenium.By;

public class RemoveItemsClass extends BeverageClass{

	public By clickRemoveMarghe = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div/div[2]/div/div/div[1]");
	public By clickRemovePepsi = By.xpath("//div[@data-label=\"Beverages\"]//div[@data-label=\"Pepsi 475ml\"]//div[@data-label=\"decrease\"]");
	public By clickRePepsi = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[4]/div/div/div[1]");
	
	
	public void removeMarghe() {
		driver.findElement(clickRemoveMarghe).click();
	}
	
	public void removeItems() {
		
		driver.findElement(clickRePepsi).click();

		int No_of_Remove = 6;
		
		for (int i = 0; i < No_of_Remove; i++) {
			driver.findElement(clickRemovePepsi).click();
			
		}
	}
}
