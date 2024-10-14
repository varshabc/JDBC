import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class LaunchTransaction {
	
	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024", "root", "W7301@jqir*");
		Scanner scan = new Scanner(System.in);

		con.setAutoCommit(false);
		String s1 = "insert into Student values(?,?,?,?,?)";
		PreparedStatement pstmt1 = con.prepareStatement(s1);
		System.out.println("enter the id");
		int id = scan.nextInt();
		System.out.println("enter the name");
		String name = scan.next();
		System.out.println("enter the marks1");
		int marks1 = scan.nextInt();
		System.out.println("enter the marks2");
		int marks2 = scan.nextInt();
		System.out.println("enter the marks3");
		int marks3 = scan.nextInt();
		pstmt1.setInt(1,  id);
		pstmt1.setString(2, name);
		pstmt1.setInt(3, marks1);
		pstmt1.setInt(4, marks2);
		pstmt1.setInt(5, marks3);
		pstmt1.executeUpdate();
		
		String s2 = "insert into Student values(?,?,?,?,?)";
		PreparedStatement pstmt2 = con.prepareStatement(s2);
		System.out.println("enter the id");
		int id2 = scan.nextInt();
		System.out.println("enter the name");
		String name2 = scan.next();
		System.out.println("enter the marks1");
		int marks12 = scan.nextInt();
		System.out.println("enter the marks2");
		int marks22 = scan.nextInt();
		System.out.println("enter the marks3");
		int marks32 = scan.nextInt();
		pstmt2.setInt(1,  id2);
		pstmt2.setString(2, name2);
		pstmt2.setInt(3, marks12);
		pstmt2.setInt(4, marks22);
		pstmt2.setInt(5, marks32);
		pstmt2.executeUpdate();
		con.commit();
		
	}
	
}	
		
		
