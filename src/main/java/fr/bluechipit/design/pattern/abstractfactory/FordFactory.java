package fr.bluechipit.design.pattern.abstractfactory;

public class FordFactory implements AbstractFactoryIF {

	public AbstractEconomyCarIF createEconomyCar() {
		return new Focus();
	}

	public AbstractSportsCarIF createSportsCar() {
		return new Mustang();
	}

}
