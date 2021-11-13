public class Strings {

	public static void main (String[] args) {
		String s1="Tubanur";
		String s2=new String("Tubanur");// Strings are also classes
		String s3="Tubanur";
		
		System.out.println(s2.length());
		// Strings index like arrays.
		System.out.println("0.index: " +s2.charAt(0));
		System.out.println("5.index: " +s2.charAt(5));
		System.out.println("6.index: " +s2.charAt(s2.length()-1)); //s2.length:7 elements and last letter is 6.index

		System.out.println(s2.startsWith("Tu")); //s2 can also be written in parentheses

		System.out.println(s2.endsWith("nur"));  // s2 can also be written in parentheses


		if(s1==s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");//different object.
		}
		if(s1.equals(s3)) {
			System.out.println("The values in it are equal ");
		}
		if(s1==s3) {
			System.out.println("Equal ");// They show the same memory.
		}

	}

}

