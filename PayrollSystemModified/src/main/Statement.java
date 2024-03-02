package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Statement implements Salary {

	public void Calculate(int empId,Connection conn) {
		 String query = "SELECT SUM(amount) AS totalEarnings FROM salary WHERE empId = ?";
	        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
	            preparedStatement.setInt(1, empId);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                double totalEarnings = resultSet.getDouble("totalEarnings");
	                System.out.println("Total Earnings: $" + totalEarnings);
	            } else {
	                System.out.println("No earnings found for the employee.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	public void Calculate(int empId,Connection conn,int p) {
		 String query = "SELECT * FROM salary WHERE empId = ?";
	        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
	            preparedStatement.setInt(1, empId);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            System.out.println("\n=== Earnings Statement ===");
	            while (resultSet.next()) {
	                double amount = resultSet.getDouble("amount");
	                String method = resultSet.getString("method");
	                String date = resultSet.getString("date");

	                System.out.println("Amount: $" + amount);
	                System.out.println("Payment Method: " + method);
	                System.out.println("Date: " + date);
	                System.out.println("------------------------");
	            }
	            System.out.println("=========================");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
}
