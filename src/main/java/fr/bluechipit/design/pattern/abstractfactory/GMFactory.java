package fr.bluechipit.design.pattern.abstractfactory;

public class GMFactory implements AbstractFactoryIF {

	public AbstractEconomyCarIF createEconomyCar() {
		// TODO Auto-generated method stub
		return new Cavalier();
	}

	public AbstractSportsCarIF createSportsCar() {
		// TODO Auto-generated method stub
		return new Corvette();
	}

}
