package week4.Hello;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount= 0;
		int newAge= 0;
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93, 2};
		amount = ages.length - 1;
		newAge = ages[0] - ages[(amount)];
		System.out.println(newAge);
		
		
		int sum = 0;
		 for (int i = 0; i < ages.length; i++) {
	            sum += ages[i];}
			  
		    System.out.println( sum/ages.length);
	}

}
