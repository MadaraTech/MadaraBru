package jtm.activity04;

public class Road {
	
	
	private String from; // Start point
	private String to; // End point
	private int distance; // distance in km
	
	public Road(String from, String to, int distance) {
		super();
		this.from = from;
		this.to = to;
		this.distance = distance;
	}

	public Road() {
		this.from = " ";
		this.to = " ";
		this.distance = 0;
	};

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return from + " — " + to + ", " + distance + "km";
	}

	}
	
	

	/*- TODO #1
	 * Select menu Source — Generate Constructor using Fields...
	 * and create constructor which sets from, to and distance
	 * values of the newly created object
	 */

	/*- TODO #2
	 * Create constructor without parameters, which sets empty
	 * values or 0 to all object properties
	 */


	/*- TODO #3
	 * Generate getters and Setters for distance, from and to fields
	 */


	/*- TODO #4
	 * Generate toString() method and update it to return string in a form:
	 * "From - To, 00km",
	 * where "From" is actual from point, "To" — actual to point and
	 * 00 is actual length of the road
	 * Note that — is not dash ("minus key" in jargon), but m-dash!
	 * See more at: https://en.wikipedia.org/wiki/Dash
	 */



