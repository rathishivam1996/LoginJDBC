package org.shivam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.shivam.beans.RegistrationBean;

public class RegistrationDao {

	public int registerUser(RegistrationBean registrationBean) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO user" + "  (first_name, last_name, username, password) VALUES "
				+ " (?, ?, ?, ?);";

		int result = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false",
				"root", "745826");

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
//			preparedStatement.setInt(1, 1);
			preparedStatement.setString(1, registrationBean.getFirstName());
			preparedStatement.setString(2, registrationBean.getLastName());
			preparedStatement.setString(3, registrationBean.getUsername());
			preparedStatement.setString(4, registrationBean.getPassword());

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		return result;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}
