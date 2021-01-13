package QA.UAT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeerExcel {
	
	static int a = 3, r = 2;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;

	public void obtnerE(String Path, String SheetName) throws Exception {

		
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheetAt(0);
		} catch (Exception e) {
			System.out.println("Archivo incorrecto");
		}
	}

	public int excel_get_rows() throws Exception {

		try {
			return ExcelWSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			throw (e);
		}
	}

	public String getCellDataasstring(int RowNum, int ColNum) throws Exception {

		try {
			String CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();

			return CellData;
		} catch (Exception e) {
			return "Error al obtener el valor de la celda";
		}
	}

	public double getCellDataasnumber(int RowNum, int ColNum) throws Exception {

		try {
			double CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
			return CellData;
		} catch (Exception e) {
			return 000.00;
		}
	}

	public int getCellDataasnumberIn(int RowNum, int ColNum) throws Exception {

		try {
			int CellData = (int) ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
			return CellData;
		} catch (Exception e) {
			return 0;
		}

	}

	public void archivosExcel(String dato) throws Exception {
		String nombre = "clientes";
		String nombreArchivo = "C:\\Users\\jjuarezsa\\Documents\\Archivos_Carga\\" + nombre + ".xlsx";

		if (validaExcel(nombreArchivo) == false) {
			String mensaje = "Se creará el archivo " + nombre + " con el registro " + dato;
			JOptionPane.showMessageDialog(null, mensaje);
			creaArchivo(dato);

		} else {
			String mensaje = "Se editará el archivo " + nombre + " con el registro " + dato;
			JOptionPane.showMessageDialog(null, mensaje);
			editarArchivo(dato, nombreArchivo);

		}
	}

	public boolean validaExcel(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		if (archivo.exists() == true) {
			return true;
		} else {

			return false;
		}

	}

	public void creaArchivo(String dato) throws FileNotFoundException {
		String nombreArchivo = "C:\\Users\\jjuarezsa\\Documents\\Archivos_Carga\\clientes.xlsx";
		String nombreHoja1 = "Hoja1";
		XSSFWorkbook libroTrabajo = new XSSFWorkbook();
		XSSFSheet hoja1 = libroTrabajo.createSheet(nombreHoja1);
		for (int r = 1; r < 2; r++) {
			XSSFRow row = hoja1.createRow(r);
			XSSFCell cell = row.createCell(0);
			cell.getRow().getCell(0);
			cell.setCellValue(dato);
		}
		FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
		try {
			libroTrabajo.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void editarArchivo(String dato, String nombreArchivo) throws Exception {

		FileInputStream fsIP = new FileInputStream(new File(nombreArchivo));

		XSSFWorkbook wb = new XSSFWorkbook(fsIP);

		XSSFSheet worksheet = wb.getSheetAt(0);

		for (int f = r; f < a;) {
			XSSFRow row = worksheet.createRow(f);
			XSSFCell cell = row.createCell(0);
			cell.getRow().getCell(0);
			cell.setCellValue(dato);
			f++;
		}
		a = a + 1;
		r = r + 1;

		FileOutputStream nuevoArchivo = new FileOutputStream(new File(nombreArchivo));

		wb.write(nuevoArchivo);
		nuevoArchivo.close();

	}


}
