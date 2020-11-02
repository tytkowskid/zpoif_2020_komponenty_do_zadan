package pl.edu.pw.mini.zpoif.gradedtask.second.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pl.edu.pw.mini.zpoif.gradedtask.second.document.Document;
import pl.edu.pw.mini.zpoif.gradedtask.second.multishredder.MultiShredder;

public class Demonstrator {
	
	private static Set<String> names = new HashSet<String>(Arrays.asList("Alicja", "Maciek", "Piotrek", "Zbych", "Adam", "Joanna", "Zuzanna"));
	private static Set<String> surnames = new HashSet<String>(Arrays.asList("Johnson", "Bryl", "Opala", "Tkaczyk", "Witkek", "Dzwon"));
	private static Set<String> pseudonyms = new HashSet<String>(Arrays.asList("Bond", "J-23", "Suworow", "X", "Y"));
	
	public static void main(String[] args) {
		List<Document> documents;// Zainicjowac
		MultiShredder multiShredder;// Zainicjowac
		//multiShredder.destroyAllDocuments(documents); //Odkomentowac jak potrzebne elementy zostana zainicjalizowane (w w/w linijkach) 	
	}
	
}
