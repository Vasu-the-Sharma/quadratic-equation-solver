package hackerblocks;

import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int d = (b * b) - (4 * (a * c));
		if (d <= 0) {
			System.out.println("Imaginary");
		} else {

			int s = (int) Math.sqrt(d);

			int roota = (-b + s) / (2 * a);
			int rootb = (-b - s) / (2 * a);

			if (roota == rootb) {
				System.out.println("Real and Equal");
				System.out.println(roota + " " + rootb);
			} else
				System.out.println("Real and Distinct");

			if (roota > rootb) {
				System.out.println(rootb + " " + roota);
			} else
				System.out.println(roota + " " + rootb);
		}

	}

}
