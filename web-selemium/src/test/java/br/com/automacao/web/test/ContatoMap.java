package br.com.automacao.web.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContatoMap {

	@FindBy(name = "inputName")
	protected WebElement inputNome;

	@FindBy(name = "inputEmail")
	protected WebElement inputEmail;

	@FindBy(name = "inputSubject")
	protected WebElement inputAssunto;

	@FindBy(name = "inputOption")
	protected WebElement inputOpcao;

	@FindBy(name = "inputMessage")
	protected WebElement inputMensagem;

	@FindBy(name = "inputCaptcha")
	protected WebElement inputCaptcha;

	@FindBy(xpath = "//div[@id='formWPCF7Contato']//form//input[@value='Enviar' and contains(@value,'Env')]")
	protected WebElement buttonEnviar;
	
	@FindBy(xpath = "//div[@id='formWPCF7Contato']//form//div[@role='alert']")
	protected WebElement labelAviso;
	
	@FindBy(xpath = "//div[@id='formWPCF7Contato']//form//span[contains(@class,'quiz')]")
	protected WebElement labelCaptcha;
	
	

}
