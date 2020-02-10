package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {
	protected byte sails;

	public Ship(String id, byte sails) {
		// super(id, consumption, tankSize);
		// 
		// TODO Auto-generated constructor stub
       // } public Ship (String id, byte sails) {
		super(id, 0, 0);
		this.sails = sails;
	}

	@Override
	public String move(Road road) {
		if (!(road instanceof WaterRoad)) {
			// if (road.getClass() != WaterRoad.class) {
			return "Cannot sail on " + road.toString();
		}
		return this.getType() + " is sailing on " + road.toString() + " with " + this.sails + " sails";
	}
}// return Cannot sail on (Road as String) if it is not WaterRoad.

