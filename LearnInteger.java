package week1.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnInteger {
public static void main(String[] args) {
	List<Integer> var=new ArrayList<Integer>();

	var.add(6);
	var.add(1);
	var.add(7);
	var.add(2);
	var.add(4);
	var.add(3);
	var.add(5);
	var.add(8);
	System.out.println(var);
	
        int size=var.size();
	for (int i = 0; i <size; i++) {
		Integer integer=var.get(i);
		System.out.println(integer);	
	}
	
	Collections.sort(var);
	System.out.println(var);
	
	Collections.reverse(var);
	System.out.println(var);
	
	
	
	
	
	
	//int size=var.size();
	//System.out.println(size);
	
	//boolean contains=var.contains(4);
	//System.out.println(contains);
	
	
	
	
	
}	
	
	
	
	

}
