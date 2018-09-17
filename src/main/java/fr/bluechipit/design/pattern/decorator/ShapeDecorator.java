package fr.bluechipit.design.pattern.decorator;

import org.apache.log4j.Logger;

public abstract class ShapeDecorator implements Shape {
	protected static final Logger logger = Logger.getLogger(ShapeDecorator.class);
	protected Shape decoratedShape;
	public ShapeDecorator(Shape decoratedShape) {
		logger.info("ShapeDecorator");
		this.decoratedShape = decoratedShape;
	}
	@Override
	public void draw() {
		decoratedShape.draw();
	}
}
