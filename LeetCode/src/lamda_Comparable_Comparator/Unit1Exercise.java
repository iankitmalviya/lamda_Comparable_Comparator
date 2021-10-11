package lamda_Comparable_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Unit1Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		List<Person>people=Arrays.asList(
		new Person("ankit","malviya",25),
		new Person("neha","sonare",24),
		new Person("prajakta","tiwari",22),
		new Person("ridima","shukla",22),
		new Person("pranali","deshmukh",25)
		);

Collections.sort(people,(o1,o2)->o1.getLastname().charAt(0)>o2.getLastname().charAt(0) ?1:-1);
Collections.sort(people);
//sort list by last name
//create a method that prints all elements in the list
//create a method that have all people that have last element beginning with C

ListIterator<Person> itr1=people.listIterator();
while(itr1.hasNext()){
	System.out.print(itr1.next()+"#");
}
System.out.println();
ListIterator<Person> itr2=people.listIterator();
while(itr2.hasNext()){
	Person str=itr2.next();
	if(str.getLastname().startsWith("d"))
	System.out.print(str);
}


	}

}
