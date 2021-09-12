package org.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayToListToSetToMap {

	public static void main(String[] args) {
		
int a[]=new int[4];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		List<Integer> li=new ArrayList<>();
		
		for (int j = 0; j < a.length; j++) {
			li.add(a[j]);
			System.out.println();
		
		}
		System.out.println(li);
		Set<Integer> s=new LinkedHashSet<>();
		s.addAll(li);
		System.out.println(s);
		Map<Integer,Integer> mp=new LinkedHashMap<>();
		int y=0;
		for (Integer integer : s) {
			mp.put(y, integer);
			y=y+1;
			
		}
		System.out.println(mp);
	}
		
	
	
	
	
	
	 
	
	
}

