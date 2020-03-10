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
	
	public static final Target LOCATION = Target.the("Open a search box of destination in home page")
            .locatedBy(("//div[@class='dx-dropdowneditor-input-wrapper dx-selectbox-container']//input[@name='location']//following-sibling::div[@class='dx-texteditor-container']//input"));
	
	public static final Target DESTINATION = Target.the("Search box of destination in home page")
            .locatedBy(("//div[@class='dx-scrollview-content']//descendant::div[@role='option']//child::div[contains(text(),'{0}')]"));
	
	public static final Target DATE_INIT = Target.the("Box of date init in home page")
            .locatedBy(("//div[@class='dx-dropdowneditor-input-wrapper']//input[@name='checkIn']//following-sibling::div[@class='dx-texteditor-container']//input"));
	
	public static final Target DATE_FINISH = Target.the("Box of date finish in home page")
            .locatedBy(("//div[@class='dx-dropdowneditor-input-wrapper']//input[@name='checkOut']//following-sibling::div[@class='dx-texteditor-container']//input"));
	
	public static final Target ROOMS = Target.the("Box chose rooms in home page")
            .locatedBy(("//div[@class='dx-dropdowneditor-input-wrapper dx-selectbox-container']//input[@name='rooms']//following-sibling::div[@class='dx-texteditor-container']//input"));
	
	public static final Target PEOPLE = Target.the("Box chose people in home page")
            .locatedBy(("//div[@class='dx-dropdowneditor-input-wrapper dx-selectbox-container']//input[@name='adults']//following-sibling::div[@class='dx-texteditor-container']//input"));
	
	public static final Target BOTTON_SEARCH = Target.the("Botton start of search in home page")
            .located(By.xpath("//div//span[contains(text(),'SEARCH')]"));
	
	
	

}
