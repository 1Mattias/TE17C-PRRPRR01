package metoder_repetition;

import java.util.Scanner;

public class welcome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		String name2;
		
		System.out.println("Hej! Vad heter du och din mamma?");
		name = input.nextLine();
		name2 = input.nextLine();
		
		welcomeMessage(name, name2);
	}

	// skriv en metod som returnerar en h�lsning till en person
	static void welcomeMessage(String name, String name2) {
		
		System.out.println("Hej " + name + "! V�lkommen hit!");
		System.out.println("Hej " + name2 + "! V�lkommen hit du ocks�!");
	}
	
}
