import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;

public class ClientePage extends ClienteElementMap {

	private static WebDriver driver;

	
	@Before
	public void acessarSistema() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://test.juniorsbrissa.com/pagina-de-exemplo/");

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
