package star;

import java.util.Scanner;

public class CreateStar {
	public static void main(String[] args) {
		int count;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a value: ");
		count = in.nextInt();
		
		for(int i = count;i>0;i--) {
			for(int j=0;j<count-i;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
