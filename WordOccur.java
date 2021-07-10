package test;

import java.util.HashMap;

public class WordOccur {

	public static void main(String[] args) {
		HashMap<String, Integer> wordHast = new HashMap();
		String word = "Test new Test Test New Test new";
		String splitword[] = word.split(" ");
		for (int i = 0; i < splitword.length; i++) {
			int count = 1;
			if (wordHast.get(splitword[i]) == null) {
				wordHast.put(splitword[i], count);
			} else {
				int countnew = wordHast.get(splitword[i]);
				countnew++;
				wordHast.put(splitword[i], countnew);
			}

		}
		wordHast.forEach((i, j) -> System.out.println("Word :" + i + " and count : " + j));

	}

}
