package com.www.qvision.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchPage extends PageObject{
	
	public static SearchPage newInstance(){
        return new SearchPage();
    }
	
	
	public static final Target PRICE = Target.the("Price per night")
            .locatedBy("//div//p[@class='rate-number']");
	
	public static final Target TOTAL_PRICE = Target.the("Price total")
            .locatedBy(("//div//h4[@class='total-price']"));
	

}
