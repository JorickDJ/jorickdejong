package edu.avans.aei.ivh5.rschelli.week1.person;

import java.util.Properties;
import java.io.IOException;

import org.apache.log4j.Logger;

import edu.avans.aei.ivh5.rschelli.week1.main.Main;

/**
 * Example class. 
 * 
 * @author rschelli
 */
public class Person {
	
	// This person's name
	private String name;

	// Get a logger instance for the current class
	static Logger logger = Logger.getLogger(Main.class);

	/**
	 * Constructor, creating a Person and setting its name to the given name.
	 * 
	 * @param name This person's name.
	 */
	public Person(String name) {
		logger.debug("Constructor");
		this.name = name;
	}

	/**
	 * Getter
	 * 
	 * @return This person's name.
	 */
	public String getName() {
		logger.debug("getName, returning " + name);
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param name The name to be set.
	 */
	public void setName(String name) {
		logger.debug("setName " + name);
		this.name = name;
	}

	/**
	 * Read properties from "edu/avans/aei/ivh5/main.properties". This property is not
	 * actually used in this example class.
	 * 
	 * @return The property value as a String.
	 * @throws IOException
	 */
	public String readProperty() throws IOException {
		logger.debug("readProperty");
		
		Properties properties = new Properties();
		properties.load(getClass().getClassLoader().getResourceAsStream(
				"edu/avans/aei/ivh5/main.properties"));
		return properties.getProperty("main");
	}
}
