package LocaterPack;

import org.openqa.selenium.By;

public class TotalXpathClass {

	public By clickOrderButton = By.linkText("ORDER ONLINE NOW");
	
	public By enterAddress = By.xpath("//input[@placeholder=\"Enter your delivery address\"]");
	public By enterPincode = By.xpath("//input[@placeholder=\"Enter Area / Locality\"]");
	public By clickAllow = By.xpath("//button[@id=\"optInText\"]");
	public By clickLocateme = By.xpath("//button[@data-label=\"Locate_Me\"]");
	
	public By clickVegPizza = By.xpath("//div[@data-label=\"Veg Pizza\"][1]");
	public By clickMargherita = By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Margherita\"]//button[@data-label=\"addTocart\"]");
	public By clickNoThanks = By.xpath("//button[@class=\"btn--gry\"]");
	
	public By clickPrimavera = By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Primavera Gourmet-Pizza\"]//button[@data-label=\"addTocart\"]");
	
	public By clickPeppyPaneer = By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Peppy Paneer\"]//button[@data-label=\"addTocart\"]");
	
	public By clickAddMarghe = By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Margherita\"]//div[@data-label=\"increase\"]");
	public By clickAddPrimavera =By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Primavera Gourmet-Pizza\"]//div[@data-label=\"increase\"]");
	public By clickAddPeppyPaneer =By.xpath("//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Peppy Paneer\"]//div[@data-label=\"increase\"]");
	public By clickcheckcart = By.xpath("//button[@data-label=\"miniCartCheckout\"]");
	
	public By clickBeverage = By.xpath("//div[@data-label=\"Beverages\"]/span");
	public By clickPepsi = By.xpath("//div[@data-label=\"Beverages\"]//div[@data-label=\"Pepsi 475ml\"]//button[@data-label=\"addTocart\"]");
	public By clickAddPepsi = By.xpath("//div[@data-label=\"Beverages\"]//div[@data-label=\"Pepsi 475ml\"]//div[@data-label=\"increase\"]");
	
	public By clickRemoveMarghe = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div/div[2]/div/div/div[1]");
	public By clickRemovePepsi = By.xpath("//div[@data-label=\"Beverages\"]//div[@data-label=\"Pepsi 475ml\"]//div[@data-label=\"decrease\"]");
	public By clickRePepsi = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[4]/div/div/div[1]");
	
	public By AddAmt1 = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[1]");
	public By AddAmt2 = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[2]");
	public By AddAmt3 = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[3]");
	public By AddAmt4 = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[4]");
	public By TotalAmt = By.xpath("//div[@class='menu-cnt']//div[@class='menu-right']//span[@class='rupee sb-ttl']");
	
	public By SubTotal = By.xpath("//div[@class=\"txt--wrpr\"]//span[@class=\"rupee\"]");
	public By Total = By.xpath("//div[@class=\"txt--wrpr marginTop\"]//span[@class=\"rupee\"]");
	
	
}
