import java.io.*;
import java.sql.*;

public class InsertDemo {
	public static void main(String args[]) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandeshwar_soni", "root", "root");
			String sinsert = "insert into jfsjd1 values (10,'Abhsihek Yadav','Ej'),(11,'Ayush Mishra','IOT'),(12,'Vivek Dubey','SPM'),(13,'Nandeshwar Soni','AWP')";
			Statement stmt = con.createStatement();

			stmt.executeUpdate(sinsert);
			System.out.println("record inserted succesfully in respected table Thank you ");
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error" + e);
		}
	}
}