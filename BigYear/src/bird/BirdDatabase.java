package bird;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {
	private static ArrayList<Bird> listBird;
	private static boolean isExist;

	public BirdDatabase() {
		this.listBird = new ArrayList<>();
		this.isExist = false;

	}

	// Add - adds a bird
	public static void addBird() {
		Scanner reader = new Scanner(System.in);
		String name = BirdUtilities.ask(reader, "Name : ?");
		String latinName = BirdUtilities.ask(reader, "LastName : ?");
		listBird.add(new Bird(name, latinName));

	}

	// Observation - adds an observation

	public static void ObservationBird() {
		Scanner reader = new Scanner(System.in);
		String namebird = BirdUtilities.ask(reader, "Name : ?");
		for (Bird bird : listBird) {
			if (namebird.equals(bird.getName())) {
				bird.TotalObservation();
				isExist = true;
			}

		}
		if (!isExist) {
			System.out.println("No exist bird");
		}

	}

	// All - prints all birds
	public static void ShowAllBirds() {
		for (Bird bird : listBird) {
			System.out.println(bird);
		}
	}

	// One - prints one bird
	public static void ShowOneBird() {
		Scanner reader = new Scanner(System.in);
		String name = BirdUtilities.ask(reader, "Name : ?");
		for (Bird bird : listBird) {
			if (bird.getName().contains(name)) {
				System.out.println("Bird found " + bird);
				isExist = true;
			}

		}
		if (!isExist) {
			System.out.println("No exist bird");
		}

	}

}
