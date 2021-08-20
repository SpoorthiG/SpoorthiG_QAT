import java.sql.*;


public class JDBCTestSolution {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String username = "SYSTEM";
		String password = "root";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		String updateQuery = "update Worker set name='jk', dob = '01-sep-1997' where id=3";
		stmt.execute(updateQuery);
		
		ResultSet rs = stmt.executeQuery("SELECT * from Worker");
		
		System.out.println(rs);
		while(rs.next()){
			System.out.println(rs.getString("id")+":"+rs.getString("name")+":"+rs.getString("dob"));
			
			
		}
		con.close();

	}

}
