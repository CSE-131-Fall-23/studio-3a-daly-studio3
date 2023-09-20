package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		
		//deciding what n goes up to
		System.out.print("How many items will be sieved (up to but not including)?");
		Scanner in = new Scanner(System.in);
		int numberOfItems = in.nextInt();
		
		//declaring the array
		boolean[] numericals;
		numericals = new boolean[numberOfItems];
		
		
		for (int i = 2; i < numericals.length; i++) {
			System.out.println( numericals[i] );
		
			for (int prime = 0 ; prime < i; prime++) {

				if (i / prime % 0) {
					numericals[i] = true;
				}
				else {
					numericals[i] = false;
				}
				
				
			}
		
		}
		
		System.out.println( numericals[i] );
	}

}
