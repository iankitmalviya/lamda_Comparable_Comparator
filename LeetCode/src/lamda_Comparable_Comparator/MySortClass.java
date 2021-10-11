package lamda_Comparable_Comparator;

import java.util.Comparator;

public class MySortClass implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getLastname().charAt(0)>o2.getLastname().charAt(0) ?1:-1;
	}



}
