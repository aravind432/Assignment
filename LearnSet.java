package week1.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> val=new HashSet<String>();
    //Set<String> val=new TreeSet<String>();
    //Set<String> val=new LinkedHashSet<String>();
    
	val.add("Aspire Systems");
	val.add("CTS");
	//boolean add=val.add("CTS");
	//System.out.println(add);
	val.add("Wipro");
	val.add("Hcl");
	//boolean add1=val.add("CTS");
	//System.out.println(add1);
	System.out.println(val);

    
    
		
	}

}
