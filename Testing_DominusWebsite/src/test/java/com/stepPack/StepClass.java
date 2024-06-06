package com.stepPack;

import BasePack.BaseClass;
import java.io.IOException;

import LocaterPack.BeverageClass;
import LocaterPack.CheckingTheCart;
import LocaterPack.HomepageClass;
import LocaterPack.RemoveItemsClass;
import LocaterPack.VegPizzaClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepClass extends BaseClass {

	HomepageClass home = new HomepageClass();
	VegPizzaClass pizza = new VegPizzaClass();
	CheckingTheCart cart = new CheckingTheCart();
	BeverageClass pepsi = new BeverageClass();
	RemoveItemsClass remove = new RemoveItemsClass();

	@Given("User enter into the URl")
	public void user_enter_into_the_u_rl() {
		geturl("https://www.dominos.co.in/");

	}

	@Then("User click the online order")
	public void user_click_the_online_order() {

		home.onlineOrder();

	}

	@Then("User select the delivery loaction")
	public void user_select_the_delivery_loaction() {

		home.deliveryAddress();
	}

	@Then("User add the peppy panner")
	public void user_add_the_peppy_panner() throws InterruptedException {

		pizza.vegPizzaAndPeppyPanner();

	}

	@Then("User add the Margherita")
	public void user_add_the_margherita() {

		pizza.Margherita();

	}

	@Then("user add the Primavera")
	public void user_add_the_primavera() {

		pizza.Primavera();
	}

	@Then("User add the peppy panner,Margherita,Primavera the product of two Qty in the cart")
	public void user_add_the_peppy_panner_margherita_primavera_the_product_of_two_qty_in_the_cart() {

		pizza.AddOnePizza();
	}

	@Then("User checking the cart total")
	public void user_checking_the_cart_total() throws IOException, InterruptedException {

		cart.CartCheckout();

		cart.clickCheckout();

		cart.screenshot();

		NavigateBack();

	}

	@Then("User add the pepsi 475ml and the product of twele Qty in the cart")
	public void user_add_the_pepsi_475ml_and_the_product_of_twele_qty_in_the_cart() throws InterruptedException, IOException {

		pepsi.Beverage();
		
		pepsi.AddPepsi();

		cart.cartCheckout2();

		cart.clickCheckout();

		Thread.sleep(1000);

		screenshot(driver, "pic2");

		NavigateBack();

	}

	@Then("User removing the Margherita of one Qty")
	public void user_removing_the_margherita_of_one_qty() {

		remove.removeMarghe();

	}

	@Then("User removing the pepsi 475ml of six Qty")
	public void user_removing_the_pepsi_475ml_of_six_qty() throws IOException, InterruptedException {

		remove.removeItems();

		cart.cartCheckout3();

		Thread.sleep(1000);

		screenshot(driver, "Pic3");

	}

	@Then("User checking the cart total and click the checkout")
	public void user_checking_the_cart_total_and_click_the_checkout() throws InterruptedException, IOException{

		cart.clickCheckout();

		Thread.sleep(1000);

		screenshot(driver, "pic4");

		System.out.println("Its Always correct......");
	}

}
