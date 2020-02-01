package application;

import java.util.Scanner;

import entities.PasswordGenerator;

public class MainProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option;

		PasswordGenerator password = new PasswordGenerator();

		// Ask user what option of service

		do {
			System.out.println("\n__ CHOOSE YOUR SERVICE ABOVE __\n ");
			System.out.println("1 - Medical Exam");
			System.out.println("2 - Collect");
			System.out.println("3 - Exam results");
			System.out.println("4 - Priorital attendance");
			System.out.println("5 - Others services");
			System.out.println("6 - Cancel");
			System.out.println();
			System.out.print("Enter option: ");
			option = sc.nextInt();

			// Verify option and display password
			switch (option) {
			case 1:
				password.nextExamPassword();
				break;
			case 2:
				password.nextCollectPassword();
				break;
			case 3:
				password.nextResultPassword();
				break;
			case 4:
				password.nextPrioritalPassword();
				break;
			case 5:
				password.nextOtherPassword();
				break;
			case 6:
				System.out.println("Good-bye!");
				break;
			default:
				System.out.println("Invalid option!");
				break;
			}

		} while (option != 6);

	}

}
