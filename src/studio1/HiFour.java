package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Who is person one?");
		String s1 = ap.nextString("Who is person two?");
		String s2 = ap.nextString("Who is person three?");
		String s3 = ap.nextString("Who is person four?");
		//
		// Say hello to the names in s0 through s3.
		//
String ss = "Greetings " + s0 +", " +s1 +", "+ s2 +", and " +s3 +".";
		System.out.println(ss);
	}
}
