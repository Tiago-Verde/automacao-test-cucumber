package br.com.automacao.web.test;

import org.openqa.selenium.support.PageFactory;

import br.com.automacao.web.rules.TestRules;

public class MenuPage extends MenuMap {

	public MenuPage() {

		PageFactory.initElements(TestRules.getDriver(), this);

	}

	public void acessarPaginaDeFormularios() {

		linkPaginaExemplo.click();

	}

	public void acessarPaginaHome() {
		linkHome.click();
	}

	public void acessarPaginaEntradasWPCF7() {

		linkEntradasWPCF7.click();

	}

}
