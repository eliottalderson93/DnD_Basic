
public class run {
	public static void main(String[] args) {
		Human conan = new Human("Conan the Barbarian");
		Human evil_wizard = new Human("D'Shzz the Mysterious");
		conan.attack(evil_wizard);
		conan.attack(evil_wizard);
		evil_wizard.attack(conan);
		conan.getHealth();
		evil_wizard.getHealth();
	}
}
