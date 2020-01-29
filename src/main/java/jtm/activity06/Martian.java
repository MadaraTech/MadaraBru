package jtm.activity06;

public class Martian implements Humanoid, Cloneable, Alien {
	private int weight;
	private String[] backpack;

	public Martian() {
		this.weight = 42;
		this.backpack = new String[10];
	}

	@Override
	public void eatHuman(Humanoid humanoid) {
		if (humanoid.isAlive().equals("Alive")) {
			weight += humanoid.getWeight();
			humanoid.killHimself();

		}
		// Ja cilvēks ir dzīvs, tad viņu var apēst. Martian neēd līķus.
		// ja Martian apēd cilvēku, tad svars ir cilvēks + Martian. Cilvēku var
		// apēst 1reizi. Tātad, cilvēks jāatgriež dead.

	}

	@Override
	public int getLegCount() {
		return LEG_COUNT;
	}

	@Override
	public int getWeight() {
		return this.weight;

	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;

	}

	@Override
	public String killHimself() {
		return "I AM IMMORTAL!";
	}

	@Override
	public int getArmCount() {
		return ARM_COUNT;
	}

	@Override
	public String[] getBackpack() {
		return this.backpack;

	}

	@Override
	public void addToBackpack(String item) {
		for (int i = 0; i < backpack.length; i++) {
			if (backpack[i] == null) {
				backpack[i] = item;
				break;
			}
		}
	}

	@Override
	public String isAlive() {
		return "I AM IMMORTAL!";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO
		Martian m = new Martian();
		m.setWeight(weight);
		m.setArmCount(this.getArmCount());

		return m;
	}

	private void setArmCount(int armCount) {
		// TODO Auto-generated method stub

	}

}

// Create new class named: Martian in jtm.activity06 package
// Make Martian class implement Humanoid, Alien and Cloneable interfaces
// Create constructor for Martian without parameters and set initial weight for
// Martian to 42
// Override clone method:
