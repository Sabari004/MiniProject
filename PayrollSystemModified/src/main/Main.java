package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
	    UserPayrollSystem userPayrollSystem = new UserPayrollSystem();
	    AdminPayrollSystem adminPayrollSystem = new AdminPayrollSystem();

	    Scanner scanner = new Scanner(System.in);
	    while (true) {
	    	System.out.println(".__                          ________                            ._. \r\n"
	    			+ "|  |__    ____  ___.__.     /  _____/  __ __  ___.__.  ______    | | \r\n"
	    			+ "|  |  \\ _/ __ \\<   |  |    /   \\  ___ |  |  \\<   |  | /  ___/    | | \r\n"
	    			+ "|   Y  \\\\  ___/ \\___  |    \\    \\_\\  \\|  |  / \\___  | \\___ \\      \\| \r\n"
	    			+ "|___|  / \\___  >/ ____|     \\______  /|____/  / ____|/____  >     __ \r\n"
	    			+ "     \\/      \\/ \\/                 \\/         \\/          \\/      \\/ \r\n"
	    			+ "                                                                     ");
	        System.out.println("\nSelect Role:");
	        System.out.println("1. Admin");
	        System.out.println("2. User");
	        System.out.println("3. Exit");
	        System.out.print("Enter your choice (1/2/3): ");

	        int choice = scanner.nextInt();
	        scanner.nextLine(); 

	        switch (choice) {
	            case 1:
	                adminPayrollSystem.login();
//	                adminPayrollSystem.adminDashboard();
	                break;
	            case 2:
	                userPayrollSystem.login();
//	                userPayrollSystem.userDashboard();
	                break;
	            case 3:
	            	System.out.println("  __   .__                      __                ._. \r\n"
	            			+ "_/  |_ |  |__  _____     ____  |  | __  ______    | | \r\n"
	            			+ "\\   __\\|  |  \\ \\__  \\   /    \\ |  |/ / /  ___/    | | \r\n"
	            			+ " |  |  |   Y  \\ / __ \\_|   |  \\|    <  \\___ \\      \\| \r\n"
	            			+ " |__|  |___|  /(____  /|___|  /|__|_ \\/____  >     __ \r\n"
	            			+ "            \\/      \\/      \\/      \\/     \\/      \\/ \r\n"
	            			+ "                                                      ");
	                System.out.println("Exiting the program.");
	                scanner.close();
	                System.exit(0);
	            default:
	            	 System.out.println("Invalid choice. Please try again.\n");
	        }
	    }
	}

}
