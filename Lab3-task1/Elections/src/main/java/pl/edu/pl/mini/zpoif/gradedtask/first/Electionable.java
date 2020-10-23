package pl.edu.pl.mini.zpoif.gradedtask.first;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface Electionable {
	
	Collection<?> parseFile(String path) throws ParseException;
	Collection<?> getSortedStudents(Collection<?> elects);
	Map<Integer, Object> getFuneralStatistics(Set<?> elects);
	
}
