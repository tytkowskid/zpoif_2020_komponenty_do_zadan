package pl.edu.pw.mini.zpoif.graded.second.main.station;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import pl.edu.pw.mini.zpoif.graded.second.main.inerrogated.Interrogated;

public class Demonstrator {

	private static final byte numberOfInterrogatedPeople = 5;

	private List<String> names = Arrays.asList("Alicja", "Maciek", "Piotrek", "Zbych", "Adam", "Joanna", "Zuzanna");
	private List<String> surnames = Arrays.asList("Johnson", "Bryl", "Opala", "Tkaczyk", "Witkek", "Dzwon");
	private List<String> pseudonyms = Arrays.asList("Halo", "Ogrodnik", "Halina", "Kapo", "Macho");

	public static void main(String[] args) {
		Demonstrator demonstrator = new Demonstrator();
		Demonstrator.ListGenerator igen = demonstrator.new ListGenerator();
		PoliceStation policeStation;//Tutaj nalezy zainicjowac stworzona podklase
		List<Interrogated> list = igen.gen();//Tutaj nalezy zainicjowac kolekcje za pomoca klasy opisanej w zadaniu
		//policeStation.reception(interrogatedPeople);//Odkomentowac, gdy komponenty zostana zainicjalizowane
		new Interrogated.Suspect("Danel","dupa").interrogateMe();
		System.out.println(list);

	}

	private class ListGenerator{

		private String randomName(){
			Random random = new Random();
			return Demonstrator.this.names.get(random.nextInt(names.size()));
		}
		private String randomSurname(){
			Random random = new Random();
			return Demonstrator.this.surnames.get(random.nextInt(surnames.size()));
		}
		private String randomNickname(){
			Random random = new Random();
			return Demonstrator.this.pseudonyms.get(random.nextInt(surnames.size()));
		}

		public List<Interrogated> gen(){
			List<Interrogated> list = new ArrayList<>();
			for(int i = 0; i < numberOfInterrogatedPeople; i++){
				list.add(new Interrogated.Suspect(randomName(),randomSurname()));
				list.add(new Interrogated.Witness(randomName(),randomSurname()));
				list.add(new Interrogated.SecretAgent(randomNickname()));
			}
			return list;
		}

	}



}
