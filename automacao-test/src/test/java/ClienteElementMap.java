import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClienteElementMap {

	@FindBy(name = "inputName")
	protected WebElement nome;

	@FindBy(name = "inputEmail")
	protected WebElement email;

	@FindBy(name = "inputSubject")
	protected WebElement assunto;

	@FindBy(name = "inputOption")
	protected WebElement opcao;

	@FindBy(name = "inputMessage")
	protected WebElement mensagem;

	@FindBy(name = "inputCaptcha")
	protected WebElement captcha;

	@FindBy(xpath = "//*[@id=\"wpcf7-f162-p158-o1\"]/form/div[2]/label/p[12]/input")
	protected WebElement enviar;

}
