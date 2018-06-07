public class Human {
	String name;
	int strength;
	int stealth;
	int intelligence;
	int health;
	boolean isHidden;
	boolean isAlive;
	static int numHumans = 0;
	public Human() {
		this.name = "";
		this.strength = 3;
		this.stealth = 3;
		this.intelligence =3;
		this.health = 100;
		this.isHidden = false;
		this.isAlive = true;
		numHumans++;
	}
	public Human(String Name) {
		this.name = Name;
		this.strength = 3;
		this.stealth = 3;
		this.intelligence =3;
		this.health = 100;
		this.isHidden = false;
		this.isAlive = true;
		numHumans++;
	}
	public void attack(Human target) {
		if (this.isAlive == true) {
			System.out.println(this.name + " swings his weapon, and hits " + target.name);
			target.health = target.health - this.strength;
		}
		else {
			System.out.println(this.name + " has fallen.");
		}
	}
	public Human getHealth() {
		System.out.println(this.name + "'s health: " + this.health);
		return this;
	}
	public void endRound() {
		if (this.health < 0) {
			this.isAlive = false;
		}
	}
	public int survey() {
		System.out.print(this.name + " looks around the battlefield and sees ");
		System.out.print(numHumans);
		System.out.print(" warriors remaining.");
		System.out.println("");
		return numHumans;
	}
}
