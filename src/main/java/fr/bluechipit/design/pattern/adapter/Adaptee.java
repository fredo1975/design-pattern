package fr.bluechipit.design.pattern.adapter;

public class Adaptee {
	public Adaptee() {
		System.out.println("Adaptee constructed.");
	}
	public String oldRequest() {
		return "Adaptee.oldRequest() called.";
	}
}
