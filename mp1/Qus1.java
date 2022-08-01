package mp1;

import java.sql.*;
import java.util.Scanner;

public class Qus1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your option : Insert, Read, Update, Delete");
		String option = sc.nextLine();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.18.245:3306/javadb_167", "javadb_167",
					"ben#u62000");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tasks");
			switch (option) {
			case "Insert": {
				int result = stmt.executeUpdate(
						"INSERT into tasks values(02,'registration','26-07-2022','28-07-2022','pending','high','to be tested')");
				System.out.println("Inserted");
				break;
			}
			case "Update": {
				int result = stmt.executeUpdate("UPDATE tasks set status='pending' WHERE task_id=1");
				System.out.println("Updated");
				break;
			}
			case "Delete": {
				int result = stmt.executeUpdate("Delete from tasks where task_id=1");
				System.out.println("Deleted");
				break;
			}
			case "Read": {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
				}
				break;
			}
			default: {
				System.out.println("Invalid entery");
				break;
			}
			}

		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}

	}

}
