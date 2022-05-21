package org.stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lenovo\\eclipse-workspace\\Mavenproj\\src\\test\\resources\\FeatureFiles\\reg.feature",
glue="org.stepdefinition",
dryRun=false,
monochrome=true,
snippets=SnippetType.CAMELCASE,
tags= {"@smoke"})


public class Run {

}
