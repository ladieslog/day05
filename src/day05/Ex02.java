package day05;

public class Ex02 {
	public static void main(String[] args) {
		int su=1, sum=0,i=0;
		for (; su<=10;) {
			sum+=su;
			su++;
		}
		System.out.println("1~10 ÇÕ :"+sum);
		for(i=0;i<9;i+=2) {
			System.out.println("½ÇÇà ");
		}
	}
}
