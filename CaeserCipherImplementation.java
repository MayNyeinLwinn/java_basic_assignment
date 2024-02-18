package com.jdc.basic.assignment;

import java.util.Scanner;

public class CaeserCipherImplementation {

	static Scanner sc = new Scanner(System.in);
	static int choice, algoNumber;

	public static void main(String[] args) {

		greeting("Caesar Cipher");

		boolean input = true;
		try {
			do {
				System.out.println();
				System.out.println("1. Encryption" + "\n" + "2. Decryption");
				System.out.println();
				System.out.print("Choose 1 or 2 : ");

				choice = sc.nextInt();

				if (choice == 1) {

					boolean algo = true;

					do {
						System.out.println();
						System.out.print("Enter Algorithm number [1-20] : ");

						algoNumber = sc.nextInt();

						if (algoNumber < 1 || algoNumber > 20) {

							System.out.println();
							System.out.println("Please enter correct algorithm number!!");

							algo = true;

						} else {
							sc.nextLine();

							System.out.println();
							System.out.print("Enter you want to encrypt : ");

							String encryptWords = sc.nextLine();

							convertEncrypt(encryptWords, algoNumber);

							greeting("Thank You");

							algo = false;
						}
					} while (algo);

					input = false;
					
				} else if (choice == 2) {

					boolean algo = true;

					do {
						System.out.println();
						System.out.print("Enter Algorithm number [1-20] : ");

						algoNumber = sc.nextInt();

						if (algoNumber < 1 || algoNumber > 20) {
							System.out.println();
							System.out.println("Please enter correct algorithm number!!");

							algo = true;

						} else {
							sc.nextLine();

							System.out.println();
							System.out.print("Enter you want to decrypt : ");

							String decryptWords = sc.nextLine();

							convertDecrypt(decryptWords, algoNumber);

							greeting("Thank You");
							
							algo = false;
						}
					} while (algo);

					input = false;

				} else {
					System.out.println();
					System.out.println("The code you enter is wrong. Please enter again.");
					input = true;
				}
			} while (input != false);

		} catch (Exception e) {
			System.out.println();
			System.out.println("Please enter correct number!");
		}
	}

	static void convertEncrypt(String encryptWords, int algoNumber) {
//		System.out.println(encryptWords + "\t" + algoNumber);

		String convertEncrypt = "";

		for (int i = 0, l = encryptWords.length(); i < l; i++) {
			char ch = encryptWords.charAt(i);
			ch += algoNumber;
			convertEncrypt = convertEncrypt + ch;
		}

		System.out.println();
		System.out.println("Original value is : " + encryptWords);
		System.out.println("Encrypt value is : " + convertEncrypt);
	}

	static void convertDecrypt(String decryptWords, int algoNumber) {
//		System.out.println(decryptWords + "\t" + algoNumber);

		String convertDecrypt = "";

		for (int i = 0, l = decryptWords.length(); i < l; i++) {
			char ch = decryptWords.charAt(i);
			ch -= algoNumber;
			convertDecrypt = convertDecrypt + ch;
		}

		System.out.println();
		System.out.println("Original value is : " + decryptWords);
		System.out.println("Decrypt value is : " + convertDecrypt);
	}

	static void greeting(String message) {

		String star = "";

		for (int i = 0, l = message.length(); i < l; i++) {
			star += "*";
		}
		System.out.println();
		System.out.println("**".concat(star).concat("**"));
		System.out.println("**".concat(message).concat("**"));
		System.out.println("**".concat(star).concat("**"));
	}
}