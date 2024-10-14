//program to update student name
package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024","root","W7301@jqir*");
		System.out.println("connection established successfully");
		
		String s = "update Student set name=? where id=?";
		PreparedStatement pstmt = con.prepareStatement(s);
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the name");
		String name =scan.next();
		System.out.println("enter the id");
		int id= scan.nextInt();
		
		pstmt.setString(1, name);;
		pstmt.setInt(2, id);
		
		int rows=pstmt.executeUpdate();
		System.out.println(rows);
		
	
	}

}
