package fr.bluechipit.design.pattern.state;

import org.apache.log4j.Logger;

public class TVContext implements State {
	protected static final Logger logger = Logger.getLogger(TVContext.class);
	private State tvState;
    public void setState(State state) {
        this.tvState=state;
    }
    public State getState() {
        return this.tvState;
    }
    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
