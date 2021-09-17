import java.util.HashSet;
import java.util.Set;

public class Ankit {
	

	public static void main(String[] args) {
	int num=153423;
	int rem=0;
	int rev=0;
	StringBuilder s=new StringBuilder();
	
	while(num!=0) {
	rem=num%10;
rev=(rev*10)+rem;
num=num/10;
	}
	System.out.println(rev);
	System.out.println(Character.MAX_VALUE);
	
	}


}
