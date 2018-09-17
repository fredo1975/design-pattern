package fr.bluechipit.design.pattern.state;

import org.apache.log4j.Logger;

public class TVStartState implements State {
	protected static final Logger logger = Logger.getLogger(TVStartState.class);
	@Override
	public void doAction() {
		logger.info("TV is turned ON");
	}

}
