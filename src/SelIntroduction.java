import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome -ChromeDriver exten -> Methods close get
		//Firefox -FirefoxDriver exten -> Methods close get
		//Safari -SafariDriver exten -> Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		
		//Chrome 
		//SeleniumManager (Beta phase), para esta version ya no es necesario setear la property, se podria eliminar la siguiente linea.
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		
		//Firefox 
		//System.setProperty("webdriver.gecko.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver(); 
		
		
		//Microsoft Edge
		//System.setProperty("webdriver.edge.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver(); 
				
				
		driver.get("https:\\rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
