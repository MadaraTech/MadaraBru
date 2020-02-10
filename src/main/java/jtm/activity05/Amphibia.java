package jtm.activity05;

import jtm.activity04.Road;

public class Amphibia extends Vehicle {

	private byte sails;
	

	public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
		super(id, consumption, tankSize, wheels);
		this.sails = sails;
		
	}

	@Override
	public String move(Road road) {
		if ((road.getClass() == Road.class)) {
			super.move(road);
			return getId() + " Amphibia is driving on " + road.toString() + " with " + wheels + " wheels";
		} else {
			
			return getId() + " Amphibia is sailing on " + road.toString() + " with " + sails + " sails";
		}

	}
}