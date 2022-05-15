package eplayers;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLoginEplay {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver\\chromedriver.exe");	
		driver = new ChromeDriver();
	}
	@Test
	public void testeNavegador() {
		driver.get("http://localhost:4200/login");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement inputSenha = driver.findElement(By.id("senha"));
		WebElement botaoLogin = driver.findElement(By.id("bota-login"));
		
		/*inputEmail.sendKeys("caique@email.com");
		inputSenha.sendKeys("paredecomerbesteira");
		botaoLogin.click();*/
		
		String[] listaSenhas = {"senhaum", "outrasenha", "senhaerrada", "paredecomerbesteira"};
		for(int tentativas = 0; tentativas < listaSenhas.length; tentativas++) {
			try {
				inputEmail.clear();
				inputSenha.clear();
				
				inputEmail.sendKeys("caique@email.com");
				inputSenha.sendKeys(listaSenhas[tentativas]);
				botaoLogin.click();
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String[] listaLogins = {"login1", "login2", "login3", "caique@email.com"};
		for(int tentativas = 0; tentativas < listaSenhas.length; tentativas++) {
			try {
				inputEmail.clear();
				inputSenha.clear();
				
				inputEmail.sendKeys(listaLogins[tentativas]);
				inputSenha.sendKeys("caique@email.com");
				botaoLogin.click();
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
