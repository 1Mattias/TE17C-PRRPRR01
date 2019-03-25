import java.util.ArrayList;
import java.util.Scanner;

public class secureDoorsTomas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ArrayList f�r att h�lla koll p� vilka som �r i huset
		ArrayList<String> insideHouse = new ArrayList<String>();

		int logLength = sc.nextInt();
		for (int i = 0; i < logLength; i++) {
			String action = sc.next(); // F�rsta �r entry/exit
			String name = sc.next(); // Andra �r vem som entered/exited

			// Om name g�r in i huset
			if (action.equals("entry")) {
				System.out.println(name + " entered");
				if (insideHouse.contains(name)) {
					System.out.print(" (ANOMALY)"); // Samma rad
				} else {
					insideHouse.add(name); // L�gg till i huset
				}
			}

			// Om name l�mnar huset
			if (action.equals("exit")) {
				System.out.println(name + " exited");
				if (!insideHouse.contains(name)) {
					System.out.print(" (ANOMALY)");
				} else {
					insideHouse.remove(name); // Ta bort fr�n huset
				}
			}
		}

	}

}
