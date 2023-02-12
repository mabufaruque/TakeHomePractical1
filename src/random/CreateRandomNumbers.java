package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreateRandomNumbers {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] arr = new int[500];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(1000);

		}
		Arrays.sort(arr);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Nth smallest number: ");
		int number = sc.nextInt();
		System.out.println("The " + number + "th smallest number is: " + arr[number - 1]);
	}

}
