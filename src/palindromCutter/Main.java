package palindromCutter;

import java.util.ArrayList;

public class Main {

	private static String palindrom = 
		// "abbaeae";
		 "abcbada";
	
	private static ArrayList<String> collectPalindroms = new ArrayList<String>();
	
	public static boolean isPalindrom(int i, int j) {
		int k = i;
		int l = j;
		while(k < l) {
			
			if(palindrom.charAt(k) != palindrom.charAt(l))
				return false;
			k++;
			l--;
		}
		return true;
	}
	
	public static void printAllPalindromes() {
		
		int start = 0;
		int end = palindrom.length()-1;
		
		while(start < end) {
			
			int i = end;
			
			while(i > start) {
				
				if(isPalindrom(start,i))
					collectPalindroms.add(palindrom.substring(start,i+1));
				i--;
			}
			start++;
		}
		
		for(int i = 0; i < collectPalindroms.size();i++) {
			System.out.print(collectPalindroms.get(i) + " ");
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("String: "+palindrom);
		System.out.print("All palindromes: (minimum length: 2 characters) ");
		printAllPalindromes();
	}
}
