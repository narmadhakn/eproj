package org.pom;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPojo extends HelperClass {
	
	public RegPojo() {
	PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath=("(//span[text()=\"Accessories\"])[3]"))
	 private WebElement fname;

	@FindBy(xpath=("//h2[text()='Bath towels']"))
	private WebElement link;
	
	

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLink() {
		return link;
	}

	
	
}
