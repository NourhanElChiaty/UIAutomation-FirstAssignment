import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class firstAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* System.setProperty("webdriver.edge.driver", "C:\\Users\\v18nhamid7\\eclipse-workspace\\UIAutomation\\Drivers\\msedgedriver.exe");
	 WebDriver browser = new EdgeDriver();
	 browser.navigate().to("https://www.facebook.com/");
	*/
	 
	 String edgePath =System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
     System.setProperty("webdriver.edge.driver", edgePath);
     WebDriver browser = new EdgeDriver();  // object of edge driver
	 browser.navigate().to("https://www.google.com/");
	 
	 browser.quit();
	}

}
