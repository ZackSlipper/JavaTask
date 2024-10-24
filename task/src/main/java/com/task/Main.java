package com.task;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter some text: ");

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println("You entered: " + text);
		scanner.close();

		System.out.println("Number of words: " + wordCount(text));
		System.out.println("Number of symbols: " + symbolCount(text));
		System.out.println("Most common symbol: '" + mostCommonSymbol(text) + "'");
		System.out.println("Reverse text: " + reverseText(text));
	}
	
	public static int wordCount(String text) {
		if (text == null || text.isEmpty()) {
			return 0;
		}

		String[] words = text.split(" ");

		int wordCount = 0;
		for (int i = 0; i < words.length; i++) {
			if (!words[i].isEmpty())
				wordCount++;
		}

		return wordCount;
	}
	
	public static int symbolCount(String text) {
		int symbols = 0;
		for (int i = 0; i < text.length(); i++)
			symbols++;

		return symbols;
	}

	public static char mostCommonSymbol(String text) {
		if (text == null || text.isEmpty()) {
			return 0;
		}

		int max = 0;
		char mostCommon = '\0';
		for (int i = 0; i < text.length(); i++) {
			char symbol = text.charAt(i);
			int count = countSymbol(symbol, text);
			if (count > max) {
				max = count;
				mostCommon = symbol;
			}
		}

		return mostCommon;
	}

	public static int countSymbol(char symbol, String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol)
				count++;
		}

		return count;
	}

	public static String reverseText(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		return sb.toString();
	}
}