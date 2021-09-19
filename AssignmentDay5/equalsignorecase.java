package AssignmentDay5;

public class equalsignorecase {

	public static void main(String[] args) {
		String str1 = "I am Learning Java" ;
		String str2 = "Learning Java" ;
		
		if (str1 == str2);
		System.out.println("Both Strings are same");
		
		if(str1.equals(str2));	
		System.out.println("Strings are same");
		
		if (str1.equalsIgnoreCase(str2));
			System.out.println("Both Strings are same irrespective of case");
			
			
		
	}

}
