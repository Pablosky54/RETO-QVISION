package com.www.qvision.task;

import java.util.Collections;
import java.util.List;

import com.www.qvision.userinterface.SearchPage;
import com.www.qvision.util.ConvertDate;
import com.www.qvision.util.Remplace;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class ComparePrice implements Task {

	private String checkIn;
	private String checkOut;
	public static float pagePrice;

	
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

		List<Integer> prices = Remplace.change(SearchPage.PRICE, actor);
		Collections.sort(prices);
		pagePrice = operation(prices.get(0), ConvertDate.returnTotalDays(checkIn, checkOut));

	}

	
	public static ComparePrice with(String checkIn, String checkOut) {

		return Tasks.instrumented(ComparePrice.class, checkIn, checkOut);
	}

	private float operation(int price, float days) {

		return price * days;
	}

}
