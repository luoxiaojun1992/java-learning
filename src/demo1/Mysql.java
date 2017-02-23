package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver") ;   
		}catch(ClassNotFoundException e){   
			System.out.println("找不到驱动程序类 ，加载驱动失败！");   
			e.printStackTrace() ;   
		}
		
		String url = "jdbc:mysql://localhost:3306/sf" ;    
	     String username = "root" ;   
	     String password = "" ;   
	     try{   
	    	 Connection con = DriverManager.getConnection(url , username , password ) ;   
	    	 Statement stmt = con.createStatement();
	    	 ResultSet rs = stmt.executeQuery("SELECT * FROM eagle") ;   
	    	 while(rs.next()){   
	             String eagle_id = rs.getString("eagle_id") ;
	             System.out.println(eagle_id);
	         }
	    	 
	    	 rs.close();
	    	 stmt.close();
	    	 con.close();
	     }catch(SQLException se){   
	    	 System.out.println("数据库连接失败！");   
	    	 se.printStackTrace() ;   
	     }
	}
}
