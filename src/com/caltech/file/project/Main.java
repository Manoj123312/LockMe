package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		LockMe lock_me = new LockMe();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("************ WELCOME TO LOCKME.COM ************");
			System.out.println("MENU:");
			System.out.println("1. Show all the files in ascending order");
			System.out.println(
					"2. Sub-Menu:\n     a. Add a file \n     b. Delete a file \n     c. Search a file \n     d. Exit");
			System.out.println("3. Exit from the menu \n");
			System.out.println(" Enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				lock_me.displayFilesinAscedingOrder();
				break;
			case 2:
				lock_me.fileOperation();
				break;
			case 3:
				System.out.println("System is shutting down!!!!");
				System.exit(0);
			default:
				System.out.println("You have selected incorrect menu option. Please select valid menu option!!");
				break;

			}

		}

	}

}
