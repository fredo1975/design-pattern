package fr.bluechipit.design.pattern.decorator;

import org.apache.log4j.Logger;

public class Circle implements Shape {
	protected static final Logger logger = Logger.getLogger(Circle.class);
	@Override
	public void draw() {
		logger.info("Shape: Circle");
	}

}
