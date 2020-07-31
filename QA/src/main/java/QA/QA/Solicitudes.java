package QA.QA;

import java.awt.AWTException;
import java.io.File;

import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Solicitudes {
	
	
	public Solicitudes () {}
	

		
	
		public void Crear_registro (ChromeDriver controlador, String producto) throws Exception {
			
			Thread.sleep(2000);
			String mail = JOptionPane.showInputDialog(null,"Ingresa el mail a registrar");
			System.out.println(mail);
			Thread.sleep(2000);
			
			System.out.println("-----------------------------------------");
			System.out.println("-------------Crear_registro--------------");
			System.out.println("-----------------------------------------");
			System.out.println("--Conectando al nodo de pruebas Upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\Create_regist\\Conexion_exitosa.png"));
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("loginbuttonLinkRegister")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------------");
			System.out.println("------------Registro de formulario-------------");
			System.out.println("-----------------------------------------------");
			controlador.findElement(By.id("firstNameMaterial")).sendKeys("EMMANUEL");
			////Thread.sleep(3000);
			controlador.findElement(By.id("middleNameMaterial")).sendKeys("MUNGUIA");
			////Thread.sleep(3000);
			controlador.findElement(By.id("lastNameMaterial")).sendKeys("JIMENEZ");
			////Thread.sleep(3000);
			controlador.findElement(By.id("phoneMaterial")).sendKeys("5511235813");
			////Thread.sleep(3000);
			controlador.findElement(By.id("emailMaterial")).sendKeys(mail);
			////Thread.sleep(3000);
			controlador.findElement(By.id("passwordMaterial")).sendKeys("Alemania35*");
			////Thread.sleep(3000);
			controlador.findElement(By.xpath("//*[@id='extendedRegisterForm']/div[7]/label/span")).click();
			////////Thread.sleep(3000);
			controlador.findElement(By.xpath("//*[@id='extendedRegisterForm']/div[8]/label/span[2]")).click();
	        ////////Thread.sleep(3000);
			controlador.findElement(By.id("registerButtonMaterial")).click();
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\Create_regist\\Registro_exitoso.png"));
			Thread.sleep(5000);
			System.out.println("---------------------------------------------------");
			System.out.println("------------Creacion de cuenta exitosa-------------");
			System.out.println("---------------------------------------------------");
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div/div[2]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("gris")).click();
			Thread.sleep(3000);
			
	}



		public void Login(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			
			System.out.println("-----------------------------------------");
			System.out.println("----------------Login--------------------");
			System.out.println("-----------------------------------------");
			System.out.println("--Conectando al nodo de pruebas Upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\Login\\Conexion_exitosa.png"));
			Thread.sleep(3000);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(2000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(2000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(2000);
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(2000);
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\Create_regist\\Login_exitoso.png"));
			Thread.sleep(5000);
			System.out.println("----------------------------------------");
			System.out.println("-------------Login exitoso--------------");
			System.out.println("----------------------------------------");
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div/div[2]/a/div[2]")).click();
			Thread.sleep(2000);
			controlador.findElement(By.id("gris")).click();
			Thread.sleep(2000);
			
		}
		
		public void Eliminar_carrito(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			
			System.out.println("-----------------------------------------");
			System.out.println("----------------Login--------------------");
			System.out.println("-----------------------------------------");
			System.out.println("--Conectando al nodo de pruebas Upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\Login\\Conexion_exitosa.png"));
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(2000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(2000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(2000);
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(2000);
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\Create_regist\\Login_exitoso.png"));
			Thread.sleep(5000);
			System.out.println("----------------------------------------");
			System.out.println("-------------Login exitoso--------------");
			System.out.println("----------------------------------------");
			controlador.findElement(By.id("txtCart")).click();Thread.sleep(2000);
			controlador.findElement(By.xpath("//*[@id='prueba-ajax']/div[2]/div/div[2]/a/span[2]")).click();
			Thread.sleep(2000);
			
			
			
		}
		
		


		public void Carrito_Delivery_PickUp_A1(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			System.out.println("-----------------------------------------");
			System.out.println("-------Carrito_Delivery_PickUp_A1--------");
			System.out.println("-----------------------------------------");
			System.out.println("--Conectando al nodo de pruebas Upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");	
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			System.out.println("-----------------------------------------");

			Thread.sleep(3000);
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\Del-to-PU\\Conexion_exitosa.png"));
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(3000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(3000);
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\Del-to-PU\\Login.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Login exitoso----------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Busqueda de Producto---------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("js-site-search-input")).sendKeys("46178");
			Thread.sleep(3000);
			File scrFile2 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp\\Del-to-PU\\Busqueda_de_Producto.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div/a[1]/div")).click();
			Thread.sleep(8000);
			controlador.findElement(By.id("addToCartButton")).click();
			Thread.sleep(3000);
			File scrFile3 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp\\Del-to-PU\\Añadir_carrito.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito-----");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("txtCart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("product_91636")).click();
			Thread.sleep(3000);
			File scrFile4 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp\\Del-to-PU\\pick_up.png"));
			System.out.println("-----------------------------------------");
			System.out.println("----------------Pick UP------------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.xpath("//*[@id='pickupModal_product_46178']/div/div[2]/div/div[2]/ul/div/li[2]/label/span[1]/div/div")).click();
			Thread.sleep(3000);
			File scrFile5 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile5, new File("c:\\tmp\\Del-to-PU\\cambio_tienda_exitoso.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------Cambio de tienda Exitoso-----------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.xpath("//*[@id='add_to_cart_storepickup_form']/div[2]/button")).click();
			Thread.sleep(3000);
			File scrFile6 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("c:\\tmp\\Del-to-PU\\realizando_compra.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Realizando compra------------");
			System.out.println("-----------------------------------------");
			try {
				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[1]/button")).click();
				System.out.println("------------1-------------");}
				catch (Exception a) {
					try {
						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[2]/button")).click();
						System.out.println("------------2------------");}
						catch (Exception b) {
							try {
								controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[3]/button")).click();
								System.out.println("------------3------------");}
								catch (Exception c) {
									try {
										controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[4]/button")).click();
										System.out.println("------------4------------");}
										catch (Exception d) {
											try {
												controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[5]/button")).click();
												System.out.println("------------5------------");}
												catch (Exception e) {
													try {
														controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[6]/button")).click();
														System.out.println("------------6------------");}
														catch (Exception f) {
															try {
																controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[7]/button")).click();
																System.out.println("------------7------------");}
																catch (Exception g) {
																	try {
																		controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[8]/button")).click();
																		System.out.println("------------8------------");}
																		catch (Exception h) {
																			try {
																				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[9]/button")).click();
																				System.out.println("------------9------------");}
																				catch (Exception i) {
																						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[10]/button")).click();
																						System.out.println("------------10-----------");}
																					
																				}
																}}}}}}}
			Thread.sleep(3000);
			File scrFile7 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile7, new File("c:\\tmp\\Del-to-PU\\ingresando_datos_comprador.png"));
			System.out.println("-----------------------------------------");
			System.out.println("-----Ingresando datos de Comprador-------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("nameUser")).sendKeys("EMMANUEL");
			Thread.sleep(3000);
			controlador.findElement(By.id("middleUser")).sendKeys("MUNGUIA");
			Thread.sleep(3000);
			controlador.findElement(By.id("lastUser")).sendKeys("JIMENEZ");
			Thread.sleep(3000);
			controlador.findElement(By.id("phoneNumberPickUp")).sendKeys("5511235813");
			Thread.sleep(3000);
			controlador.findElement(By.id("selectDeliveryAddressStepDesktop")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("nameOnCard")).sendKeys("EMMANUEL MUNGUIA JIMENEZ");
			Thread.sleep(3000);
			controlador.findElement(By.id("cardNumber")).sendKeys("4012000033330026");
			Thread.sleep(3000);
			controlador.findElement(By.id("card-date")).sendKeys("0521");
			Thread.sleep(3000);
			controlador.findElement(By.id("cvvNumber")).sendKeys("123");
			Thread.sleep(3000);
			controlador.findElement(By.id("SaveDetails")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("lastInTheForm123")).click();
			Thread.sleep(60000);
			File scrFile8 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile8, new File("c:\\tmp\\Del-to-PU\\compra_exitosa.png"));
			System.out.println("-----------------------------------------");
			System.out.println("--------------Compra exitosa-------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[4]/div/div[1]/div[2]/fieldset/div[2]/div[2]/div[3]/a")).click();
			Thread.sleep(3000);
			
		}

		
		public void Carrito_PickUp_Delivery_A1(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			System.out.println("-----------------------------------------");
			System.out.println("-------Carrito_PickUp_Delivery_A1--------");
			System.out.println("-----------------------------------------");
			System.out.println("--Conectando al nodo de pruebas upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");	
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			System.out.println("-----------------------------------------");
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\pickup_delivery\\Conexion_exitosa.png"));
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(3000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Login exitoso----------------");
			System.out.println("-----------------------------------------");
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\pickup_delivery\\Login_exitoso.png"));
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Busqueda de Producto---------");
			System.out.println("-----------------------------------------");
			File scrFile2 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp\\pickup_delivery\\Busqueda_producto.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys("46176");
			Thread.sleep(3000);
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/span/a[2]/img")).click();
			Thread.sleep(9000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[3]/div[2]/div[4]/div[4]/div/div/div[3]/div[1]/div[6]/div[2]/div[1]/label")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("product_46176")).click();
			Thread.sleep(3000);
			controlador.findElement(By.xpath("//*[@id='add_to_cart_storepickup_form']/div[2]/div[2]/button/div/div/div[2]")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito1-----");
			System.out.println("-----------------------------------------");
			File scrFile3 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp\\pickup_delivery\\producto_carrito1.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys("50700");
			Thread.sleep(3000);
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/span/a[2]/img")).click();
			Thread.sleep(10000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[3]/div[2]/div[4]/div[6]/div/div/div[3]/div[1]/div[6]/div[2]/div[1]/label")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("product_50700")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito2-----");
			System.out.println("-----------------------------------------");
			File scrFile4 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp\\pickup_delivery\\producto_carrito2.png"));
			controlador.findElement(By.id("txtCart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.xpath("//*[@id='qty-plus-cart']")).click();
			Thread.sleep(6000);
			controlador.findElement(By.id("CarritoClickAndPick1")).click();
			Thread.sleep(3000);
			System.out.println("--------------------------------------------------");
			System.out.println("----------------Delivery exitoso------------------");
			System.out.println("--------------------------------------------------");
			File scrFile5 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile5, new File("c:\\tmp\\pickup_delivery\\delivery_exitoso.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Realizando compra------------");
			try {
				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[1]/button")).click();
				System.out.println("------------1-------------");}
				catch (Exception a) {
					try {
						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[2]/button")).click();
						System.out.println("------------2------------");}
						catch (Exception b) {
							try {
								controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[3]/button")).click();
								System.out.println("------------3------------");}
								catch (Exception c) {
									try {
										controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[4]/button")).click();
										System.out.println("------------4------------");}
										catch (Exception d) {
											try {
												controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[5]/button")).click();
												System.out.println("------------5------------");}
												catch (Exception e) {
													try {
														controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[6]/button")).click();
														System.out.println("------------6------------");}
														catch (Exception f) {
															try {
																controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[7]/button")).click();
																System.out.println("------------7------------");}
																catch (Exception g) {
																	try {
																		controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[8]/button")).click();
																		System.out.println("------------8------------");}
																		catch (Exception h) {
																			try {
																				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[9]/button")).click();
																				System.out.println("------------9------------");}
																				catch (Exception i) {
																						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[10]/button")).click();
																						System.out.println("------------10-----------");}
																		
																				}
																}}}}}}}
			Thread.sleep(9000);
			controlador.findElement(By.id("payondelivery")).click();
			File scrFile6 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("c:\\tmp\\pickup_delivery\\pago_contraentrega.png"));
			Thread.sleep(8000);
			controlador.findElement(By.xpath("//*[@id='lastInTheForm123']")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("--------------Compra exitosa-------------");
			System.out.println("-----------------------------------------");
			File scrFile8 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile8, new File("c:\\tmp\\pickup_delivery\\compra_exitosa.png"));
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[4]/div/div[1]/div[2]/fieldset/div[2]/div[2]/div[3]/a")).click();
			Thread.sleep(3000);
			
		}


		
		public void Carrito_Delivery_FastDelivery_A1(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			System.out.println("-----------------------------------------------");
			System.out.println("-------Carrito_Delivery_FastDelivery_A1--------");
			System.out.println("-----------------------------------------------");
			System.out.println("--Conectando al nodo de pruebas upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");	
			Thread.sleep(1000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			System.out.println("-----------------------------------------");
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\delivery_fastdelivery\\Conexion_exitosa.png"));
			Thread.sleep(1000);
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(1000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(1000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(1000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Login exitoso----------------");
			System.out.println("-----------------------------------------");
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\delivery_fastdelivery\\Login_exitoso.png"));
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(1000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Busqueda de Producto---------");
			System.out.println("-----------------------------------------");
			File scrFile2 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp\\delivery_fastdelivery\\Busqueda_producto.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys("50702");
			Thread.sleep(1000);
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/span/a[2]/img")).click();
			Thread.sleep(10000);
			controlador.findElement(By.id("addToCartButton")).click();
			Thread.sleep(2000);
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito-----");
			System.out.println("-----------------------------------------");
			File scrFile3 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp\\delivery_fastdelivery\\producto_carrito.png"));
			controlador.findElement(By.id("txtCart")).click();
			Thread.sleep(2000);
			controlador.findElement(By.id("noCarritoClickAndFast")).click();
			Thread.sleep(3000);
			
			controlador.findElement(By.xpath("//*[@id='postalCode']")).sendKeys("07500");
			Thread.sleep(9000);
			System.out.println("------------------------------------------------------");
			System.out.println("----------------FastDelivery exitoso------------------");
			System.out.println("------------------------------------------------------");
			File scrFile4 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp\\delivery_fastdelivery\\delivery_exitoso.png"));
			
			
			
		}

		
		public void Tres_Articulos_por_700(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			System.out.println("--------------------------------");
			System.out.println("-------Articulos_por_700--------");
			System.out.println("--------------------------------");
			System.out.println("--Conectando al nodo de pruebas upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");	
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			System.out.println("-----------------------------------------");
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\articulos_por_700\\Conexion_exitosa.png"));
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(3000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Login exitoso----------------");
			System.out.println("-----------------------------------------");
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\articulos_por_700\\Login_exitoso.png"));
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Busqueda de Producto---------");
			System.out.println("-----------------------------------------");
			File scrFile2 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp\\articulos_por_700\\Busqueda_producto.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys("27452");
			Thread.sleep(3000);
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/span/a[2]/img")).click();
			Thread.sleep(9000);
			controlador.findElement(By.id("addTocartbutToN")).click();
			Thread.sleep(3000);

			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito1-----");
			System.out.println("-----------------------------------------");
			
			File scrFile3 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp\\articulos_por_700\\Busqueda_producto.png"));

			controlador.findElement(By.id("js-site-search-input")).sendKeys("49725");
			Thread.sleep(3000);
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/span/a[2]/img")).click();
			Thread.sleep(10000);
			controlador.findElement(By.id("addTocartbutToN")).click();
			Thread.sleep(3000);
			
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito2-----");
			System.out.println("-----------------------------------------");
			File scrFile4 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp\\articulos_por_700\\producto_carrito2.png"));

			controlador.findElement(By.id("js-site-search-input")).sendKeys("50955");
			Thread.sleep(3000);
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/span/a[2]/img")).click();
			Thread.sleep(10000);
			controlador.findElement(By.id("addTocartbutToN")).click();
			Thread.sleep(3000);
			
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito3-----");
			System.out.println("-----------------------------------------");
			File scrFile5 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile5, new File("c:\\tmp\\articulos_por_700\\producto_carrito3.png"));

			controlador.findElement(By.id("txtCart")).click();
			Thread.sleep(3000);
			
			System.out.println("-----------------------------------------");
			System.out.println("------------Realizando compra------------");
			try {
				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[1]/button")).click();
				System.out.println("------------1-------------");}
				catch (Exception a) {
					try {
						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[2]/button")).click();
						System.out.println("------------2------------");}
						catch (Exception b) {
							try {
								controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[3]/button")).click();
								System.out.println("------------3------------");}
								catch (Exception c) {
									try {
										controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[4]/button")).click();
										System.out.println("------------4------------");}
										catch (Exception d) {
											try {
												controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[5]/button")).click();
												System.out.println("------------5------------");}
												catch (Exception e) {
													try {
														controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[6]/button")).click();
														System.out.println("------------6------------");}
														catch (Exception f) {
															try {
																controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[7]/button")).click();
																System.out.println("------------7------------");}
																catch (Exception g) {
																	try {
																		controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[8]/button")).click();
																		System.out.println("------------8------------");}
																		catch (Exception h) {
																			try {
																				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[9]/button")).click();
																				System.out.println("------------9------------");}
																				catch (Exception i) {
																						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[10]/button")).click();
																						System.out.println("------------10-----------");}
																		
																				}
																}}}}}}}
			Thread.sleep(9000);

			controlador.findElement(By.id("paymentu")).click();
			File scrFile6 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("c:\\tmp\\articulos_por_700\\paymentu.png"));
			Thread.sleep(8000);

			controlador.findElement(By.id("oxxo")).click();
			File scrFile7 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile7, new File("c:\\tmp\\articulos_por_700\\oxxo.png"));
			Thread.sleep(8000);


			controlador.findElement(By.xpath("//*[@id='lastInTheForm123']")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("--------------Compra exitosa-------------");
			System.out.println("-----------------------------------------");
			File scrFile8 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile8, new File("c:\\tmp\\articulos_por_700\\compra_exitosa.png"));
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[4]/div/div[1]/div[2]/fieldset/div[2]/div[2]/div[3]/a")).click();
			Thread.sleep(3000);
			
		}
		
		
		public void Descuento_1000_AMEX(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			System.out.println("----------------------------------");
			System.out.println("-------Descuento_1000_AMEX--------");
			System.out.println("----------------------------------");
			System.out.println("--Conectando al nodo de pruebas Upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");	
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			System.out.println("-----------------------------------------");
			Thread.sleep(3000);
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\descuento_amex\\Conexion_exitosa.png"));
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(3000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(3000);
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\descuento_amex\\Login.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Login exitoso----------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Busqueda de Producto---------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("js-site-search-input")).sendKeys("46178");
			Thread.sleep(3000);
			File scrFile2 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp\\descuento_amex\\Busqueda_de_Producto.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/span/a[2]/img")).click();
			Thread.sleep(8000);
			controlador.findElement(By.id("icon-add-car")).click();
			Thread.sleep(3000);
			File scrFile3 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp\\descuento_amex\\Añadir_carrito.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito-----");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("txtCart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			File scrFile4 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp\\descuento_amex\\realizando_compra.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Realizando compra------------");
			System.out.println("-----------------------------------------");
			try {
				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[1]/button")).click();
				System.out.println("------------1-------------");}
				catch (Exception a) {
					try {
						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[2]/button")).click();
						System.out.println("------------2------------");}
						catch (Exception b) {
							try {
								controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[3]/button")).click();
								System.out.println("------------3------------");}
								catch (Exception c) {
									try {
										controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[4]/button")).click();
										System.out.println("------------4------------");}
										catch (Exception d) {
											try {
												controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[5]/button")).click();
												System.out.println("------------5------------");}
												catch (Exception e) {
													try {
														controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[6]/button")).click();
														System.out.println("------------6------------");}
														catch (Exception f) {
															try {
																controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[7]/button")).click();
																System.out.println("------------7------------");}
																catch (Exception g) {
																	try {
																		controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[8]/button")).click();
																		System.out.println("------------8------------");}
																		catch (Exception h) {
																			try {
																				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[9]/button")).click();
																				System.out.println("------------9------------");}
																				catch (Exception i) {
																						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[10]/button")).click();
																						System.out.println("------------10-----------");}
																					
																				}
																}}}}}}}
			Thread.sleep(3000);

			controlador.findElement(By.id("card")).click();
			Thread.sleep(3000);

			File scrFile5 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile5, new File("c:\\tmp\\descuento_amex\\ingresando_datos_comprador.png"));

			System.out.println("-----------------------------------------");
			System.out.println("-----Ingresando datos de Comprador-------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("nameUser")).sendKeys("EMMANUEL");
			Thread.sleep(3000);
			controlador.findElement(By.id("middleUser")).sendKeys("MUNGUIA");
			Thread.sleep(3000);
			controlador.findElement(By.id("lastUser")).sendKeys("JIMENEZ");
			Thread.sleep(3000);
			controlador.findElement(By.id("phoneNumberPickUp")).sendKeys("5511235813");
			Thread.sleep(3000);
			controlador.findElement(By.id("selectDeliveryAddressStepDesktop")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("nameOnCard")).sendKeys("EMMANUEL MUNGUIA JIMENEZ");
			Thread.sleep(3000);
			controlador.findElement(By.id("cardNumber")).sendKeys("342135898797783");
			Thread.sleep(3000);
			controlador.findElement(By.id("card-date")).sendKeys("0521");
			Thread.sleep(3000);
			controlador.findElement(By.id("cvvNumber")).sendKeys("123");
			Thread.sleep(3000);
			controlador.findElement(By.id("SaveDetails")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("lastInTheForm123")).click();
			Thread.sleep(60000);
			
			File scrFile8 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile8, new File("c:\\tmp\\descuento_amex\\compra_exitosa.png"));
			System.out.println("-----------------------------------------");
			System.out.println("--------------Compra exitosa-------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[4]/div/div[1]/div[2]/fieldset/div[2]/div[2]/div[3]/a")).click();
			Thread.sleep(3000);
			
			
		}
		
		
		
		
		public void Compra_dos_SKU(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			System.out.println("-----------------------------");
			System.out.println("-------Compra_dos_SKU--------");
			System.out.println("-----------------------------");
			System.out.println("--Conectando al nodo de pruebas Upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");	
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			System.out.println("-----------------------------------------");
			Thread.sleep(3000);
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\Compra_DOs_sku\\Conexion_exitosa.png"));
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(3000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(3000);
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\Compra_DOs_sku\\Login.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Login exitoso----------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Busqueda de Producto---------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("js-site-search-input")).sendKeys("37677");
			Thread.sleep(3000);
			File scrFile2 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp\\Compra_DOs_sku\\Busqueda_de_Producto.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/span/a[2]/img")).click();
			Thread.sleep(8000);
			controlador.findElement(By.id("icon-add-car")).click();
			Thread.sleep(3000);
			File scrFile3 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp\\Compra_DOs_sku\\Añadir_carrito.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito-----");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("txtCart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			File scrFile4 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp\\Compra_DOs_sku\\realizando_compra.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Realizando compra------------");
			System.out.println("-----------------------------------------");
			try {
				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[1]/button")).click();
				System.out.println("------------1-------------");}
				catch (Exception a) {
					try {
						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[2]/button")).click();
						System.out.println("------------2------------");}
						catch (Exception b) {
							try {
								controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[3]/button")).click();
								System.out.println("------------3------------");}
								catch (Exception c) {
									try {
										controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[4]/button")).click();
										System.out.println("------------4------------");}
										catch (Exception d) {
											try {
												controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[5]/button")).click();
												System.out.println("------------5------------");}
												catch (Exception e) {
													try {
														controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[6]/button")).click();
														System.out.println("------------6------------");}
														catch (Exception f) {
															try {
																controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[7]/button")).click();
																System.out.println("------------7------------");}
																catch (Exception g) {
																	try {
																		controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[8]/button")).click();
																		System.out.println("------------8------------");}
																		catch (Exception h) {
																			try {
																				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[9]/button")).click();
																				System.out.println("------------9------------");}
																				catch (Exception i) {
																						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[10]/button")).click();
																						System.out.println("------------10-----------");}
																					
																				}
																}}}}}}}
			Thread.sleep(3000);
			File scrFile7 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile7, new File("c:\\tmp\\Compra_DOs_sku\\ingresando_datos_comprador_MASTERCARD.png"));
			System.out.println("-----------------------------------------");
			System.out.println("-----Ingresando datos de Comprador-------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("nameUser")).sendKeys("EMMANUEL");
			Thread.sleep(3000);
			controlador.findElement(By.id("middleUser")).sendKeys("MUNGUIA");
			Thread.sleep(3000);
			controlador.findElement(By.id("lastUser")).sendKeys("JIMENEZ");
			Thread.sleep(3000);
			controlador.findElement(By.id("phoneNumberPickUp")).sendKeys("5511235813");
			Thread.sleep(3000);
			controlador.findElement(By.id("selectDeliveryAddressStepDesktop")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("nameOnCard")).sendKeys("EMMANUEL MUNGUIA JIMENEZ");
			Thread.sleep(3000);
			controlador.findElement(By.id("cardNumber")).sendKeys("5123456789012346");
			Thread.sleep(3000);
			controlador.findElement(By.id("card-date")).sendKeys("0521");
			Thread.sleep(3000);
			controlador.findElement(By.id("cvvNumber")).sendKeys("123");
			Thread.sleep(3000);
			controlador.findElement(By.id("SaveDetails")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("lastInTheForm123")).click();
			Thread.sleep(60000);
			File scrFile8 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile8, new File("c:\\tmp\\Compra_DOs_sku\\compra_exitosa.png"));
			System.out.println("-----------------------------------------");
			System.out.println("--------------Compra exitosa-------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[4]/div/div[1]/div[2]/fieldset/div[2]/div[2]/div[3]/a")).click();
			Thread.sleep(3000);
			
		}
		
		
		public void Cupon_PAUTOMAT(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			System.out.println("-----------------------------");
			System.out.println("-------Cupon_PAUTOMAT--------");
			System.out.println("-----------------------------");
			System.out.println("--Conectando al nodo de pruebas Upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");	
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			System.out.println("-----------------------------------------");
			Thread.sleep(3000);
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\cupon_pautomat\\Conexion_exitosa.png"));
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(3000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(3000);
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\cupon_pautomat\\Login.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Login exitoso----------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Busqueda de Producto---------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("js-site-search-input")).sendKeys("46178");
			Thread.sleep(3000);
			File scrFile2 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp\\cupon_pautomat\\Busqueda_de_Producto.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/span/a[2]/img")).click();
			Thread.sleep(8000);
			controlador.findElement(By.id("icon-add-car")).click();
			Thread.sleep(3000);
			File scrFile3 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp\\cupon_pautomat\\Añadir_carrito.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito-----");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("txtCart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("qty-plus-cart")).click();
			Thread.sleep(3000);
			System.out.println("--------------------------------------------");
			System.out.println("------Cantidad de productos actualizada-----");
			System.out.println("--------------------------------------------");
			File scrFile4 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp\\cupon_pautomat\\Añadir_carrito.png"));
			controlador.findElement(By.xpath("//*[@id='headingFour']/div/button")).click();
			Thread.sleep(3000);

			controlador.findElement(By.id("js-voucher-code-text")).sendKeys("PAUTOMAT");
			Thread.sleep(3000);
			System.out.println("------------------------");
			System.out.println("------Aplicar cupon-----");
			System.out.println("------------------------");
			File scrFile5 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile5, new File("c:\\tmp\\cupon_pautomat\\Añadir_carrito.png"));
			controlador.findElement(By.xpath("//*[@id='js-voucher-apply-btn']")).click();
			Thread.sleep(3000);

			File scrFile6 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("c:\\tmp\\cupon_pautomat\\realizando_compra.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Realizando compra------------");
			System.out.println("-----------------------------------------");
			try {
				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[1]/button")).click();
				System.out.println("------------1-------------");}
				catch (Exception a) {
					try {
						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[2]/button")).click();
						System.out.println("------------2------------");}
						catch (Exception b) {
							try {
								controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[3]/button")).click();
								System.out.println("------------3------------");}
								catch (Exception c) {
									try {
										controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[4]/button")).click();
										System.out.println("------------4------------");}
										catch (Exception d) {
											try {
												controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[5]/button")).click();
												System.out.println("------------5------------");}
												catch (Exception e) {
													try {
														controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[6]/button")).click();
														System.out.println("------------6------------");}
														catch (Exception f) {
															try {
																controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[7]/button")).click();
																System.out.println("------------7------------");}
																catch (Exception g) {
																	try {
																		controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[8]/button")).click();
																		System.out.println("------------8------------");}
																		catch (Exception h) {
																			try {
																				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[9]/button")).click();
																				System.out.println("------------9------------");}
																				catch (Exception i) {
																						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[10]/button")).click();
																						System.out.println("------------10-----------");}
																					
																				}
																}}}}}}}
			Thread.sleep(3000);

			controlador.findElement(By.xpath("//*[@id='paymentu']")).click();
			Thread.sleep(3000);

			File scrFile7 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile7, new File("c:\\tmp\\cupon_pautomat\\comprando.png"));
			controlador.findElement(By.id("lastInTheForm123")).click();
			Thread.sleep(60000);

			File scrFile8 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile8, new File("c:\\tmp\\cupon_pautomat\\compra_exitosa.png"));
			System.out.println("-----------------------------------------");
			System.out.println("--------------Compra exitosa-------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[4]/div/div[1]/div[2]/fieldset/div[2]/div[2]/div[3]/a")).click();
			Thread.sleep(3000);
			
		}
		
		
		public void Cupon_PAUTOMAT2(ChromeDriver controlador, String producto) throws  Exception {
			// TODO Auto-generated method stub
			System.out.println("-----------------------------");
			System.out.println("-------Cupon_PAUTOMAT2--------");
			System.out.println("-----------------------------");
			System.out.println("--Conectando al nodo de pruebas Upgrade--");
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");	
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Conexion exitosa-------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("details-button")).click();
			Thread.sleep(3000);
			
			Thread.sleep(3000);
			File scrFile = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\cupon_pautomat2\\Conexion_exitosa.png"));
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(3000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(3000);
			File scrFile1 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("c:\\tmp\\cupon_pautomat2\\Login.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Login exitoso----------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(3000);
			System.out.println("-----------------------------------------");
			System.out.println("------------Busqueda de Producto---------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("js-site-search-input")).sendKeys("46178");
			Thread.sleep(3000);
			File scrFile2 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp\\cupon_pautomat2\\Busqueda_de_Producto.png"));
			controlador.findElement(By.id("js-site-search-input")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div/span/a[2]/img")).click();
			Thread.sleep(8000);
			controlador.findElement(By.id("icon-add-car")).click();
			Thread.sleep(3000);
			File scrFile3 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp\\cupon_pautomat2\\Añadir_carrito.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------Se añaden productos a Carrrito-----");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.id("txtCart")).click();
			Thread.sleep(3000);
			
			controlador.findElement(By.xpath("//*[@id='headingFour']/div/button")).click();
			Thread.sleep(3000);

			controlador.findElement(By.id("js-voucher-code-text")).sendKeys("PAUTOMAT2");
			Thread.sleep(3000);
			System.out.println("------------------------");
			System.out.println("------Aplicar cupon-----");
			System.out.println("------------------------");
			File scrFile4 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp\\cupon_pautomat2\\Añadir_carrito.png"));
			controlador.findElement(By.xpath("//*[@id='js-voucher-apply-btn']")).click();
			Thread.sleep(3000);

			File scrFile5 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile5, new File("c:\\tmp\\cupon_pautomat2\\realizando_compra.png"));
			System.out.println("-----------------------------------------");
			System.out.println("------------Realizando compra------------");
			System.out.println("-----------------------------------------");
			try {
				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[1]/button")).click();
				System.out.println("------------1-------------");}
				catch (Exception a) {
					try {
						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[2]/button")).click();
						System.out.println("------------2------------");}
						catch (Exception b) {
							try {
								controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[3]/button")).click();
								System.out.println("------------3------------");}
								catch (Exception c) {
									try {
										controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[4]/button")).click();
										System.out.println("------------4------------");}
										catch (Exception d) {
											try {
												controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[5]/button")).click();
												System.out.println("------------5------------");}
												catch (Exception e) {
													try {
														controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[6]/button")).click();
														System.out.println("------------6------------");}
														catch (Exception f) {
															try {
																controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[7]/button")).click();
																System.out.println("------------7------------");}
																catch (Exception g) {
																	try {
																		controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[8]/button")).click();
																		System.out.println("------------8------------");}
																		catch (Exception h) {
																			try {
																				controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[9]/button")).click();
																				System.out.println("------------9------------");}
																				catch (Exception i) {
																						controlador.findElement(By.xpath("//*[@id='ajax-total-js']/div/div[1]/div[10]/button")).click();
																						System.out.println("------------10-----------");}
																					
																				}
																}}}}}}}
			Thread.sleep(3000);

			controlador.findElement(By.xpath("//*[@id='paymentu']")).click();
			Thread.sleep(3000);

			File scrFile6 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("c:\\tmp\\cupon_pautomat2\\ingresando_datos_comprador.png"));
			controlador.findElement(By.id("lastInTheForm123")).click();
			Thread.sleep(60000);

			File scrFile7 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile7, new File("c:\\tmp\\cupon_pautomat2\\compra_exitosa.png"));
			System.out.println("-----------------------------------------");
			System.out.println("--------------Compra exitosa-------------");
			System.out.println("-----------------------------------------");
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[4]/div/div[1]/div[2]/fieldset/div[2]/div[2]/div[3]/a")).click();
			Thread.sleep(3000);

		}
			
		
		
		
			
		public void Eliminar_tarjeta(ChromeDriver controlador, String producto) throws Exception {
			// TODO Auto-generated method stub
			
			controlador.get("https://www.officedepot.com.mx/officedepot/en/");
			
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.id("usernamelogin")).sendKeys("ataglemarquez@gmail.com");
			Thread.sleep(3000);
			controlador.findElement(By.id("j_passwordexpress")).sendKeys("Alemania35");
			Thread.sleep(3000);
			controlador.findElement(By.id("loginButtonMaterial")).click();
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/header/div/nav[1]/div/div[1]/div/div/div/div[1]/div[4]/div[2]/div/div/div[2]/a/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.xpath("/html/body/main/div[4]/div[2]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div/a[2]/div/div[2]")).click();
			Thread.sleep(3000);
			controlador.findElement(By.xpath("//*[@id='contnet-info-myac']/div[2]/div/div/div[1]/div/div[3]/a/div")).click();
			Thread.sleep(10000);
			/*WebElement = controlador.findElement(By.id("colorbox"));*/
			controlador.findElement(By.xpath("//*[@id='removePaymentDetails8918224732202']/div[1]/div/div[1]/button")).click();
			Thread.sleep(3000);
				
			
			}

			


		public void Ingreso_datos_facturacion(ChromeDriver controlador, String producto) throws Exception {
			// TODO Auto-generated method stub
			
			System.out.println("-------------------------------------------");
			System.out.println("-----Ingreso de datos de facturación-------");
			System.out.println("-------------------------------------------");
			controlador.findElement(By.id("requireBill")).click();
			Thread.sleep(2000);
			
			
			WebElement element = controlador.findElement(By.id("billingAddress.cfdi")); 
			Select select = new Select(element); 
			select.selectByValue("G01");
			Thread.sleep(3000);
		
			WebElement element1 = controlador.findElement(By.id("address.bussinesActivity")); 
			Select select1 = new Select(element1);
			
			select1.selectByValue("F");
			Thread.sleep(4000);
			controlador.findElement(By.id("RFC")).sendKeys("MUJR920406RMA");
			Thread.sleep(3000);
		
			controlador.findElement(By.id("firstName")).sendKeys("EMMANUEL");
			Thread.sleep(3000);
			controlador.findElement(By.id("middlename")).sendKeys("EMMANUEL");
			Thread.sleep(2000);
			controlador.findElement(By.id("surname")).sendKeys("EMMANUEL");
			Thread.sleep(2000);
			

			
			controlador.findElement(By.id("billingAddress.digitalPrinting")).click();
			Thread.sleep(2000);
			
			}



	public void Eliminar_datos_facturacion(ChromeDriver controlador, String producto) throws Exception {
			// TODO Auto-generated method stub
			
			System.out.println("-------------------------------------------");
			System.out.println("-----Ingreso de datos de facturación-------");
			System.out.println("-------------------------------------------");
			controlador.findElement(By.id("requireBill")).click();
			Thread.sleep(2000);
			
			
			WebElement element = controlador.findElement(By.id("billingAddress.cfdi")); 
			Select select = new Select(element); 
			select.selectByValue("G01");
			Thread.sleep(3000);
		
			WebElement element1 = controlador.findElement(By.id("address.bussinesActivity")); 
			Select select1 = new Select(element1);
			
			select1.selectByValue("F");
			Thread.sleep(4000);
			controlador.findElement(By.id("RFC")).sendKeys("MUJR920406RMA");
			Thread.sleep(3000);
		
			controlador.findElement(By.id("firstName")).sendKeys("EMMANUEL");
			Thread.sleep(3000);
			controlador.findElement(By.id("middlename")).sendKeys("EMMANUEL");
			Thread.sleep(2000);
			controlador.findElement(By.id("surname")).sendKeys("EMMANUEL");
			Thread.sleep(2000);
			

			
			controlador.findElement(By.id("billingAddress.digitalPrinting")).click();
			Thread.sleep(2000);
				
			}




			
			
		
		
}