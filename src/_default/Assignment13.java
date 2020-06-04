
package _default;

public class Assignment13 {
	
//	Write a class named Assignment13 that checks if two strings are anagrams. 
//	Recall that an anagram is a word that can be formed by rearranging the letters of another. 
//	For example, angel is an anagram of angle and glean. 
//	(Hint: You will have to use the string methods that you are familiar with along with one or more loops)
	
	public static void checkAnagram(String anagram, String other) {
		if (anagram.equals(other) && anagram.length() != other.length()){
			System.out.println("Not a anagram");
			System.exit(0);
			}
		
		
		for (int i = 0; i < anagram.length(); i++) {
			
			char check = anagram.charAt(i);
			
			int one = 0;
			
			int two = 0;
			
			int[] map = new int[anagram.length()];
			
			
			
			if (other.indexOf(check) == -1) {
				System.out.println("Not a anagram");
				System.exit(0);
			}
			
			for (int j = 0; j < anagram.length(); j++) {
				if (anagram.charAt(j) == check) {
//					System.out.println(anagram.substring(j) + check);
					one++;
				}

			}
			
			for (int k = 0; k < other.length(); k++) {
				if (other.charAt(k) == check) {
//					System.out.println(other.substring(k) + check);
					two++;
				}
			}
			
			if (one != two) {
				System.out.println("Not a anagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");
	}

	public static void main(String[] args) {
		checkAnagram("cat", "tac");
	}
		
	}



