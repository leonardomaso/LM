import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FapPage {

	
	private WebDriver driver;
	
	public FapPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void nomeEmpresa(String Nome) {
		driver.findElement(By.id("nomeEmpresa")).sendKeys(Nome);
	}
	public void fap(String n) {
		driver.findElement(By.id("fap")).sendKeys(n);
	}
	public void rat(String x) {
		WebElement element = driver.findElement(By.id("rat"));
		Select combo = new Select(element);
		combo.selectByValue(x);
	}
	public void projecao(String p) {
		driver.findElement(By.id("projecao")).sendKeys(p);
	}
	public void clickEstimar() {
		driver.findElement(By.id("estimar")).click();
	}
	


}
