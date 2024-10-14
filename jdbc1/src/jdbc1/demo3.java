//program for accessing an individual student details
package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class demo3 {
	public static void main(String[] args) throws Exception {
		java.sql.DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfually");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024","root","W7301@jqir*");
		System.out.println("connection established");
		String S="Select * from Student where id=?";
		PreparedStatement pstmt=con.prepareStatement(S);
		System.out.println("enter the id");
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		pstmt.setInt(1, id);
		ResultSet res=pstmt.executeQuery();
		if(res.next()==true) {
			id=res.getInt(1);
			String name=res.getString(2);
			int marks1=res.getInt(3);
			int marks2=res.getInt(4);
			int marks3=res.getInt(5);
			System.out.println(id+" "+name+" "+marks1+" "+marks2+" "+marks3+" ");
		}
		else {
			System.out.println("invalid id");
		}
	}
}
		
      

