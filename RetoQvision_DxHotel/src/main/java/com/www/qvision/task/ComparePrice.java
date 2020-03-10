package com.www.qvision.task;

import static com.www.qvision.userinterface.SearchPage.BOTTON_PRICE;

import java.util.Collections;
import java.util.List;

import com.www.qvision.userinterface.SearchPage;
import com.www.qvision.util.ConvertDate;
import com.www.qvision.util.Replace;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ComparePrice implements Task {

	private String checkIn;
	private String checkOut;
	

	
	public ComparePrice() {
			}

	public ComparePrice newIntance(){		
		ComparePrice compaire = new ComparePrice();
		return compaire;
		
	}

	public ComparePrice(String checkIn, String checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	@Step("{0} chose a most cheap option")
	public <T extends Actor> void performAs(T actor) {

		List<Integer> prices = Replace.change(SearchPage.PRICE, actor);
		Collections.sort(prices);		
		float pagePrice = operation(prices.get(0), ConvertDate.returnTotalDays(checkIn, checkOut));
		actor.attemptsTo(Click.on(BOTTON_PRICE.of(prices.get(0).toString())));
		
		Serenity.setSessionVariable("pagePrice").to(pagePrice);

	}

	
	public static ComparePrice with(String checkIn, String checkOut) {

		return Tasks.instrumented(ComparePrice.class, checkIn, checkOut);
	}

	private float operation(float price, float days) {

		return price * days;
	}

}
