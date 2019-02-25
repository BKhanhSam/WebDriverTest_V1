package example;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Feature("Feature-TestNG")
@Epic("Epic-TestNG")
public class NewTest {
	private WebDriver driver;

	@Description("This is new test")
	@Link(name = "TC003", type = "issue", value = "TestNG", url = "https://waverley.atlassian.net/browse/")
	@Story("Story-TestNG")
	@Test(priority = 0, description = "Set up new alure")
	@Flaky
	@Severity(SeverityLevel.NORMAL)
	public void f() {
		driver.get("http://demo.guru99.com/test/guru99home/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Demo Guru99 Page"));

	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"..//TestCombineJenkins/src/main/resources/webdriver/chromedriver_32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
