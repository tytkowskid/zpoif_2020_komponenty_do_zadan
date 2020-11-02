package pl.edu.pw.mini.zpoif.graded.second.main.inerrogated;

import pl.edu.pw.mini.zpoif.graded.second.main.Interrogated;

public abstract class Investigator {
	public void interrogate(Interrogated interrogated) {
		interrogated.interrogateMe();
		System.out.println("I have interrogated: " + interrogated);
	}
}
