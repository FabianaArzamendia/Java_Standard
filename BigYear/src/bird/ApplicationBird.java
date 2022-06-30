package bird;

import java.util.Scanner;

public class ApplicationBird {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BirdDatabase bird = new BirdDatabase();

		while (true) {
			System.out.print("Choose a option ");
			String userOption = sc.nextLine();

			switch (userOption) {
			case "Add":
				bird.addBird();
				break;
			case "Observation":
				bird.ObservationBird();
				break;
			case "All":
				bird.ShowAllBirds();
				break;
			case "One":
				bird.ShowOneBird();
				break;
			case "Quit":
				return;

			default:
				System.out.println("The option does not exist.");
				break;

			}

		}

	}
}
