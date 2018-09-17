package fr.bluechipit.design.pattern.abstractfactory;

import org.apache.log4j.Logger;

public class Corvette implements AbstractSportsCarIF {
	protected static final Logger logger = Logger.getLogger(Corvette.class);
	public void driveFast() {
		logger.info("Corvette.driveFast() called.");
	}

}
