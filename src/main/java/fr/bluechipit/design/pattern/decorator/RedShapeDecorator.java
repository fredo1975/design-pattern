package fr.bluechipit.design.pattern.decorator;

import org.apache.log4j.Logger;

public class RedShapeDecorator extends ShapeDecorator {
	protected static final Logger logger = Logger
			.getLogger(RedShapeDecorator.class);

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		logger.info("RedShapeDecorator");
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		logger.info("Border Color: Red");
	}
}
