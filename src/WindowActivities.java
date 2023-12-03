import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//Abre la URL en modo maximizado.
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");//navega desde la pagina anterior google, hacia rahulshettyacademy
		driver.navigate().back();//navega hacia atras, vuelve a google, es como la flecha superior izquierda.
		driver.navigate().forward();//navega hacia adelante nuevamente, desde la anterior google, hacia rahulshettyacademy..

	}

}
