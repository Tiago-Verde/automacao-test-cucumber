package br.com.automacao.web.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuMap {
	
	@FindBy(xpath = "//header//ul[@id='et-menu']//a[text()='Home']")
	protected WebElement linkHome;
	
	@FindBy(xpath = "//header//ul[@id='et-menu']//a[text()='Página de Exemplo']")
	protected WebElement linkPaginaExemplo;
	
	@FindBy(xpath = "//header//ul[@id='et-menu']//a[text()='Entradas WPCF7']")
	protected WebElement linkEntradasWPCF7;
}
