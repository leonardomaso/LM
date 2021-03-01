import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TesteFap {
	private WebDriver driver;
	private SocPage soc;
	private FapPage fap;
	
	
	@Before
 	public void inicializa(){
		System.setProperty("webdriver.chrome.driver","C:/Users/maso/driver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().setSize(new Dimension(640, 480));
		driver.get("https://ww2.soc.com.br/blog/");	
		soc = new SocPage(driver);
		fap = new FapPage(driver);
	}
	@After
	public void finaliza(){
		driver.quit();		
	}
	
	@Test
	public void consultaFAP() {
	
		soc.clicarGestaoFap();
		fap.nomeEmpresa("Maso");
		fap.fap("2");
		fap.rat("1");
		fap.projecao("500000");
		fap.clickEstimar();
		}
	


}
