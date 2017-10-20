package SearchingAndSortingAlgorithms;

import java.util.List;
import java.util.Stack;

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
		Stack<Double> starktowers = new Stack<>();
		starktowers.push(peeps.get(0));
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > starktowers.peek()) {
				starktowers.push(peeps.get(i));
			}
		}
		return starktowers.peek();

		// Add other methods here

	}

	public static Object findLongestWord(List<String> words) {
		Stack<String> starktowers = new Stack<>();
		starktowers.push(words.get(0));
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > starktowers.peek().length()) {
				starktowers.push(words.get(i));
			}
		}
		return starktowers.peek();

	}

	public static Object containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).indexOf("... --- ...") >= 0) {
				return true;
			}
		}
		return false;

	}
}