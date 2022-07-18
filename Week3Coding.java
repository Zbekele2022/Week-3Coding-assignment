
import java.util.*;
import java.text.DecimalFormat;

public class Week3Coding {

	public static void main(String[] args) {
		// Create an array of int called ages that contains the following values.
		
		int[] age  = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
//		double calculateAverage();
		
		
		// Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		
		
		// Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
//		double calculateAverage(int[] age)
//		{
	        int len=age.length;
	        int sum=0;
	        for(int i=0;i<len;i++)
	        {
	            sum+=age[i];
	        }
	        int avg=sum/len;
	        System.out.println(avg);
	        
		

		
	      //Programmatically subtract the value of the first element in the array from 
			// the value in the last element of the array 
			System.out.println(age[age.length -1]- age[0]);	
    
    
		
		//Create an array of String called names that contains the following values.
		String[] names = new String[] {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		

		
		
		// Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int total=0;
		for(int i=0; i<names.length; i++) {
			total += names[i].length();}
		
			System.out.println("The average number of letters" + " "+ total/names.length);
			

		
		// Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
			String concat ="";
			for(int i=0; i<names.length; i++) {
				concat += names[i] + " "; 
				}
			System.out.println(concat);
			
		
		
	}

}
