package LocaterPack;

import org.openqa.selenium.By;

public class VegPizzaClass extends HomepageClass{
	
	public By clickVegPizza = By.xpath("//div[@data-label=\"Veg Pizza\"][1]");
	public By clickMargherita = By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Margherita\"]//button[@data-label=\"addTocart\"]");
	public By clickNoThanks = By.xpath("//button[@class=\"btn--gry\"]");
	
	public By clickPrimavera = By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Primavera Gourmet-Pizza\"]//button[@data-label=\"addTocart\"]");
	
	public By clickPeppyPaneer = By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Peppy Paneer\"]//button[@data-label=\"addTocart\"]");
	
	public By clickAddMarghe = By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Margherita\"]//div[@data-label=\"increase\"]");
	public By clickAddPrimavera =By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Primavera Gourmet-Pizza\"]//div[@data-label=\"increase\"]");
	public By clickAddPeppyPaneer =By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Peppy Paneer\"]//div[@data-label=\"increase\"]");
	
	
	
	public void vegPizzaAndPeppyPanner() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(clickVegPizza).click();
		implicitWait();
		driver.findElement(clickPeppyPaneer).click();
		
		try {
			driver.findElement(clickNoThanks).click();
		} catch (Exception e) {
			System.out.println("cheese popup is not avaiable");
		}
	}
	
	public void Margherita() {
		
		implicitWait();
		driver.findElement(clickMargherita).click();
	}
	
	public void Primavera() {
		
		implicitWait();
		driver.findElement(clickPrimavera).click();
	}
	
	public void AddOnePizza() {
		implicitWait();
		driver.findElement(clickAddMarghe).click();
		driver.findElement(clickAddPeppyPaneer).click();
		driver.findElement(clickAddPrimavera).click();
	}

}
