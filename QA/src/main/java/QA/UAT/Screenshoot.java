package QA.QA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshoot {
	
	String Ruta;
	
	private String[] Posicion = new String[21];
	
	private  void datos() {
		
		Ruta = "C:/QA_Regresion/Evidencias/";	
	
	}
	
	
	private void LlenarArreglo() {
		// LLena el areglo de la numeracion de las capturas de pantalla
		Posicion[1] = "01";
		Posicion[2] = "02";
		Posicion[3] = "03";
		Posicion[4] = "04";
		Posicion[5] = "05";
		Posicion[6] = "06";
		Posicion[7] = "07";
		Posicion[8] = "08";
		Posicion[9] = "09";
		Posicion[10] = "10";
		Posicion[11] = "11";
		Posicion[12] = "12";
		Posicion[13] = "13";
		Posicion[14] = "14";
		Posicion[15] = "15";
		Posicion[16] = "16";
		Posicion[17] = "17";
		Posicion[18] = "18";
		Posicion[19] = "19";
		Posicion[20] = "20";
	}
	
	public void Screenshoot(String ruta, int Num, WebDriver driver) {
		// Manda a imprimer la pantalla cuando lo invoques
		
		  	
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = ruta + "Step" + Posicion[Num] + ".png";
			File destination = new File(dest);
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	

}
