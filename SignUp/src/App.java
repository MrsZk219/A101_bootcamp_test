import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    // public static void main(String[] args) throws InterruptedException {
        // System.out.println("Hello, World!");
        // System.setProperty("webdriver.chrome.driver", "C:/Users/zelih/Downloads/chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://www.a101.com.tr/");
        // WebElement cerezler = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        // cerezler.click();
        // Thread.sleep(1000);

        // WebElement loginButton = driver.findElement(By.xpath("/html/body/section/header/div/div[2]/div[2]/a[3]"));
        // loginButton.click();
        // Thread.sleep(1000);
        
        // WebElement register = driver.findElement(By.xpath("/html/body/section/header/div/div[2]/div[2]/a[3]/div/ul/li[2]/a"));
        // register.click();
        
        
        
        // driver.quit();


        
    // }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zelih/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.a101.com.tr/");
        WebElement cerezler = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        cerezler.click();
        // Thread.sleep(1000);

        WebElement sectionGiyimAndAksesuar = driver.findElement(By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/a"));
        sectionGiyimAndAksesuar.click();
        // Thread.sleep(1000);

        WebElement sectionKadinİcGiyim = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[3]/div/div[1]/div[1]/div[1]/ul/li[6]/a"));
        sectionKadinİcGiyim.click();
        // Thread.sleep(1000);

        WebElement sectionDizAltiCorap = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[1]/ul/li[4]/a"));
        sectionDizAltiCorap.click();
        // Thread.sleep(1000);

        WebElement selectColor = driver.findElement(By.id("attributes_integration_colourSİYAH"));
        selectColor.click();
        // Thread.sleep(1000);
        
        WebElement selectProduct = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3"));
        selectProduct.click();
        // Thread.sleep(1000);
        
        WebElement checkIfBlack = driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/span"));
        // Assert(Siyah, errorMessageFormat, args);
        Assert.assertEquals("SİYAH",driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/span")).getText());
        // checkIfBlack.click();
        // Thread.sleep(1000);
        System.out.println(checkIfBlack.getText());
        // WebElement register = driver.findElement(By.xpath("/html/body/section/header/div/div[2]/div[2]/a[3]/div/ul/li[2]/a"));
        // register.click();
        
        
        
        driver.quit();
    }

}
