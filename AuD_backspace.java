import java.lang.StringBuilder;
import java.util.*;

public class AuD_backspace {

	public static void main(String[] args) {
		char[] c = bldString(10000000, 1).toCharArray();
		StringBuilder s = new StringBuilder();
		
		long start = System.nanoTime();
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '<') {
				s.deleteCharAt(s.length() - 1);
			}
			else {
				s.append(c[i]);
			}
		}
		
		String finished = new String(s);
		
		long ende = System.nanoTime();
		
		System.out.println(ende - start + "\n");
		System.out.println(finished.length());
	}
	
	static String bldString(int n, int seed) {
		Random rng = new Random(seed);
		StringBuilder strBld = new StringBuilder(n);
		for (int i=0; i<n; i++)
		strBld.append((char)(rng.nextInt(93)+33));
		return new String(strBld);
		}
}
