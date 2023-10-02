import java.sql.*;

public class Createtable {
	public static void main(String args[]) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandeshwar_soni", "root", "root");
			String s = "create table JFSJD1(rollno int, sname varchar(20), subject varchar(6))";
			Statement stmt = con.createStatement();

			stmt.executeUpdate(s);
			System.out.println("table created succesfully");

			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Sorry Something went wrong" + e);
		}
	}
}