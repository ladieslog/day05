package day05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int repet;
		System.out.println("�ݺ� Ƚ�� �Է�");
		repet = input.nextInt();
		for (int i =1 ; i<=repet; i++) {
			System.out.println(i+".�ݺ�");
		}
		System.out.println("===���ҽ� ===");
		for(int i=10;i>0;i--) {
			System.out.println(i+". ����");
		}
	}
}
