import java.sql.*;

public class deleteDemo
{
  public static void main(String args[])
 {
 try
{

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandeshwar_soni","root","root");
String sdelete="delete from jfsjd1 records";
Statement stmt = con.createStatement();

stmt.executeUpdate(sdelete);
System.out.println("Records Deleted from Table succesfully");

stmt.close();
con.close();
}
 catch(SQLException e) 
 {
     System.out.println("Error" +e);
 
 }
 }
 }