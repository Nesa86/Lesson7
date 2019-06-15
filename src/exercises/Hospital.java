package exercises;

public class Hospital {

	public static void main(String[] args) {
		new Doctor("Thompson", "stomatology").doMedicine();
		new GeneralPractitioner("Smith").doMedicine();
		new GeneralPractitioner("Williams").makeHouseCalls();
		new Surgeon("House", "surgery").doMedicine();
		new Surgeon().performSurgery();

	}

}