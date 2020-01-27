package jtm.activity05;

import jtm.activity04.Road;

public class WaterRoad extends Road {

	@Override
	public String toString() {
		return "WaterRoad " + super.toString();
	}

	public WaterRoad(String from, String to, int distance) {
		super(from, to, distance);
		// TODO Auto-generated constructor stub
	}

	public WaterRoad() {
		// TODO Auto-generated constructor stub
	}
}
// 6.Override .toString() method which returns string in form: WaterRoad From —
// To, 00km