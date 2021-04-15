package br.com.automacao.web.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import br.com.automacao.web.rules.TestRules;

public class EntradasPage extends EntradasMap {
	
	public EntradasPage() {

		PageFactory.initElements(TestRules.getDriver(), this);

	}
	
	
	/*
	 * public void consultarEntrada() {
	 * 
	 * tableResultado.findElement(By.linkText("teste@email.com")); }
	 */

}
