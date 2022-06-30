package bird;

import java.util.Scanner;

public class BirdUtilities {
	
	public static String ask(Scanner scanner, String text) {
	        System.out.println(text);
	        return scanner.next();
	    }
}
