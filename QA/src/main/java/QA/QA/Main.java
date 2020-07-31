package QA.QA;

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
    		
			Solicitudes Navegador = new Solicitudes();
			String msg = "", opc = "";
			

    		do
    			{	
    			ChromeOptions options = new ChromeOptions();
    			options.addArguments("--start-maximized");
		    	ChromeDriver controlador = new ChromeDriver(options);
		    	
		   
		    	
		    	String menu = "";
				menu += "a)	Crear_registro                    \n";
				menu += "b)	Login                             \n";
				menu += "c) Eliminar_carrito                  \n";
				menu += "d) Eliminar_tarjeta                  \n";
				menu += "e) Ingreso_datos_facturacion         \n";
				menu += "f) Eliminar_datos_facturacion        \n";
				menu += "g) Carrito_Delivery_PickUp_A1        \n";
				menu += "h) Carrito_PickUp_Delivery_A1        \n";
				menu += "i) Carrito_Delivery_FastDelivery_A1  \n";
				menu += "j) Tres_Articulos_por_700            \n";
				menu += "k) Descuento_1000_AMEX               \n";
				menu += "l) Descuento_1000_AMEX               \n";
				menu += "m) Cupon_PAUTOMAT                    \n";
				menu += "n) Cupon_PAUTOMAT2                   \n";

				
				
				String producto = JOptionPane.showInputDialog(null, menu, " Selecciona una opción ", 3);

				switch (producto) {
				case "a":
					Navegador.Crear_registro(controlador, producto);
					break;
				case "b":
					Navegador.Login(controlador,producto);
					break;
				case "c":
					Navegador.Eliminar_carrito(controlador,producto);
					break;
				case "d":
					Navegador.Eliminar_tarjeta(controlador,producto);
					break;
				case "e":
					Navegador.Ingreso_datos_facturacion(controlador,producto);
					break;
				case "f":
					Navegador.Eliminar_datos_facturacion(controlador,producto);
					break;
				case "g":
					Navegador.Carrito_Delivery_PickUp_A1(controlador,producto);
					break;
				case "h":
					Navegador.Carrito_PickUp_Delivery_A1(controlador,producto);
					break;
				case "i":
					Navegador.Carrito_Delivery_FastDelivery_A1(controlador,producto);
					break;
				case "j":
					Navegador.Tres_Articulos_por_700(controlador,producto);
					break;
				case "k":
					Navegador.Descuento_1000_AMEX(controlador,producto);
					break;
				case "l":
					Navegador.Compra_dos_SKU(controlador,producto);
					break;
				case "m":
					Navegador.Cupon_PAUTOMAT(controlador,producto);
					break;
				case "n":
					Navegador.Cupon_PAUTOMAT2(controlador,producto);
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