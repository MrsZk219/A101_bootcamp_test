import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class goToSection {
    public void gotoSection() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zelih/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.a101.com.tr/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
     
        WebElement cerezler = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        cerezler.click();
        // Thread.sleep(1000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/a")));
        WebElement sectionGiyimAndAksesuar = driver.findElement(By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/a"));
        sectionGiyimAndAksesuar.click();
        // Thread.sleep(1000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/section[4]/div[3]/div[3]/div/div[1]/div[1]/div[1]/ul/li[6]/a")));
        WebElement sectionKadinİcGiyim = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[3]/div/div[1]/div[1]/div[1]/ul/li[6]/a"));
        sectionKadinİcGiyim.click();
        // Thread.sleep(1000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[1]/ul/li[4]/a")));
        WebElement sectionDizAltiCorap = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[1]/ul/li[4]/a"));
        sectionDizAltiCorap.click();
        // Thread.sleep(1000);

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("attributes_integration_colourSİYAH")));
        // WebElement selectColor = driver.findElement(By.id("attributes_integration_colourSİYAH"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[2]/ul[3]/li[2]/label")));
        WebElement selectColor = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[2]/ul[3]/li[2]/label"));
        selectColor.click();
        // Thread.sleep(1000);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/div/a/figure/img")));
        WebElement selectProduct = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/div/a/figure/img"));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3")));
        // WebElement selectProduct = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3"));
        selectProduct.click();
        // Thread.sleep(1000);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/span")));
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
