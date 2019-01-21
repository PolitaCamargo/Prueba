import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.exceptions.TestCompromisedException;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;

import static org.hamcrest.CoreMatchers.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.support.ui.Select;
public class Comprar {

	//*[@id="fb-basket-products"]/div[3]/section/section/section/div/div/div/div/form/div
	
	WebDriver driver; 
	
	

@Given("^Busco  en google falabella$")
public void busco_en_google_falabella() throws Exception {
  
	
	driver = new ChromeDriver(); 
	     System.out.println("Prueba de compra en linea");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
    
}



@When("^En la pagina busco falabella$")
public void en_la_pagina_busco_falabella() throws Exception {

	 driver.findElement(By.name("q")).sendKeys("Falabella");	
	 driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
	 driver.findElement(By.name("btnK")).click();
	 driver.findElement(By.partialLinkText("Falabella.com - Rebajas Online 2019")).click();
	 driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ; 
	 driver.findElement(By.name("Ntt")).sendKeys("ps4");
	 driver.findElement(By.xpath("//form/a/i")).click();
	 driver.findElement(By.xpath("//div[@id='all-pods']/div/div[3]/div/div[3]/button")).click();
	 driver.findElement(By.id("acc-alert-deny")).click();
	
	
}




@Then("^Al producto le agrego  garantia extendida$")
public void al_producto_le_agrego_garantia_extendida() throws Exception {

	driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div[3]/form/div/div[3]/label")).click();
	 
	 Thread.sleep(5000); 
	 
	 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[3]/div[2]/a")).click();
}


@Then("^Compro el producto$")
public void compro_el_producto() throws Exception {
   
	 Thread.sleep(1000); 
	 driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[2]/div[1]/div[3]/section/section/form/section/div[2]/div/button[2]")).click();
	 
	 driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[3]/div/div/form/div[2]/div[2]/div[2]/button")).click();
	 
}

}
