package com.www.qvision.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://js.devexpress.com/Demos/DXHotels/#home")
public class HomePage extends PageObject{
	
	public static HomePage newInstance(){
        return new HomePage();
    }
	
	public static final Target DESTINATION = Target.the("Search box of destination in home page")
            .located(By.xpath("//*[@id=\"dx_dx-a559d417-f8cc-bace-cca2-d6077d855f9b_location\"]"));
	
	public static final Target DATE_INIT = Target.the("Box of date init in home page")
            .located(By.id("dx_dx-a559d417-f8cc-bace-cca2-d6077d855f9b_checkIn"));
	
	public static final Target DATE_FINISH = Target.the("Box of date finish in home page")
            .located(By.id("dx_dx-a559d417-f8cc-bace-cca2-d6077d855f9b_checkOut"));
	
	public static final Target ROOMS = Target.the("Box chose rooms in home page")
            .located(By.id("dx_dx-a559d417-f8cc-bace-cca2-d6077d855f9b_rooms"));
	
	public static final Target PEOPLE = Target.the("Box chose people in home page")
            .located(By.id("dx_dx-a559d417-f8cc-bace-cca2-d6077d855f9b_adults"));
	
	public static final Target BOTTON_SEARCH = Target.the("Botton start of search in home page")
            .located(By.xpath("//div//span[contains(text(),'SEARCH')]"));
	
	
	

}
