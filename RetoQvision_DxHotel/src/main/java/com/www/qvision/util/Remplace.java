package com.www.qvision.util;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class Remplace {
	
	
	public static Remplace newIntance() {
		
		Remplace remplace = new Remplace();
		return remplace;
	}
	
	
	
	public Remplace() {}

	public static List<Integer> change(Target target, Actor actor) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i <= target.resolveAllFor(actor).size();i++) {
			
			list.add(Integer.parseInt(target.resolveAllFor(actor).get(i).getText().replaceAll("[$ ]", "")));
		}
		
		return list;
	}

}
