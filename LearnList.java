package week1.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

public static void main(String[] args) {
	List<String> val=new ArrayList<String>();
	
	val.add("Test");
	val.add("Leaf");
	val.add(0,"Aravind");
	val.add("anand");
	val.add(1,"Aravind");
	System.out.println(val);
	
	for (String string : val) {
		System.out.println(string);
	}
	
	
	int size=val.size();
	System.out.println(size);
	
	//boolean contains=val.contains("Test");
	//System.out.println(contains);
	
	//String remove=val.remove(2);
	//System.out.println(remove);
	
	//val.removeAll(val);
	//System.out.println(val);
	
	//boolean empty=val.isEmpty();
	//System.out.println(empty);
	
	
	
	
	
}
}
