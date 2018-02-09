import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllLevels {
	
	private static WebDriver driver = null;
	private By startButton = By.id("start_button");
	private By levelTitle=By.cssSelector("h1");
	private By input = By.id("input");
	private By nextButton = By.id("next");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayList<String> optionsList = new ArrayList<String>();
		ChromeOptions chromeOptions = new ChromeOptions();
		optionsList.add("--start-maximized");
		optionsList.add("--incognito");
		chromeOptions.addArguments(optionsList);
		driver = new ChromeDriver(chromeOptions);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Close browser
		//driver.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		//Open URL
		driver.get("http://192.168.198.101/");
		WebElement levelTitleElement=driver.findElement(levelTitle);
		
		//Level 1
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement clickButton=wait.until(ExpectedConditions.visibilityOfElementLocated(startButton));
		assertEquals(levelTitleElement.getText(),"Práctica Selenium");
		WebElement startButtonElement=driver.findElement(startButton);
		startButtonElement.click();
		levelTitleElement=driver.findElement(levelTitle);
		assertEquals(levelTitleElement.getText(),"Level 2");
		
		//Level 2

		
		//Level 3
		
		//Level 4
		
		//Level 5
		
		//Level 6
		
		//Level 7
		
		//Level 8
		
		//Level 9
		
		//Level 10
		
		
		
	}

}
