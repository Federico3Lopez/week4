package Hello;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class PROJECT {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fullName("lico","Lopez");
		willBuyDrink(true, 11);
		int num[] = {12,54,2,65,2,1};
		double newOne[]= {32.9,61.2,55.3};
		double newOneNow = numberTen(newOne);
		
		System.out.println(newOneNow);
//		numberTen (numb);
		numberNine (num);
		
		String name = fullName("Lico","Lopez");
		System.out.println(name);
		
		
		
		
		
		
		
		int amount= 0;
		int newAge= 0;
		int amountNew =0;
		int averageOfAges =0;
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		amount = ages.length - 1;
		newAge = ages[0] - ages[(amount)];
		System.out.println(newAge);
	
		
		int sum = 0;
		 for (int i = 0; i < ages.length; i++) {
	            sum += ages[i];}
			  
		    System.out.println( sum/ages.length);
		
		}
		


//		String names[] = {"Sam","Tommy","Tim","Sally","Buck","Bob"}; 
//		int amountOfNames = 0;
//		amountOfNames = names.length; 
//		for ( int i = 0; i < amountOfNames;i++) {  
////		for (String name : names ){  
//			System.out.println(names[i]);
	
		 public static String fullName(String first, String last ) {
			 return first + " " + last;
			
		}
		 public static void willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			boolean isHotOutSide = true;
			if( isHotOutSide && moneyInPocket >10.50) {
				System.out.println("true");
			}
			 
		 }
		 public static boolean numberNine( int num[]) {
			 int sum =0;
			 for (int i = 0; i < num.length; i++) {
		            sum += num[i];}
			 if (sum > 100) {
				 System.out.println();
		 }return true; 

	}
		 public static double numberTen( double numb[]) {
			 double sum=0;
			 for (int i = 0; i < numb.length; i++) {
		            sum += numb[i];}
			return sum/numb.length;
		 }
		 
}







