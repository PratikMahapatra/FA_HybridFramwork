package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**This util class reads the properties from config.properties file
 * @since 29/12/2021
 *
 */
public class ConfigReader {
	
	public Properties properties;
	String filePath = "config.properties";
	
	public ConfigReader() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**This method returns properties
	 * @return
	 */
	public Properties getProperties() {
		return properties;
	}
	

}
