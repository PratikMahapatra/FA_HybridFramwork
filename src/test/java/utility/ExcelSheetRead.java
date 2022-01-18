package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetRead extends ConfigReader {
public Map<String, String> excelData = null;
	public ExcelSheetRead() throws IOException  {
		excelData = new HashMap<>();
		FileInputStream file = new FileInputStream(properties.getProperty("excel"));
		XSSFWorkbook excelBook = new XSSFWorkbook(file);
		for (int i = 0; i < excelBook.getNumberOfSheets(); i++) {

			XSSFSheet sheet = excelBook.getSheetAt(i);
			Iterator<Row> rows = sheet.iterator();
			while (rows.hasNext()) {
				int d = 0;
				Iterator<Cell> cells = rows.next().cellIterator();
				String key = "";
				while (cells.hasNext()) {
					String data = cells.next().toString();
					if (d == 0) {
						excelData.put(data, "");
						key = data;
					} else {
						excelData.put(key, data);
					}
					d++;
				}
			}
		}
		excelBook.close();
		file.close();
	}
	public String read(String string) {
		return excelData.get(string);
	}
}
