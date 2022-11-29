package week4.Hello;

public class numberSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = numberSeven("Goodbye", 3);
		System.out.println(answer);
	}
	public static String numberSeven( String word, int n) {
		if( word == null || word == "")	
		return word;
		String result = "";              
	       for ( int i=0;i<n;i++)        
	       {
	           result = result + word;
	       }
	 
	       return result;
	}
	
}
