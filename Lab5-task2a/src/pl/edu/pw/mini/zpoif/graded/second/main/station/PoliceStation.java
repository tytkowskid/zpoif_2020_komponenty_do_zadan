package pl.edu.pw.mini.zpoif.graded.second.main.station;

import java.util.List;

import pl.edu.pw.mini.zpoif.graded.second.main.inerrogated.Interrogated;
import pl.edu.pw.mini.zpoif.graded.second.main.investigator.Investigator;

public abstract class PoliceStation {

	protected int interrogationTime = 25;
	public static final String MOTTO = "To protect and serve"; 

	protected interface Summaryable {
		public abstract int getNumberOfInterrogatedPeople();
	}

	public class Policeman extends Investigator {
		@Override
		public void interrogate(Interrogated interrogated) {
			System.out.printf("Mamy %d minut", interrogationTime);
			super.interrogate(interrogated);
		}
	}


	protected abstract void handleInterrogatedPeople(List<Interrogated> interrogators);
	protected abstract void interrogationRoom1(Interrogated interrogated, Investigator investigator);
	protected abstract void interrogationRoom2(Interrogated interrogated, Investigator investigator);
	protected abstract void interrogationRoom3(Interrogated interrogated, Investigator investigator);
	protected abstract void secretInterrogationRoom(Interrogated interrogated);
	protected abstract void summary(Summaryable summaryable);

}