package com.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",glue="com\\steps",tags={"@loginpass"},monochrome=true)
public class runner {
	
	}

