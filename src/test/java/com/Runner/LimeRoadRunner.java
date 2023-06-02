package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\gobiv\\eclipse-workspace\\LimeRoad1\\src\\test\\java\\com\\Feature\\LimeRoad.feature",
glue="com.StepDefinition", 
monochrome = true,
dryRun = false,
strict=true,
tags = ("@RegressionTest"),
plugin = {"pretty", "html:Reports/limeroad.html", "json:Reports/limeroad.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class LimeRoadRunner extends BaseClass {
//	public static WebDriver driver;
//	@BeforeClass
//	public static void basicStep() {
//		driver=browserLaunch("Chrome");
//		implicitWait(10);
//	}		
}
