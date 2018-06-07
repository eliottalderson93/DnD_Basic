public class Human {
	String name;
	int strength;
	int stealth;
	int intelligence;
	int health;
	public Human() {
		this.name = "";
		this.strength = 3;
		this.stealth = 3;
		this.intelligence =3;
		this.health = 100;
	}
	public Human(String Name) {
		this.name = Name;
		this.strength = 3;
		this.stealth = 3;
		this.intelligence =3;
		this.health = 100;
	}
	public void attack(Human target) {
		System.out.println(this.name + " swings his weapon, and hits " + target.name);
		target.health = target.health - this.strength;
	}
	public int getHealth() {
		System.out.println(this.name + "'s health: " + this.health);
		return this.health;
	}
}
