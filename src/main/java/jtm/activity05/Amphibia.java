package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Amphibia extends Transport {
	private Ship ship;
	private Vehicle vehicle;

	public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
		super(id, consumption, tankSize);
		this.ship = new Ship(id, sails, wheels);
		this.vehicle = new Vehicle(id, consumption, tankSize, wheels);
	}

	@Override
	public String move(Road road) {
		// return super.move(road);
		if (road.getClass() == Road.class) {
			return this.vehicle.move(road);
		} else {
			return this.ship.move(road);
		}
	}
}