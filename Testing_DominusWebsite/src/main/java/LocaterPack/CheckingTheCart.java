package LocaterPack;


import org.openqa.selenium.By;

import java.io.IOException;

import org.junit.Assert;


public class CheckingTheCart extends VegPizzaClass{
	
	public By clickcheckcart = By.xpath("//button[@data-label=\"miniCartCheckout\"]");
	
	public By AddAmt1 = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[1]");
	public By AddAmt2 = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[2]");
	public By AddAmt3 = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[3]");
	public By AddAmt4 = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[4]");
	public By TotalAmt = By.xpath("//div[@class='menu-cnt']//div[@class='menu-right']//span[@class='rupee sb-ttl']");
	
	public By SubTotal = By.xpath("//div[@class=\"txt--wrpr\"]//span[@class=\"rupee\"]");
	public By Total = By.xpath("//div[@class=\"txt--wrpr marginTop\"]//span[@class=\"rupee\"]");
	
	
	public void clickCheckout() {
		implicitWait();
		driver.findElement(clickcheckcart).click();
	}
	
	public void CartCheckout() {
		implicitWait();
		String Amt1 = driver.findElement(AddAmt1).getText();
		String Amt2 = driver.findElement(AddAmt2).getText();
		String Amt3 = driver.findElement(AddAmt3).getText();
		String total_amt = driver.findElement(TotalAmt).getText();
		Float amount1 = Float.parseFloat(Amt1);
		System.out.println(amount1);
		Float amount2 = Float.parseFloat(Amt2);
		System.out.println(amount2);
		Float amount3 = Float.parseFloat(Amt3);
		System.out.println(amount3);
		Float TotalAmt = Float.parseFloat(total_amt);
		Float total = amount1 + amount2 + amount3;
		System.out.println(TotalAmt + ", " + total);
		Assert.assertEquals(TotalAmt, total);

	}
	
	public void cartCheckout2() {
		implicitWait();
		String Amt1 = driver.findElement(AddAmt1).getText();
		String Amt2 = driver.findElement(AddAmt2).getText();
		String Amt3 = driver.findElement(AddAmt3).getText();
		String Amt4 = driver.findElement(AddAmt4).getText();
		String total_amt = driver.findElement(TotalAmt).getText();
		Float amount1 = Float.parseFloat(Amt1);
		System.out.println(amount1);
		Float amount2 = Float.parseFloat(Amt2);
		System.out.println(amount2);
		Float amount3 = Float.parseFloat(Amt3);
		System.out.println(amount3);
		Float amount4 = Float.parseFloat(Amt4);
		System.out.println(amount4);

		Float TotalAmt = Float.parseFloat(total_amt);
		Float total = amount1 + amount2 + amount3 + amount4;
		System.out.println(TotalAmt + ", " + total);
		Assert.assertEquals(TotalAmt, total);

	}
	
	public void cartCheckout3() {
		implicitWait();
		String Amt1 = driver.findElement(AddAmt1).getText();
		String Amt2 = driver.findElement(AddAmt2).getText();
		String Amt3 = driver.findElement(AddAmt3).getText();
		String Amt4 = driver.findElement(AddAmt4).getText();
		String total_amt = driver.findElement(TotalAmt).getText();
		Float amount1 = Float.parseFloat(Amt1);
		System.out.println(amount1);
		Float amount2 = Float.parseFloat(Amt2);
		System.out.println(amount2);
		Float amount3 = Float.parseFloat(Amt3);
		System.out.println(amount3);
		Float amount4 = Float.parseFloat(Amt4);
		System.out.println(amount4);

		Float TotalAmt = Float.parseFloat(total_amt);
		Float total = amount1 + amount2 + amount3 + amount4;
		System.out.println(TotalAmt + ", " + total);
		Assert.assertNotEquals(TotalAmt, total);

	}
	
	public void screenshot() throws IOException, InterruptedException {
		Thread.sleep(1000);
		screenshot(driver, "pic1");
		
	}
	
	
	public void finalCheckout() {
		implicitWait();

		String Sub_Total = driver.findElement(SubTotal).getText();
		String FinalTotal = driver.findElement(Total).getText();

		System.out.println(Sub_Total + ", " + FinalTotal);
		Assert.assertNotEquals(Sub_Total, FinalTotal);

	}
	
	
	
	
	
	
	
}