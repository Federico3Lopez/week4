package Hello;

public class numer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {12,54,2,65,2,1};
		boolean answer = numberNine (num);
		System.out.println(answer);
	}
		 public static boolean numberNine( int num[]) {
			 int sum =0;
			 for (int i = 0; i < num.length; i++) {
		            sum += num[i];}
			
		 return (sum > 100); 
	}

}
