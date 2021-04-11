package br.com.automacao.web.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import br.com.automacao.web.rules.TestRules;

public class ContatoPage extends ContatoMap {

	public ContatoPage() {

		PageFactory.initElements(TestRules.getDriver(), this);

	}

	public void preencherFormulario() {

		if (inputNome.isDisplayed()) {

			do {

				inputNome.sendKeys("ola");

			} while (inputNome.getAttribute("value").length() == 0);

			inputEmail.sendKeys("teste@email.com");
			inputAssunto.sendKeys("foi");

			Select option = new Select(inputOpcao);
			option.selectByVisibleText("Option 7");

			inputMensagem.sendKeys("Socorro");

			String resultadoCapctha = calcularCaptcha();
			inputCaptcha.sendKeys(resultadoCapctha);
			buttonEnviar.click();

			String aviso = labelAviso.getText();
			assertTrue("Erro ao salvar mensagem", aviso.equals("Agradecemos a sua mensagem."));

		}

	}

	private String calcularCaptcha() {

		String captcha = labelCaptcha.getText(); // 3+1, 10+2, 1+1

		String[] splitted = captcha.split("\\+");
		String splitted1 = splitted[0]; // Valor "3"
		String splitted2 = splitted[1]; // Valor "1"

		Integer valor1 = Integer.parseInt(splitted1);
		Integer valor2 = Integer.parseInt(splitted2);

		Integer soma = valor1 + valor2;

		return soma.toString();

	}

}
