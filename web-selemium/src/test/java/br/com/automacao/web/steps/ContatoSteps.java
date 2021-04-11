package br.com.automacao.web.steps;

import br.com.automacao.web.test.ContatoPage;
import br.com.automacao.web.test.MenuPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ContatoSteps {

	@Dado("que eu acesse o sistema")
	public void queEuAcesseSistema() {

		MenuPage menuPage = new MenuPage();
		menuPage.acessarPaginaDeFormularios();

	}

	@Quando("salvo uma entrada no formulário WPCF7")
	public void salvoUmaEntradaFormularioWPCF7() {

		ContatoPage contatoPage = new ContatoPage();
		contatoPage.preencherFormulario();

	}

	@Então("verifico que o registro é apresentado na listagem")
	public void verificoQueRegistroApresentadoNaListagem() {

		MenuPage menuPage = new MenuPage();
		menuPage.acessarPaginaEntradasWPCF7();

	}

}
