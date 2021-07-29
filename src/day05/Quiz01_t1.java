package day05;

public class Quiz01_t1 {
	public static void main(String[] args) {
		int i,j,k,l,n=1,sum=0;
		for(j=1;j<5;j++) {
			System.out.println(j+". hello");
		}
		System.out.println("\n");
		for(i=1;i<100;i++) {
			sum=sum+i;
			if(sum==528) {
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("\n");
		
		
		for(k=0;k<5;k++) {
			for(l=0;l<5;l++) {
				System.out.print(String.format("%2d",n++)+" ");
			}
			System.out.println();
		}
		
		
	}
}
