package _default;

public class Assignment6 {
//	Write a class named Assignment6 that finds the index of the 2nd space character in "Hello My Name is Java"; 
//	Print this number. (Hint: you may have to combine two String methods)
	public static String message = "Hello My Name is Java";
	
	public static void main(String[] args) {
		System.out.println(message.substring(message.indexOf(" ")+1).indexOf(" ")+ message.indexOf(" ")+1);
		System.out.println(message.substring(0,message.substring(message.indexOf(" ")+1).indexOf(" ")+ message.indexOf(" ")+1));
		System.out.println(message.charAt(message.substring(message.indexOf(" ")+1).indexOf(" ")+ message.indexOf(" ")+1));
	}

}
