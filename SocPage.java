import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SocPage {
	
	
	private WebDriver driver;

	public SocPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void clicarGestaoFap() {
		driver.findElement(By.linkText("Soluções")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement fap = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Gestão FAP")));
		fap.click();
	}
	
	public void pesquisar(String texto) {

		driver.findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input")).sendKeys(texto);
			
	}
	
	public void clickPesquisar() {
		driver.findElement(By.tagName("button")).click();
		
	}
	
	


}
