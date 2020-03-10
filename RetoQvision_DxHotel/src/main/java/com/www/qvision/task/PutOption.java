package com.www.qvision.task;

import static com.www.qvision.userinterface.HomePage.BOTTON_SEARCH;
import static com.www.qvision.userinterface.HomePage.DATE_FINISH;
import static com.www.qvision.userinterface.HomePage.DATE_INIT;
import static com.www.qvision.userinterface.HomePage.DESTINATION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.statematchers.IsEnabledMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PutOption implements Task {

	private String location;
	private String checkIn;
	private String checkOut;

	public PutOption(String location, String checkIn, String checkOut) {

		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		
		actor.attemptsTo(Enter.keyValues(location).into(DESTINATION), Enter.keyValues(checkIn).into(DATE_INIT),
				Enter.keyValues(checkOut).into(DATE_FINISH), Click.on(BOTTON_SEARCH));

	}

	public static PutOption ofParameters(String location, String checkIn, String checkOut) {

		return Tasks.instrumented(PutOption.class, location, checkIn, checkOut);
	}
	
	

}
