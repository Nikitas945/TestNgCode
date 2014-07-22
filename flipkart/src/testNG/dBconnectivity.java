package testNG;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class dBconnectivity {

	
	

		public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		//Resgister the driver through
			
//			System.setProperty("java.net.preferIPv6Addresses", "true");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

		//Create the connection and assign to connection reference
		Connection con =null;
		try {
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=testAdmin;password=test@1234;database=abhiDb");
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			return;
		}
		
//		user=testAdmin;password=test@1234
//		jdbc:mysql://localhost:3306/hoale
		if(null == con) {
			return;
		}
		//create a statement through connection reference and assign to statement reference
		Statement stmt=con.createStatement();

		//call the executequery method through statement reference and pass the query as argument.
		ResultSet rs=stmt.executeQuery("select * from emp where name like '%ab%' ");

		System.out.println("query is executed");

		while(rs.next()){
		String DeptName=rs.getString(1);
		int DeptId=rs.getInt(2);
		String LastName=rs.getString(4);
		System.out.println(DeptName+"\t"+DeptId+"\t"+LastName);

		}

		}

}
