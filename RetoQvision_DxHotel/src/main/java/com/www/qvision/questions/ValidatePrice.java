package com.www.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePrice implements Question<Boolean> {
	
	private float pagePrice;
	private float totalPrice;
	

	public ValidatePrice(float pagePrice, float totalPrice) {		
		this.pagePrice = pagePrice;
		this.totalPrice = totalPrice;
	}

	@Override
    public Boolean answeredBy(Actor actor) {    	
       
        return pagePrice==totalPrice;
    }

    public static ValidatePrice is(float pagePrice, float totalPrice){
        return new ValidatePrice(pagePrice,totalPrice);
    }
}