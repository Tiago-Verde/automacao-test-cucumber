import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ClienteSteps {

	@Dado("que eu acesse o sistema")
	public void queEuAcesseSistema() {

		ClientePage clienteTest = new ClientePage();
		clienteTest.acessarSistema();

	}

	@Quando("salvo uma entrada no formulário WPCF7")
	public void salvoUmaEntradaNoFormulário() {
		ClientePage clienteTest = new ClientePage();
		clienteTest.preencherFormulario();

	}

	@Então("verifico que o registro é apresentado na listagem")
	public void verificoRegistroApresentadoNaListagem() {
		ClientePage clienteTest = new ClientePage();
		clienteTest.verificaListagem();

	}

}