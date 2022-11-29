package Hello;

public class numberEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num[] = {23.43,12.23,38.34};
		double num2[] = {62.3,22.9,33.78};
		boolean theWin = numberEleven(num,num2);
		System.out.println(theWin);
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
