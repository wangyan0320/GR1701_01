package com.saj;

public class Nnmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {

				sum += i;

			}

		}
		System.out.println(sum);

		int a = 1;
		int sam = 0;
		while (a < 100) {
			if (a % 2 != 0) {
				sam += a;
			}
			a++;
		}
		System.out.println(sam);

	}

}
