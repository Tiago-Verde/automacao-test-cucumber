package br.com.automacao.web.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntradasMap {
	
	@FindBy(xpath = "//*[@id=\"et-boc\"]//tbody")
	protected WebElement tableResultado;
	

}
