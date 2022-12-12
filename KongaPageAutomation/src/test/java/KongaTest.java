import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KongaTest {

private WebDriver driver;
    private long millis;

    public void start() throws InterruptedException {
    //locate where the chromedriver is
    String setProperty = System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
    //1. Open your chrome browser
   driver = new ChromeDriver();
   //2. Input your Konga page URL (https://www.konga.com/)
   driver.get("https://konga.com");
   Thread.sleep(10000);
   driver.manage().window().maximize();
   //4. Click on the signup button to open the signup page
   driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]")).click();
   //input your first name on the first name field
   driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Oluwatobi");
   //input your email in the email field
   driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[3]")).sendKeys("ale@mailinator.com");
   //input the last name in the name field
   driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[2]")).sendKeys("ale");
   //input the phone number in the phone number field
   driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[4]")).sendKeys("08145658405");
   //input the password in the password field
   driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[5]")).sendKeys("ale123");
   driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[6]")).click();
   Thread.sleep(millis 10000);






