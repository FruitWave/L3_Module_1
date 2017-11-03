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

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = i + 1; j < results.size(); j++) {
				if (results.get(j) < results.get(i)) {
					double tempstore = results.get(j);
					results.set(j, results.get(i));
					results.set(i, tempstore);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = i + 1; j < unsortedSequences.size(); j++) {
				if (unsortedSequences.get(j).length() < unsortedSequences.get(i).length()) {
					String tempstore = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(i));
					unsortedSequences.set(i, tempstore);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = i + 1; j < words.size(); j++) {

				if (words.get(j).compareTo(words.get(i)) < 0) {
					String tempstore = words.get(j);
					words.set(j, words.get(i));
					words.set(i, tempstore);
				}
			}
		}
		System.out.println(words);
		return words;
	}
}