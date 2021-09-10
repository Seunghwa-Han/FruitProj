package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> list = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101, "Apple", 1000);
		list.add(s1);
		Fruit s2 = new Fruit(102, "Banana", 2000);
		list.add(s2);
		Fruit s3 = new Fruit(103, "Applemango", 3000);
		list.add(s3);
		Fruit s4 = new Fruit(104, "Grape", 1500);
		list.add(s4);
		Fruit s5 = new Fruit(105, "Watermelon", 2200);
		list.add(s5);
		Fruit s6 = new Fruit(106, "Cherry", 1400);
		list.add(s6);
		Fruit s7 = new Fruit(107, "Plum", 900);
		list.add(s7);
		Fruit s8 = new Fruit(108, "Peach", 500);
		list.add(s8);
		Fruit s9 = new Fruit(109, "Mango", 1000);
		list.add(s9);
		Fruit s10 = new Fruit(110, "Fig", 1500);
		list.add(s10);
		
		Collections.sort(list, new FruitComparator());
		for(Fruit f : list)
			System.out.println(f.toString());

		System.out.println("\nFruit List (reverse ordered by name)");
		Collections.sort(list, new FruitComparatorDesc());
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).toString());
		
	}

}
