package day05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int repet;
		System.out.println("반복 횟수 입력");
		repet = input.nextInt();
		for (int i =1 ; i<=repet; i++) {
			System.out.println(i+".반복");
		}
		System.out.println("===감소식 ===");
		for(int i=10;i>0;i--) {
			System.out.println(i+". 실행");
		}
	}
}
