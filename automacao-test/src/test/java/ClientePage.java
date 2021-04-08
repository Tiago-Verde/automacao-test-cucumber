import org.openqa.selenium.support.ui.Select;

public class ClientePage extends ClienteElementMap {

	public void acessarSistema() {

	}

	public void preencherFormulario() {

		nome.sendKeys("ola");
		email.sendKeys("teste@email.com");
		assunto.sendKeys("foi");
		Select option = new Select(opcao);
		option.selectByVisibleText("Option 7");
		mensagem.sendKeys("Socorro");
		captcha.sendKeys("3");
		enviar.click();

	}

	public void verificaListagem() {

	}

}
