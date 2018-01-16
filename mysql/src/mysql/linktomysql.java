package mysql;

import java.sql.*;


public class linktomysql {
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/new";
		String usr = "root";
		String pass = "jisjamjai@8";
		String query = "Select username from jissu where userid=2";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,usr,pass);
		Statement st = con.createStatement();
		//int rs = st.executeUpdate(query);
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name=rs.getString("username");
		System.out.println(name);
		st.close();
		con.close();
		}

}

