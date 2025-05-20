package week2;

import java.util.Scanner;

public class SingleInteger {

	public  static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a integer");
		int a= sc.nextInt();
		sc.close();
		
		if(a<=0) {
			System.out.println("Please enter a positive integer.");
            return;
		}
		int terms =(a%2==1)?a:(a-1);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<terms;i++) {
			int odd= 2*i+1;
			sb.append(odd);
			if(i<terms-1)
			{
				sb.append(",");
			}
		}

        System.out.println(sb.toString());
	}
}
