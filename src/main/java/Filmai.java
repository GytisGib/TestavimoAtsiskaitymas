import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filmai {
    private static WebDriver browser;

    public static void main(String[] arg) {
        setupas();
        String pavadinimas = "Makaronas";
        String zanras = "Animacija";
        String aktoriai = "Visi kas netingi";
        String rezisierius = "Jezus";
        String trukme = "20";
        fillPavadinimas(pavadinimas);
        fillZanras(zanras);
        fillAktoriai(aktoriai);
        fillRezisierius(rezisierius);
        fillTrukme(trukme);
        clickSiusti();
        clickSiustiPositive();
        clickSiustiNegative();
        String trintiRedaguoti = "139";
        fillTrintiRedaguoti(trintiRedaguoti);
        clickRedaguotiPositive();
        clickRedaguotiNegative();
        clickTrinti();
        clickRedaguoti();
        //komentaras


    }

    public static void setupas() {
        //Nurodoma, kur yra padetas projekte driver'is reikalingas sujungti koda su narsykle
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver113.exe");
        //Kad galetume pasinaudoti Selenium biblioteka turime susikurti draiverio objekta,
        // per kuri saveikausime su narsykle
        browser = new ChromeDriver();
        //Nurodome narsyklei kuri puslapi uzkrauti
        browser.get("http://kitm.infinityfreeapp.com/filmai.php?i=1");
    }

    public static void fillPavadinimas(String pavadinimas) {
        WebElement pavadinimasField = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[2]"));
        pavadinimasField.sendKeys(pavadinimas);
    }

    public static void fillZanras(String zanras) {
        WebElement zanrasField = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[3]"));
        zanrasField.sendKeys(zanras);
    }

    public static void fillAktoriai(String aktoriai) {
        WebElement aktoriaiField = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[4]"));
        aktoriaiField.sendKeys(aktoriai);
    }

    public static void fillRezisierius(String rezisierius) {
        WebElement rezisieriusField = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[5]"));
        rezisieriusField.sendKeys(rezisierius);
    }

    public static void fillTrukme(String trukme) {
        WebElement trukmeField = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[6]"));
        trukmeField.sendKeys(trukme);


    }

    public static void clickSiusti() {
        WebElement siustiButton = browser.findElement(By.xpath("/html/body/div/form/p[1]/button[1]"));
        JavascriptExecutor siustiButton2 = (JavascriptExecutor) browser;
        siustiButton2.executeScript("arguments[0].click()", siustiButton);
    }
    public static  String clickSiustiPositive(){
        WebElement siustiButton = browser.findElement(By.xpath("/html/body/div[2]"));
        String positivePranesimas = siustiButton.getText();
        System.out.println("Pranesimas :" + positivePranesimas);
        return positivePranesimas;
    }
    public static  String clickSiustiNegative(){
        WebElement siustiButton = browser.findElement(By.xpath("/html/body/div[2]"));
        String negativePranesimas = siustiButton.getText();
        System.out.println("Pranesimas :" + negativePranesimas);
        return negativePranesimas;
    }
    public static  String clickRedaguotiPositive(){
        WebElement redaguotiButton = browser.findElement(By.xpath("/html/body/div[2]"));
        String positivePranesimas = redaguotiButton.getText();
        System.out.println("Pranesimas :" + positivePranesimas);
        return positivePranesimas;
    }
    public static  String clickRedaguotiNegative(){
        WebElement redaguotiButton = browser.findElement(By.xpath("/html/body/div[2]"));
        String negativePranesimas = redaguotiButton.getText();
        System.out.println("Pranesimas :" + negativePranesimas);
        return negativePranesimas;
    }


    public static void fillTrintiRedaguoti(String trintiRedaguoti) {
        WebElement trintiField = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[1]"));
        trintiField.sendKeys(trintiRedaguoti);
    }

    public static void clickTrinti() {
        WebElement trintiButton = browser.findElement(By.xpath("//*[@id=\"form\"]/form/p[1]/button[4]"));
        JavascriptExecutor trintiButton2 = (JavascriptExecutor) browser;
        trintiButton2.executeScript("arguments[0].click()", trintiButton);
    }

    public static void clickRedaguoti() {
        WebElement redaguotiButton = browser.findElement(By.xpath("//*[@id=\"form\"]/form/p[1]/button[2]"));
        JavascriptExecutor redaguotiButton2 = (JavascriptExecutor) browser;
        redaguotiButton2.executeScript("arguments[0].click()", redaguotiButton);
    }
}
