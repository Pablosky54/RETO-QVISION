package com.www.qvision.task;


import static com.www.qvision.exceptions.OpenTheBrowserException.DRIVER_FAILED_MESSAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.www.qvision.exceptions.OpenTheBrowserException;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.UnsupportedDriverException;

public class OpenTheBrowser implements Task {

    private PageObject page;

    public OpenTheBrowser(PageObject page){
        this.page = page;
    }

   
    @Override
    @Step("{0} opens the browser")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Open.browserOn(page));
        }catch (UnsupportedDriverException e){
            throw new OpenTheBrowserException(DRIVER_FAILED_MESSAGE,e);
        }
    }

    public static OpenTheBrowser on( PageObject page){
        return instrumented(OpenTheBrowser.class,page);
    }
}
