package Hello;

public class newOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num[] = {23.43,32.23,38.34};
		double num2[] = {72.3,22.9,33.78};
		boolean theWin = numberEleven(num,num2);
		System.out.println(theWin);
//		if(theWin == true) {
//		System.out.println("answer is true");} else { System.out.println("answer is not true");}
	}
	public static boolean numberEleven (double num[], double num2[]) {
		
		double average =0;
		double average2 =0;

		double sum = 0;
		for (int i = 0; i < num.length; i++) {
	            sum += num[i];}
			average = sum/num.length;
					
			double total = 0;{
			for (int i = 0; i < num2.length; i++) {
		            total += num2[i];}
			average2 = total/num2.length;}
			
			return(average >= average2 ); 
		
			
}
}