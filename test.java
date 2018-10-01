package com.disney.wdpro.service.common.health;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class test {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	List<List<Integer>> nearestXsteakHouses(int totalSteakhouses, List<List<Integer>> allLocations,
			int numSteakhouses) {
		List<List<Integer>> lst = new ArrayList<List<Integer>>();

		Map<Double, Integer> map = new TreeMap<Double, Integer>();

		for (int i = 0; i < allLocations.size(); i++) {
			List<Integer> loc = allLocations.get(i);
			map.put(Math.sqrt(Math.pow(Double.valueOf(loc.get(0)), 2) + Math.pow(Double.valueOf(loc.get(1)), 2)), i);
		}

		int ind = 0;

		for (Map.Entry<Double, Integer> entry : map.entrySet()) {
			if (ind < numSteakhouses) {
				lst.add(allLocations.get(entry.getValue()));
			}

			ind++;
		}

		return lst;

	}

}