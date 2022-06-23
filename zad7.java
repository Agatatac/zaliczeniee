package lab7;
import java.util.HashSet;
import java.util.Set;
public class zad7 {

	public static void main(String[] args) {
		Set<String> ubrania = new HashSet<String>();
		ubrania.add("Crop top");
		ubrania.add("Koszula");
		ubrania.add("D¿insy");
		ubrania.add("Szorty");
		ubrania.add("Sukienka");
		System.out.println(ubrania);
		ubrania.add("Crop top");
		System.out.println(ubrania);
		for (String znak: ubrania)
		{
			System.out.println(znak+",");
		}
		System.out.println();

	}

}
