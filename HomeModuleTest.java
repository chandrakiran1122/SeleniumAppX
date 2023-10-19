package Base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;

public class HomeModuleTest extends Init{
	
	WebDriver driver;
	private static Logger log =LogManager.getLogger(HomeModuleTest.class);
	@BeforeTest(alwaysRun=true)
	public void browser() throws IOException
	{
		driver = browserIntilization();
		driver.get(prop.getProperty("url"));
		log.info("browser is open");
	}
	@Test
	public void amzModules() throws InterruptedException
	{
		log.info("Strating the E-commerce scenarion test.");  
		HomePage hm = new HomePage(driver);
		HomePage hp = new HomePage(driver);
		
		hm.amazonMiniTv().click();
		hm.webSeriesBtn().click();
		hm.moviesBtn().click();
		Thread.sleep(900);
		hm.comedyBtn().click();
		hp.home();
		hm.sellBtn().click();
		hp.home();
		hm.tdealsBtn().click();
		hp.home();
		hm.bsellBtn().click();
		hm.newreleaseBtn().click();
		hm.movshkBtn().click();
		hm.wishedforBtn().click();
		hm.mgiftBtn().click();
		hp.home();
		
		
	}

}
