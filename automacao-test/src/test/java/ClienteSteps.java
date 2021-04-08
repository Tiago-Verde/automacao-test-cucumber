import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Ent�o;
import io.cucumber.java.pt.Quando;

public class ClienteSteps {

	@Dado("que eu acesse o sistema")
	public void queEuAcesseSistema() {

		ClientePage clienteTest = new ClientePage();
		clienteTest.acessarSistema();

	}

	@Quando("salvo uma entrada no formul�rio WPCF7")
	public void salvoUmaEntradaNoFormul�rio() {
		ClientePage clienteTest = new ClientePage();
		clienteTest.preencherFormulario();

	}

	@Ent�o("verifico que o registro � apresentado na listagem")
	public void verificoRegistroApresentadoNaListagem() {
		ClientePage clienteTest = new ClientePage();
		clienteTest.verificaListagem();

	}

}