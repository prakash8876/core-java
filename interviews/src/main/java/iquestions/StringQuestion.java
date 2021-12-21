package iquestions;

import java.util.Arrays;
import java.util.Scanner;

// How to compare string contains duplicate or not, simple way
// do not use StringBuilder
// use simple logic
public class  StringQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name: ");
//		Step 1 : Get input
		String name = sc.nextLine();
		sc.close();
		boolean result = checkDuplicates(name);
		System.out.println("Is " + name + " contain duplicate? " + result);
	}

	private static boolean checkDuplicates(String name) {
//		Step 2 : reverese
		String reverese = reverse(name);
		for (int i = 0; i < reverese.length(); i++) {
			char c = reverese.charAt(i);
			for (int j = i + 1; j < reverese.length() - 1; j++) {
				if (c == reverese.charAt(j))
					return true;
			}
		}
		return false;
	}

	private static String reverse(String name) {
		char[] arr= new char[name.length()];
		int index = 0;
		for (int i = name.length() - 1; i >= 0; i--) {
			arr[index] = name.charAt(i);
			index++;
		}
		return Arrays.toString(arr);
	}
}
// logic description:
/*
 * Get name as input Step 1 reverse name Step compare first element with last
 * element of name compare second to second last compare third to third from
 * last until both matches the
 * 
 * ex: abccde output true how? > reverse edccba > compare a = e NO b = d NO c =
 * c YES return true
 * 
 * ex: priya output false how? > reverse ayirp > compare p == a NO r == r YES
 * return true ----> Not valid so here use variable to count number of
 * occuresance
 * 
 * >> So the logic will >> get input >> reverese the input >> count by using
 * counter the number of character occured more than 0 >> counter should assign
 * to 0, it will increase if it occures more than one time >> at last check if
 * counter is greater than 0, then return true >> otherwise continue till each
 * character compare >> and only compare until the last character before char,
 * means array.length() - 1
 */
