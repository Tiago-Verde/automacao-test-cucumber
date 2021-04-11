package br.com.automacao.web.rules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;

public class TestRules {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@Before
	public void setUp() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--window-size=1920,1080");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

		System.setProperty("webdriver.chrome.driver", "C:/Tools/Drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.manage().window().maximize();
		driver.navigate().to("http://test.juniorsbrissa.com/");

	}

}
