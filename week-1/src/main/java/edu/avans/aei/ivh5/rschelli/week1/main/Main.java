/**
 * 
 */
package edu.avans.aei.ivh5.rschelli.week1.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import edu.avans.aei.ivh5.rschelli.week1.person.Person;

/**
 * Main class to run the Person example.
 * 
 * @author rschelli
 */
public class Main {

	// Get a logger instance for the current class
	static Logger logger = Logger.getLogger(Main.class);
	
	/**
	 * Main method to run the application.
	 * 
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {

		// Configure logging. See ..\log\prakticum.log for file output.
		PropertyConfigurator.configure("../ivh5.logconf");

		logger.debug("Week 1 Main starting --------");
		Person p = new Person("Karel Appel");
		
		// Implement the Person.toString() method to change this behavior!
		logger.debug("Nieuwe persoon: " + p.toString());

	}

}
