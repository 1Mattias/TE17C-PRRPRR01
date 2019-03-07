package arrayList;

import java.util.ArrayList; // m�ste finnas med om ArrayList ska anv�ndas

public class arrayList {

	public static void main(String[] args) {

		// Skapa en Array list (t�nk p� likheten med Scanner)
		ArrayList<String> nameList = new ArrayList<>();

		nameList.add("Olle"); // P� index 0
		nameList.add("Lisa"); // P� index 1
		nameList.add("Lasse"); // P� index 2

		// skriver ut en ArrayList inneh�llet mha .size() och .get()
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print(nameList.get(i) + " ");
		}
		
		System.out.println();

		nameList.add(1, "Anna"); // l�gger till "Anna" p� index 1 och skjuter allt ett steg �t h�ger
		System.out.println(nameList);  // skriver ut nameList p� ett speciellt s�tt med hakparenteser

		nameList.set(2, "Britta"); // byter ut namnet p� index 2 mot "Britta"
		System.out.println(nameList);

		nameList.remove(0); // tar bort namnet p� index 0 och skjuter allt ett steg til v�nster
		System.out.println(nameList);

		nameList.remove("Britta"); // tar bort f�rsta elementet som == "Britta" f�rekommer i ArrayList
		System.out.println(nameList);

		// Till skillnad fr�n arrayer kan man inte lagra primitiva typer (int, double, ...) i dessa listor.
		// Om man vill lagra t ex heltal i lista s� f�r man anv�nda sig av omslagsklassen Integer.
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			alist.add(new Integer(i * i));
		}
		for (int i = 0; i < alist.size(); i++) {
			System.out.println((alist.get(i)).intValue()); // g�r om Integer till en int i syfte att utf�ra
														   // aritmetiska operationer och skriver ut dem
		}
	}

}
