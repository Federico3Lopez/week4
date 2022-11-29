package week4.Hello;

public class numer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double newOne[]= {42.9,21.2,55.3, 74.54};
		double newOneNow = numberTen(newOne);
		System.out.println(newOneNow);
	}
	public static double numberTen( double numb[]) {
		 double sum=0;
		 for (int i = 0; i < numb.length; i++) {
	            sum += numb[i];}
		return (sum/numb.length);

}}
