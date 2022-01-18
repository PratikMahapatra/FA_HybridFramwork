package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {
	
	Logger log;
	
	public Logger createLog(String name) {
		log = Logger.getLogger(name);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String date = sdf.format(d);
		String timeStamp = date.replace(" ", "_").replaceAll(":", "_").replaceAll("/", "_");
		System.setProperty("timeStamp", timeStamp);
		BasicConfigurator.resetConfiguration();
		PropertyConfigurator.configure(".//resources//log4j.properties");
		Logger log1 = Logger.getLogger("freemarker.cache");
		log1.setAdditivity(false);
		return log;
	}

}


