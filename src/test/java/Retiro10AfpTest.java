import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Retiro10AfpTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        String ruta = "file:///D:/Estudios/Diplomado DevOps/Módulo 4/ProyectoLab/TrabajoFinalM4SWDGrupo1/src/main/java/com/devops/dxc/devops/web/index.html";
        driver.get(ruta);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testCasoNegocio1A() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("1499999");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020109");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "1020109";
        assertEquals(resultado, driver.findElement(By.id("dxc")).getText());
    }

    @Test
    public void testCasoNegocio1B() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("1499999");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020109");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "0";
        assertEquals(resultado, driver.findElement(By.id("saldo")).getText());
    }

    @Test
    public void testCasoNegocio1C() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("1499999");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020109");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "0";
        assertEquals(resultado, driver.findElement(By.id("impuesto")).getText());
    }

    @Test
    public void testCasoNegocio2A() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("1500000");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020110");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "1020110";
        assertEquals(resultado, driver.findElement(By.id("dxc")).getText());
    }

    @Test
    public void testCasoNegocio2B() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("1500000");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020110");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "0";
        assertEquals(resultado, driver.findElement(By.id("saldo")).getText());
    }

    @Test
    public void testCasoNegocio2C() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("1500000");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020110");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "174531";
        assertEquals(resultado, driver.findElement(By.id("impuesto")).getText());
    }

    @Test
    public void testCasoNegocio3A() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("2500000");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020111");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "1020110";
        assertEquals(resultado, driver.findElement(By.id("dxc")).getText());
    }

    @Test
    public void testCasoNegocio3B() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("2500000");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020111");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "1";
        assertEquals(resultado, driver.findElement(By.id("saldo")).getText());
    }

    @Test
    public void testCasoNegocio3C() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("2500000");
        driver.findElement(By.id("inputAhorro")).sendKeys("1020111");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "364086";
        assertEquals(resultado, driver.findElement(By.id("impuesto")).getText());
    }

    @Test
    public void testCasoNegocio4A() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("3000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("10201100");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "1020110";
        assertEquals(resultado, driver.findElement(By.id("dxc")).getText());
    }

    @Test
    public void testCasoNegocio4B() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("3000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("10201100");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "9180990";
        assertEquals(resultado, driver.findElement(By.id("saldo")).getText());
    }

    @Test
    public void testCasoNegocio4C() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("3000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("10201100");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "612396";
        assertEquals(resultado, driver.findElement(By.id("impuesto")).getText());
    }

    @Test
    public void testCasoNegocio5A() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("4000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("11201100");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "1120110";
        assertEquals(resultado, driver.findElement(By.id("dxc")).getText());
    }

    @Test
    public void testCasoNegocio5B() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("4000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("11201100");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "10080990";
        assertEquals(resultado, driver.findElement(By.id("saldo")).getText());
    }

    @Test
    public void testCasoNegocio5C() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("4000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("11201100");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "980357";
        assertEquals(resultado, driver.findElement(By.id("impuesto")).getText());
    }

    @Test
    public void testCasoNegocio6A() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("5000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("43719000");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "4371900";
        assertEquals(resultado, driver.findElement(By.id("dxc")).getText());
    }

    @Test
    public void testCasoNegocio6B() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("5000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("43719000");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "39347100";
        assertEquals(resultado, driver.findElement(By.id("saldo")).getText());
    }

    @Test
    public void testCasoNegocio6C() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("5000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("43719000");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "1294052";
        assertEquals(resultado, driver.findElement(By.id("impuesto")).getText());
    }

    @Test
    public void testCasoNegocio7A() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("6000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("43719001");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "4371900";
        assertEquals(resultado, driver.findElement(By.id("dxc")).getText());
    }

    @Test
    public void testCasoNegocio7B() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("6000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("43719001");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "39347101";
        assertEquals(resultado, driver.findElement(By.id("saldo")).getText());
    }

    @Test
    public void testCasoNegocio7C() throws InterruptedException {
        driver.findElement(By.id("inputSueldo")).sendKeys("6000000");
        driver.findElement(By.id("inputAhorro")).sendKeys("43719001");
        driver.findElement(By.id("button")).click();

        Thread.sleep(5000);

        String resultado = "1491042";
        assertEquals(resultado, driver.findElement(By.id("impuesto")).getText());
    }
}
