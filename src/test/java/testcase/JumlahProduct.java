package testcase;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.DriverSetUp;
import com.utils.DriverWait;
import com.utils.ScreenShot;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class JumlahProduct {
	
		WebDriver driver = DriverSetUp.setUpDriver();
		WebDriverWait wait = DriverWait.wait(driver);
		ExtentReports report = new ExtentReports("src/test/resources/hasil.html");
		ExtentTest test;
	
	@AfterStep
	public void afterStep(Scenario scenario) throws IOException {
		String screenshootPath = ScreenShot.ambilGambar(driver,scenario.getName());
		if (scenario.isFailed()) {
			test.log(LogStatus.FAIL, "\nscreenshoot :"+
					test.addScreenCapture(screenshootPath));
		} else {
			test.log(LogStatus.PASS, "\nscreenshoot :"+
					test.addScreenCapture(screenshootPath));
		}
		
	}
	
	@After
	public void closeDriver() {
		report.endTest(test);
		report.flush();
		driver.close();
	}
	@Before
	public void before() {
		test = report.startTest("Product Stock");
	}
	

	@Given("User Accses link {string}")
	public void user_Accses_link(String string) {
		driver.get("https://www.tokopedia.com");
		test.log(LogStatus.PASS, "User Accsesed Link");
	}
	@When("User in Tokopedia Homepage")
	public void user_in_Tokopedia_Homepage() {
	    String real = driver.getTitle();
	    Assert.assertTrue(real.equals("Situs Jual Beli Online Terlengkap, Mudah & Aman | Tokopedia"));
	    test.log(LogStatus.PASS, "User in Tokopedia Homepage");
	}

	@When("User Fill Search Box with {string}")
	public void user_Fill_Search_Box_with(String string) {
		WebElement searchBox = driver.findElement(By.xpath("//input[@data-unify='Search']"));
		searchBox.sendKeys(string);
		test.log(LogStatus.PASS, "User Fill The Name of Product");
	}

	@When("User Press Enter Key on Keyboard")
	public void user_Press_Enter_Key_on_Keyboard() {
		WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Kirimkan']"));
		searchButton.sendKeys(Keys.RETURN);
		test.log(LogStatus.PASS, "User Press Enter on Keyboard");
	}

	@When("User Scroll Down the Browser")
	public void user_Scroll_Down_the_Browser() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		for(int i = 0; i < 80;i++) {
		j.executeScript("window.scrollBy(0,"+i+")");
		}
		test.log(LogStatus.PASS, "User Scrolled Browser");
	}

	@When("User Click a Product")
	public void user_Click_a_Product() {
		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[60]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[@class=\"prd_link-product-name css-svipq6\"]")));
		String namaProduct = product.getText();
		System.out.println(namaProduct);
		product.click();
		test.log(LogStatus.PASS, "User Click a Product");
	}

	@Then("User Get Information about Product Stock")
	public void user_Get_Information_of_Product_Stock() {//*[@data-testid="stock-label"]
		WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid=\"stock-label\"]")));
		String jumlahStock = elem.getText();
		System.out.println(jumlahStock);
//		WebElement elem2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pdpFloatingActions\"]/div[3]/div[1]/button[1]/span")));
//		String real = elem2.getText();
		Assert.assertEquals(jumlahStock, "Stok: 13");
		test.log(LogStatus.PASS, "User Get Information about Product Stock");
	}

}
