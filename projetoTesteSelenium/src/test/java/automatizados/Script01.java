package automatizados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Script usado para testar os dados basicos do formulario
 * Index.html
 *
 * @author Juniel
 */
public class Script01 {

    // Declarando um objeto do tipo WebDriver, utilizado pelo Selenium WebDriver.
    private static WebDriver driver;

    public Script01() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    // Método que inicia tudo que for necessário para o teste 
    // Cria uma instância do navegador e abre a página inicial do Projeto.
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/projetoTesteSelenium/");
    }

    // Método que finaliza o teste, fechando a instância do WebDriver. 
    @After
    public void tearDown() {
        driver.quit();
    }

    
     @Test
     public void hello() {}
}
