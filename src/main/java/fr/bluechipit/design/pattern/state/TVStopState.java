package fr.bluechipit.design.pattern.state;

import org.apache.log4j.Logger;

public class TVStopState implements State {
	protected static final Logger logger = Logger.getLogger(TVStopState.class);
	@Override
	public void doAction() {
		logger.info("TV is turned OFF");
	}

}
