/* Project: Lab3
* Class:    UniqueWords.java
* Author:   Elvin Pagan
* Date:     October 17, 2026
* This program prints counts the number of unique words in a passed array list
*/

import java.util.ArrayList;

public class UniqueWords {

	// -------------------------------------------------------------
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {
		int count = 0;

		for (int i = 0; i < list.size(); i++)
		// updated for loop to not check past i
		{
			for (int j = 0; j <= i; j++) {
				/*
				 * if word appear before current j position it is a repeat -> if so stop loop
				 * before incrementing
				 */
				if (list.get(i).equals(list.get(j)) && j < i) {
					break;
				}
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}
		}
		return count;
	}

	// ----------------------------------------------------
	// Main method to test program
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
