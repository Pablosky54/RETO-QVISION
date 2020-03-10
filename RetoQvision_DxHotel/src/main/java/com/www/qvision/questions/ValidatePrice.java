package com.www.qvision.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePrice implements Question<Boolean> {
	
	private float totalPrice;
	

	public ValidatePrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
    public Boolean answeredBy(Actor actor) {    	
       
		float price = Serenity.sessionVariableCalled("pagePrice");
		
        return price==totalPrice;
    }

    public static ValidatePrice is(float totalPrice){
        return new ValidatePrice(totalPrice);
    }
}