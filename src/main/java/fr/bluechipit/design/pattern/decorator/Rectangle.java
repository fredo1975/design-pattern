package fr.bluechipit.design.pattern.decorator;

import org.apache.log4j.Logger;

public class Rectangle implements Shape {
	protected static final Logger logger = Logger.getLogger(Rectangle.class);
	@Override
	public void draw() {
		logger.info("Shape: Rectangle");
	}

}
