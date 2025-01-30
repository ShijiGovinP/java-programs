import java.util.Scanner;
public class palind2 {
    public static void main(String[] args) {
		  String original, reverse = "";   
	      Scanner in = new Scanner(System.in);     
	      System.out.println("Enter a string/number to check if it is a palindrome");    
	      original = in.nextLine();     // to print in next line
	      int length = original.length();     
	      for ( int i = length - 1; i >= 0; i-- )    
	         reverse = reverse + original.charAt(i); //using reverse to read the character from 1   
	      if (original.equals(reverse))    
	         System.out.println("Entered string/number is a palindrome.");    
	      else    
	         System.out.println("Entered string/number isn't a palindrome.");

	}

}
    
