package com.www.qvision.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchPage extends PageObject{
	
	public static SearchPage newInstance(){
        return new SearchPage();
    }
	
	
	public static final Target PRICE = Target.the("Price per night")
            .locatedBy("//div//p[@class='rate-number']");
	
	public static final Target BOTTON_PRICE = Target.the("Botton of price")
            .locatedBy("//div[@class='hotels-data']//div[@class='night-button']//div[p[contains(text(), '${0}')]]//following-sibling::div//descendant::span[contains(text(), 'Book it')]");
	
	public static final Target TOTAL_PRICE = Target.the("Price total")
            .locatedBy(("//div//h4[@class='total-price']"));
	

}
