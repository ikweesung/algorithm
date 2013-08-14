package algo.sort.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerLoader {
	
	private static final String LOG4J_CONF_FILE_NAME = "log4j.properties";
	private static Logger LOG = LoggerFactory.getLogger(LoggerLoader.class);
	
	public static void load(){
		Properties logProperties = new Properties();
		try {
			logProperties.load(new FileInputStream("conf" + File.separator + LOG4J_CONF_FILE_NAME));
		} catch (FileNotFoundException e) {
			LOG.error(e.getMessage(), e);
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
		}
		PropertyConfigurator.configure(logProperties);
	}
}
