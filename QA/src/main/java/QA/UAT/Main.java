package QA.UAT;

import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Main 
{

	
    public static void main( String[] args ) throws Exception {
    {
    	//its a trap  
    	
    	
    	try {
    		
			Posnet Navegador = new Posnet();
		    PosnetVW Navegador2 = new PosnetVW();
			String msg = "", opc = "";
			

    		do
    			{	
    			ChromeOptions options = new ChromeOptions();
    			options.addArguments("--start-maximized");
		    	ChromeDriver controlador = new ChromeDriver(options);
		    	
		   
		    	
		    	String menu = "";
				menu += "a)	Venta_Valora                       \n";
				menu += "b)	Venta_Momentos                    \n";
				menu += "c)	Venta_Plenitud                    \n";
				menu += "d)	Venta_Vida                        \n";
				menu += "e)	Venta_Salud                       \n";
				menu += "1)	Venta_VW_Bank_Nuevos              \n";
				menu += "2)	Venta_VW_Bank_Usados              \n";
				menu += "3)	Venta_VW_Pago_de_contado_Nuevos   \n";
				menu += "4)	Venta_VW_Pago_de_contado_Usados   \n";
				

				
				
				String producto = JOptionPane.showInputDialog(null, menu, " Selecciona una opción ", 3);

				switch (producto) {
				case "a" : 
					Navegador.Venta_Valora(controlador, producto);
					break;
				case "b":
					Navegador.Venta_Momentos(controlador,producto);
					break;
				case "c":
					Navegador.Venta_Plenitud(controlador,producto);
					break;
				case "d":
					Navegador.Venta_Vida(controlador,producto);
					break;
				case "e":
					Navegador.Venta_Salud(controlador,producto);
					break;
				case "1":
					Navegador2.Venta_VW_Bank_Nuevos(controlador,producto);
					break;
				case "2":
					Navegador2.Venta_VW_Bank_Usados(controlador,producto);
					break;
				case "3":
					Navegador2.Venta_VW_Pago_de_contado_Nuevos(controlador,producto);
					break;
				case "4":
					Navegador2.Venta_VW_Pago_de_contado_usados(controlador,producto);
					break;
					
					
					
				

				default:
					JOptionPane.showConfirmDialog(null, "Opción Incorrecta");
					break;
				}
				opc = JOptionPane.showInputDialog(null, "¿Otra vez?");
				msg = "";
				controlador=null;
    			} while (opc.equalsIgnoreCase("si"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se produjo un error inesperado", "Mensaje de Error", 0);
			System.out.println("Causa   " + e.getLocalizedMessage() + "\n Mensaje de error   " + e.getMessage());
		}

	}
}
}