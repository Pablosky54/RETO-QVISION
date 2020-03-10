package com.www.qvision.task;

import java.util.Collections;
import java.util.List;

import com.www.qvision.userinterface.SearchPage;
import com.www.qvision.util.Remplace;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class ComparePrice implements Task{

	@Override
	@Step("{0} chose a most cheap option")
	public <T extends Actor> void performAs(T actor) {
		
		List<Integer> prices = Remplace.change(SearchPage.PRICE, actor);
		Collections.sort(prices);
		
		
		
	}
	
	
	public static ComparePrice with() {
		
		return Tasks.instrumented(ComparePrice.class);
	}
	
	
	private int operation(int price, int days) {
		
		return price*days;
	}

}
