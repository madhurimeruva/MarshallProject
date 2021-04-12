package TJMaxx.MarshallProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.BaseFunction;

public class HomePage extends BaseFunction {
	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void mainHomePage() {

	}
}
