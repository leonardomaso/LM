import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestePesquisa {
	private WebDriver driver;
	private SocPage soc;

		
		@Before
	 	public void inicializa(){
			System.setProperty("webdriver.chrome.driver","C:/Users/maso/driver/chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().setSize(new Dimension(640, 480));
			driver.get("https://ww2.soc.com.br/blog/");
			soc = new SocPage(driver);

		}
		@After
		public void finaliza(){
			driver.quit();		
		}
		
		@Test
		public void realizaPesquisa() {
			soc.pesquisar("FAP");
			soc.clickPesquisar();
			Assert.assertEquals("Search Results for: FAP", driver.findElement(By.className("elementor-heading-title")).getText());
			
	}

}
