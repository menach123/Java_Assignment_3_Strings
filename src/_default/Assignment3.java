package _default;

public class Assignment3 {
	
	public static void main(String[] args) {
		String x = "abc";
		String y = new String("abc");
		
		if (x == y ) {
			System.out.println("== : equal");
		}
		else {
			System.out.println("== : not equal");
		}
		
		if (x.equals(y) ) {
			System.out.println(".equal() : equal");
		}
		else {
			System.out.println(".equal() : not equal");
		}
		
		
	}

}
