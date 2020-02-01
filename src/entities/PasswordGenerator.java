package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PasswordGenerator {

	public static int examPassword = 99, collectPassword = 199, resultPassword = 299, prioritalPassword = 399,
			otherPasswords = 499;

	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public PasswordGenerator() {

	}

	public void nextExamPassword() {
		examPassword += 1;
		displayPassword("exam");
		System.out.println("Your password: " + examPassword);
	}

	public void nextCollectPassword() {
		collectPassword += 1;
		displayPassword("collect");
		System.out.println("Your password: " + collectPassword);
	}

	public void nextResultPassword() {
		resultPassword += 1;
		displayPassword("exam results");
		System.out.println("Your password: " + resultPassword);
	}

	public void nextPrioritalPassword() {
		prioritalPassword += 1;
		displayPassword("priorital attendance");
		System.out.println("Your password: " + prioritalPassword);
	}

	public void nextOtherPassword() {
		otherPasswords += 1;
		displayPassword("other services");
		System.out.println("Your password: " + otherPasswords);
	}
	
	public void displayPassword(String service) {
		System.out.println("--------------------------------------------------");
		System.out.println("****" +service.toUpperCase()+ "****");
		System.out.println("Requested in: " + sdf.format(calendar.getTime()));
		
	}

}
