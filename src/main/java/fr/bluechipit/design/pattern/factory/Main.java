package fr.bluechipit.design.pattern.factory;

public class Main {

	public static void main(String[] args) {
		NameFactory nfactory = new NameFactory();
		// send the text to the factory and get a class back
		String entryField = "warboy,fredo";
		Namer namer = nfactory.getNamer(entryField);
		// compute the first and last names
		// using the returned class
		System.out.println(namer.getFirst());
		System.out.println(namer.getLast());
	}

}
