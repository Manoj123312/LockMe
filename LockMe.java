package com.caltech.file.project;

import java.util.*;
import java.io.*;

class LockMe {
	private String PATH = "D:\\phase1projectfiles\\";
	File file = new File(PATH);
	Scanner sc = new Scanner(System.in);

	/* Display files in Ascending order */
	public void displayFilesinAscedingOrder() {
		/* Display Operation */
		File filenames[] = file.listFiles();
		System.out.println("The list of files in asscending order in the " + PATH + "is");
		for (File filename : filenames) {
			System.out.println(filename.getName());
		}

	}

	/* Switch code for file operations */
	public void fileOperation() throws IOException {
		while (true) {
			System.out.println("Enter you sub choice");
			char choice = sc.next().charAt(0);
			if (choice == 'd') {
				break;
			}
			switch (choice) {
			case 'a':
				this.addFile();
				break;
			case 'b':
				this.deleteFile();
				break;
			case 'c':
				this.searchFile();
				break;
			case 'd':
				break;
			default:
				System.out.println("You have selected incorrect sub menu option. Please check and enter valid sub choice!!");
				break;
			}

		}

	}

	/* Add File function */
	private void addFile() throws IOException {
		System.out.println("Enter the file name to be created");
		String create_file_name = sc.next();
		String create_file_path = String.format("%s%s", PATH, create_file_name);
		System.out.println(create_file_path);
		/* Create a file operation */
		File create_new_file = new File(create_file_path);
		boolean res = create_new_file.createNewFile();
		if (res != true) {
			System.out.println("File is not created");

		} else {
			System.out.println("File is created ");

		}
	}

	/* Delete File Function */
	private void deleteFile() {
		System.out.println("Enter the file name to be deleted");
		String delete_file_name = sc.next();
		String delete_file_path = PATH + delete_file_name;
		System.out.println(delete_file_path);
		File delete_file = new File(delete_file_path);
		/* Delete Operation */
		boolean del = delete_file.delete();
		if (del == true) {
			System.out.println("File gets deleted");

		} else {
			System.out.println("No such file in the path");
		}
	}

	/* Search a file operation */
	private void searchFile() {
		System.out.println("Enter the file to search");
		String search_file_name = sc.next();
		/* Display Operation */
		File searchfilenames[] = file.listFiles();
		int flag = 0;
		for (File searchfile : searchfilenames) {
			if (searchfile.getName().equals(search_file_name)) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println("File is found");
		} else {
			System.out.println("File is not found");
		}
	}
}
