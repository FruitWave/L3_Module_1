package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) != "whole") {
				return i; // <- this needs changing
			}
		}
		return 0;

	}

	public static Object countPearls(List<Boolean> oysters) {
		int m = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				m++;
			}
		}
		return m;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Add other methods here

}