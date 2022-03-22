package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Solution {

	/**
	 * Implement the method below, then right click on SolutionTests.java within
	 * src/test/java/ -> com.revature to test your code before committing and
	 * pushing to your repository.
	 */

	public static int[] solution(int[] data, int n) {

		
		List<Integer> remove = new ArrayList<Integer>();
		Map<Integer, Integer> check = new Hashtable<Integer, Integer>();
		List<Integer> nums = new ArrayList<Integer>();
		if (n <= 0) {
			
			return data = new int[0];
		} else {

			

			for (int i = 0; i < data.length; i++) {
				
				
				if (check.containsKey(data[i])) {
					
					check.put(data[i], check.get(data[i] + 1));
					
					nums.add(data[i]);
					
					if (check.get(data[i]) > n) {
						remove.add(data[i]);
					}
				} else {
					check.put(data[i], 1);
					
					nums.add(data[i]);
				}
			}
		
			nums.removeAll(remove);
			data = nums.stream().mapToInt(Integer::intValue).toArray();
		}
		 
	 
	
		return data;
	}

}
