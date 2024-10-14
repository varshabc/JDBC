package jdbc;
import java.DriverManager;
import java.SQLException;
public class demo1 {
	public static void main(String[] args) throws Exception {
		java.sql.DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()));
		System.out.println("Driver loaded successfually");
	}
}
