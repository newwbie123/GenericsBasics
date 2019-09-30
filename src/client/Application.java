package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		//primjer 1 sa opcenitom klasom Container
		
		Container<Integer, String> container = new Container<>(12, "Hello");
		//mozemo upisati i Container<Integer, String> container = new Container<Integer, String>(12, "Hello"); 
		//ali nije potrebno jer je dovoljno iza new Container samo upisati <>
		
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		
		
		Container<Double, Integer> container2 = new Container<>(5.72, 10);
		double con1 = container2.getItem1();
		int con2 = container2.getItem2();
		double mult = con1 * con2;
		System.out.println(mult);
		container2.printItems();
		
		
		//primjer 2 sa Setovima

		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("First");
		mySet1.add("Fourth");
		mySet1.add("Second");
		mySet1.add("Third");
		
		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("First");
		mySet2.add("Second");
		mySet2.add("Computer");
		mySet2.add("Stipe");
		
		Set<String> resultSet = union(mySet1, mySet2);
		
		//za iteraciju mozemo koristiti iterator interface, a ne treba for loop, ali OBAVEZNO moramo dodati <String> da zna koji tip podataka ulazi u iterator
		Iterator<String> itr = resultSet.iterator();
		
		//pa mozemo ispisati sve sto se nalazi u Setu

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
//		primjer gdje je vidljivo da se ne mogu spajati setovi Integera i Stringa, metoda "spajanje" se nece izvrsiti pravilno
		
//		Set<Integer> mySet3 = new HashSet<Integer>();
//		mySet3.add(26);
//		mySet3.add(87);
//		
//		Set<String> spojeni = spajanje(mySet2, mySet3);
//		for(String opce : spojeni) {
//			System.out.println(spojeni);
//		}

		
	}
	
	//primjer genericke metode koja ce u spojiti sve vrijednosti iz obadva Seta u jedan novi kojeg kreiramo, ali bez duplikata jer ih Setovi ignoiraju
	//<E> je definicija da je tip podataka E, dakle uopceno ali stogod izaberemo inicijalno, mora biti isti (ako je Integer, onda mora uvijek biti Integer)
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
	}
	
	public static <E> Set<E> spajanje(Set<E> set1, Set<E> set2) {
		Set<E> rezultat = new HashSet<E>(set1);
		rezultat.addAll(set2);
		return rezultat;
		
	}
	

}
