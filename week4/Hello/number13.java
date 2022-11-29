package Hello;

public class number13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kids[] = {4,16,15,10,18};
		int answer = avgKid(kids);
		System.out.println(answer);
	}
public static int avgKid ( int kids[]){
	
	int sum = 0;
	 for (int i = 0; i < kids.length; i++) {
           sum += kids[i];}

	return (sum/kids.length);
	
	
}
}
