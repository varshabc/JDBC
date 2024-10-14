//create
package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class demo2 {
	public static void main(String[] args) throws Exception {
		java.sql.DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfually");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024","root","W7301@jqir*");
		System.out.println("connection established");
		String S="Select * from Student";
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(S);
		while(res.next()==true) {
			int Id=res.getInt(1);
			String name=res.getString(2);
			int marks1=res.getInt(3);
			int marks2=res.getInt(4);
			int marks3=res.getInt(5);
			System.out.println(Id+" "+name+" "+marks1+" "+marks2+" "+marks3+" ");
			
		}
	}
}
