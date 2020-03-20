package com.www.qvision.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/feature/ChoseMenorPrice.feature",
        glue="com.www.qvision.stepdefinitions",
        snippets= SnippetType.CAMELCASE,
        monochrome = true)
public class ChoseMenorPrice {
	
}
