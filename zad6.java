package lab7;
import java.util.HashSet;
import java.util.Set;
public class zad6 {

	public static void main(String[] args) {
	Set<String> kwiaty = new HashSet<String>();
	kwiaty.add("Storczyk");
	kwiaty.add("Tulipan");
	kwiaty.add("Stokrotka");
	System.out.println(kwiaty);
	kwiaty.add("Storczyk");
	System.out.println(kwiaty);
	for (String znak: kwiaty)
	{
		System.out.println(znak+",");
	}
	System.out.println();
	System.out.println("Czy zbi�r zawiera Tulipan? "+kwiaty.contains("Tulipan"));
	System.out.println("Czy zbi�r zawiera R�a? "+kwiaty.contains("R�a"));
	System.out.println("Czy�cimy zbi�r");
	kwiaty.clear();
	System.out.println(kwiaty);
	}

}
