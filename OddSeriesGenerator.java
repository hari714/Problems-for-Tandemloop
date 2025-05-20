package week2;

import java.util.Scanner;

public class OddSeriesGenerator {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a (integer):");
		int a = sc.nextInt();
		sc.close();

		
		if(a<=0) {
			System.out.println("please enter a Positive integer");
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			int odd =2*i+1;
			sb.append(odd);
			if(i<a-1) {
				sb.append(",");
			}
		}
		System.out.println(sb.toString());
		
	}
}
