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
	
	
	public static void main(String[] args) {
		
		
		int start = 0;
		int end = palindrom.length()-1;
		
		
		while(start < end) {
			
			int i = end;
			
			
			while(i > start) {
				//System.out.println("start: "+start+ " end: "+end+ " i: "+i);
				
				if(isPalindrom(start,i))
					collectPalindroms.add(palindrom.substring(start,i+1));
				i--;
			}
			start++;
			
		}
		
		
		for(int i = 0; i < collectPalindroms.size();i++) {
			System.out.println(collectPalindroms.get(i));
			
		}
		
	}

}
