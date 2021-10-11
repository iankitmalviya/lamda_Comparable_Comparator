package lamda_Comparable_Comparator;

public class Person implements Comparable<Person>{
private String firstname;
private String lastname;
private int age;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person(String firstname, String lastname, int age) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
}
@Override
public String toString() {
	return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
}
@Override
public int compareTo(Person o) {
	// TODO Auto-generated method stub
	return firstname.compareTo(o.firstname);
}

}
